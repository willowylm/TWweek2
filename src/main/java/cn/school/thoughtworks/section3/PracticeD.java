package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for(String m:collectionA){
            if(m.contains("-"))
            {
                String[] Str = m.split("-");
                String keyStr = Str[0];
                int valueStr = Integer.valueOf(Str[1]);
                collection3.put(keyStr,valueStr+1);
            }
            else {
                if (collection3.get(m) == null) {
                    collection3.put(m, 1);
                } else {
                    collection3.put(m, collection3.get(m) + 1);
                }
           }
        }


        for(int i=0;i<object.get("value").size();i++)
        {
            int newKey=collection3.get(object.get("value").get(i));
            if (collection3.containsKey(object.get("value").get(i)))
            {
                if (newKey>=3) {
                    newKey-=newKey/3;
                    collection3.put(object.get("value").get(i),newKey);
                }
            }
        }

        return collection3;
    }
}
