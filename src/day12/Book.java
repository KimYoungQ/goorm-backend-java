package day12;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int price;
    private boolean isBorrowed;

    // 생성자 : 필수 값만 파라미터로 받는다
    public Book(String isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isBorrowed = false;
    }

    // getter
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // setter
    public boolean borrow() {
        if(isBorrowed) {
            System.out.println("이미 대출 중인 도서입니다.");
            return false;
        }
        isBorrowed = true;
        System.out.println(title + " 대출 완료");
        return true;
    }

    public void returnBook() {
        if (!isBorrowed) {
            System.out.println("대출 중이 아닌 도서입니다.");
            return;
        }
        isBorrowed = false;
        System.out.println(title + " 반납 완료");
    }

    public void showInfo() {
        System.out.println("=== 도서 정보===");
        System.out.println("ISBN: " + isbn);
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println("상태: " + (isBorrowed ? "대출중" : "대출가능"));
    }
}
