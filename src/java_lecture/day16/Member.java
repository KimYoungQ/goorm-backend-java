package java_lecture.day16;

public class Member {
    private String name;
    private int age;

    public void setAge(int age) throws InvaildAgeException {
        if (age < 0 || age > 150) {
            throw new InvaildAgeException("나이는 0~150 사이여야 합니다." + age);
        }
        this.age = age;
    }
}
