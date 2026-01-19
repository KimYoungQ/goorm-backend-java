package day10;

public class Person {
  String name;
  int age;
  String job;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name, int age, String job) {
    this.name = name;
    this.age = age;
    this.job = job;
  }

  public void introduce() {
    System.out.println("이름: " + name);
    System.out.println("나이: " + age);
    if (job != null) {
      System.out.println("직업: " + job);
    }
  }

  public void greet(String targetName) {
    System.out.println(name + "이(가) " + targetName + "에게 인사합니다.");
  }

}
