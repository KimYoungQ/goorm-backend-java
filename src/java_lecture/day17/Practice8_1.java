package java_lecture.day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice8_1 {
    public static void main(String[] args) {

        // 권장 : 인터페이스 타입으로 선언
        List<String> list = new ArrayList<>();

        // 나증에 구현체 변경이 쉬움
        List<String> list1 = new LinkedList<>();

        // 비권장: 구현체 타입으로 선언
        ArrayList<String> list2 = new ArrayList<>();
        // -> 나중에 LinkedList로 변경 시 코드 수정 많음
    }
}
