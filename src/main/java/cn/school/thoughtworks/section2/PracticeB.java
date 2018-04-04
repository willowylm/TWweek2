package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

 Map<String, Integer> Result = new HashMap<String, Integer>();
        for(String m:collection1){
            if(m.contains("-"))
            {
                String[] Str = m.split("-");
                String keyStr = Str[0];
                int valueStr = Integer.valueOf(Str[1]);
                Result.put(keyStr,valueStr);
            }
            else {
                if (Result.get(m) == null) {
                    Result.put(m, 1);
                } else {
                    Result.put(m, Result.get(m) + 1);
                }
            }
        }

        return Result;
    }
}
