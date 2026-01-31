package java_lecture.day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list_set {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("오렌지");
        System.out.println(list);
        System.out.println(list.size());

        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("바나나");
        set.add("사과");
        System.out.println(set);
        System.out.println(set.size());
    }
}
