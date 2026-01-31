package java_lecture.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice8_3 {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // 1. 생성자 사용 (얕은 복사)
        ArrayList<String> copy1 = new ArrayList<>(original);

        // 2. addAll 사용
        ArrayList<String> copy2 = new ArrayList<>();
        copy2.addAll(original);

        // 3. clone() 사용
        ArrayList<String> copy3 = (ArrayList<String>) original.clone();

        // 4. Stream 사용 (Java 8+)
        List<String> copy4 = original.stream().collect(Collectors.toList());

        // 주의: 모두 얕은 복사 (객체 참조 공유)
        // 깊은 복사가 필요하면 각 요소를 직접 복사해야 함
    }
}
