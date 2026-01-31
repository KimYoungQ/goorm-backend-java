package java_lecture.day12;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("111-1", "자바의 정석", "남궁성", 20000);

        System.out.println(book.getIsbn());
        System.out.println(book.getPrice());

        book.borrow();
        book.returnBook();
        book.showInfo();
    }

}
