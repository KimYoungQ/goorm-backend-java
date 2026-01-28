package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice8_2 {
    public static void main(String[] args) {

        // 수정 불가능한 리스트 (읽기 전용)

        // 방법 1 : Collections.unmodifiableList()
        List<String> orignal = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> immutable = Collections.unmodifiableList(orignal);

        // 방법 2 : List.of (Java 9+)
        List<String> immutable2 = List.of("A", "B", "C");

        // 방법 3 : Arrays.asList() - 크기 변경만 불가
        List<String> fixed = Arrays.asList("A", "B", "C");
        // fixed.add("D");  // UnsupportedOperationException
        fixed.set(0, "2");  // 수정은 가능
    }
}
