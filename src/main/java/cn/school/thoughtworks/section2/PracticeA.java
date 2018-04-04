package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> Result = new HashMap<String, Integer>();
        for(String m:collection1){
            if(Result.get(m)==null)
            {
                Result.put(m,1);
            }
            else
            {
                Result.put(m,Result.get(m)+1);
            }
        }

        return Result;
    }
}
