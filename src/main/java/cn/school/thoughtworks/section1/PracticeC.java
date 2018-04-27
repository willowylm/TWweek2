package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
       
        List<String> collection3=new ArrayList<>();
        List<String> collect2=collection2.get("value");
        for (int i = 0; i < collection1.size(); i++) {
            String key=collection1.get(i);
            if (collect2.contains(key)) {
                collection3.add(key);
            }
        }
        return collection3;

    }
}
