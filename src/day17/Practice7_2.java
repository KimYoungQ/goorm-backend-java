package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Practice7_2 {
    public static void main(String[] args) {

        /**
         * 잘못된 방법 - ConcurrentModificationException 발생!
         * 반복 중에 컬렉션을 직접 수정하면
         * Iterator가 감시하던 구조(컬렉션)가 바뀌어서 예외 발생
         * ArrayList 내부에는 modCount라는 요소가 추가/삭제될 때마다 modCount++;
         * Iterator는 생성될 때 이 값을 저장해 두는데
         * remove 호출시 modCount 값이 바뀌어 Iterator이 생성한 값과 일치하지 않게 되어 에러 발생
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer num : numbers) {
            numbers.remove(num);
        }

        // 방법 1: Iterator 사용
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();  // Iterator의 remove() 사용
            }
        }

        // 방법 2: removeIf 사용 (Java 8+) - 가장 깔끔!
        numbers.removeIf(num -> num % 2 == 0);

        // 방법 3: 역순 for문 (인덱스 사용)
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
    }
}
