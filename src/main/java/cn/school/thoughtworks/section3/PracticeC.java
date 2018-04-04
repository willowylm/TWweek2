package cn.school.thoughtworks.section3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

         Map<String, Integer> collection3= new HashMap<String, Integer>();
        for(String m:collectionA){
            if(collection3.get(m)==null)
            {
                collection3.put(m,1);
            }
            else
            {
                collection3.put(m,collection3.get(m)+1);
            }
        }

        String[] str= object.get("value").toArray(new String[0]);
        Map<String, Integer> Result = new HashMap<String, Integer>();
        for (String s1:collection3.keySet())
        {
            for(String s2 : str)
            {
                if(s1 == s2)
                {
                    if (collection3.get(s1)>=3) {
                        int n=collection3.get(s1)/3;
                        int v=collection3.get(s1)-n;
                        Result.put(s1,v);
                        break;
                    }
                }
                else
                {
                    Result.put(s1,collection3.get(s1));
                }
            }
        }
        return Result;
    }
}
