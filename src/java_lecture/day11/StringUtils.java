package java_lecture.day11;

public class StringUtils {
    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("=== 문자열 유틸리티 ===");
        System.out.println("원본: " + text);
        System.out.println("대문자: " + toUpperCase(text));
        System.out.println("소문자: " + toLowerCase(text));
        System.out.println("길이: " + length(text));
        System.out.println("뒤집기: " + reverse(text));
        System.out.println("공백 개수: " + countText(text, ' '));
        System.out.println("'o'의 개수: " + countText(text, 'o'));
    }

    /*
     *  문자열 변환 메서드
     */

    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }

    public static int length(String text) {
        return text.length();
    }

    public static String reverse(String text) {
        String reversedText = "";

        for (int i = text.length()-1; i >=0 ; i--) {
            reversedText += text.charAt(i);
        }

        return reversedText;
    }

    public static int countText(String text, char searchedText) {
        int countText = 0;

        for (int i = 0; i< text.length(); i++) {
            if (text.charAt(i) == searchedText) {
                countText++;
            }
        }

        return countText;
    }
}
