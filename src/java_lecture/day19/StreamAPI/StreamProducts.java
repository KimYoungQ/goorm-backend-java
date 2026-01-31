package java_lecture.day19.StreamAPI;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("노트북", "전자제품", 1500000),
                new Product("마우스", "전자제품", 35000),
                new Product("키보드", "전자제품", 89000),
                new Product("책상", "가구", 250000),
                new Product("의자", "가구", 180000),
                new Product("모니터", "전자제품", 350000),
                new Product("램프", "가구", 45000)
        );

        // 전자제품만 필터링
        System.out.println("=== 전자제품 ===");
        products.stream()
                .filter(p -> p.getCategory().equals("전자제품"))
                .forEach(System.out::println);

        // 가격순 정렬 (오름차순)
        System.out.println("\n=== 가격순 정렬 ===");
        products.stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .forEach(System.out::println);

        // 10만원 이하 상품
        System.out.println("\n=== 10만원 이하 ===");
        products.stream()
                .filter(p -> p.getPrice() <= 100000)
                .forEach(System.out::println);

        // 상품명만 추출
        System.out.println("\n=== 상품명 목록===");
        List<String> names =  products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        // 전자제품 총 가격
        int totalPrice = products.stream()
                .filter(p -> p.getCategory().equals("전자제품"))
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println("\n전자제품 총액: " + totalPrice + "원");

        // 평균 가격
        double avgPrice = products.stream()
                .mapToInt(Product::getPrice)
                .average()
                .orElse(0);
        System.out.println("\n평균 가격: " + (int)avgPrice + "원");

        // 카테고리별 그룹화
        System.out.println("\n=== 카테고리별 그룹 ===");
        Map<String, List<Product>> byCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        byCategory.forEach((cat, list) -> {
            System.out.println(cat + ": " + list.size() + "개");
        });

        // 가장 비싼 상품
        Product mostExpensive = products.stream()
                .max(Comparator.comparingInt(Product::getPrice))
                .orElse(null);
        System.out.println("\n가장 비싼 상품: " + mostExpensive);
    }

}
