package java_lecture.day17.TodoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Todo> todos = new ArrayList<>();

    public void add(String task) {
        todos.add(new Todo(task));
    }

    public void complete(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.get(index).complete();
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
        }
    }

    public void printAll() {
        System.out.println("=== 할일 목록 ===");
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(i + ". " + todos.get(i));
        }
    }

    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.add("Java 공부하기");
        list.add("Spring 예제 실습");
        list.add("알고리즘 문제 풀기");

        list.printAll();

        list.complete(0);
        list.complete(2);

        System.out.println("\n완료 후:");
        list.printAll();
    }
}
