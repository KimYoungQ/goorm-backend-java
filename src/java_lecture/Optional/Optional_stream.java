package java_lecture.Optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Optional_stream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

        Optional<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        System.out.println(result.orElse(0));
    }
}
