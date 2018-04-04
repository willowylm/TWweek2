package cn.school.thoughtworks.section3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> Result = new HashMap<String, Integer>();
        String[] str= object.get("value").toArray(new String[0]);

        for (String s1:collectionA.keySet())
        {
            for(String s2 : str)
            {
                if(s1 == s2)
                {
                    if (collectionA.get(s1)>=3) {
                        int n=collectionA.get(s1)/3;
                        int v=collectionA.get(s1)-n;
                        Result.put(s1,v);
                        break;
                    }
                }
                else
                {
                    Result.put(s1,collectionA.get(s1));
                }
            }
        }
        return Result;
    }
}
