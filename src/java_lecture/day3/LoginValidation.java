package java_lecture.day3;

public class LoginValidation {
    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234";

        String correctId = "admin";
        String correctPassword = "admin123";

        System.out.println("=== 방법 1: 중첩 if ====");

        if (inputId.equals(correctId)) {
            if (inputPassword.equals(correctPassword)) {
                System.out.println("로그인 성공");
                System.out.println("환영합니다, " + inputId + " 님!");
            } else {
                System.out.println("존재하지 않는 아이디입니다.");
            }
        }
    }
}
