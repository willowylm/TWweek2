package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        
        
         Set<String> collec1Set = new HashSet<>(collectionA);
        Map<String, Integer> result = new HashMap<>();
        for (String i :collec1Set) {
            Integer num = Collections.frequency(collectionA, i);
            if(i.contains("-")){
                String[] splitStr = i.split("-");
                i = splitStr[0];
                num = Integer.valueOf(splitStr[1]);
            }
            result.put(i, num);
        }
        for(int i=0;i<object.get("value").size();i++) {
            int newkey=result.get(object.get("value").get(i));
            if (result.containsKey(object.get("value").get(i))) {
                newkey-=newkey/3;
                result.put(object.get("value").get(i),newkey);
            }
        }

        return result;

    }
}
