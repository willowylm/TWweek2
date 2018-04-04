package cn.school.thoughtworks.section1;

import java.util.*;
import java.util.List;import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
		 List<String> collection3 = new ArrayList<>();
        for (String s1 : collection1) {
            for (List<String> s2 : collection2.values())
			{
                if (s1.equals(s2)) {
                    collection3.add(s1);
                    break;
                }
			}

        }
        return collection3;
    }
}
