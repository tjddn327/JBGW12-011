package j5.j5_3;

/**
 * 책 정보를 나타내는 클래스
 */
public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;

    // TODO 30: 생성자 구현하기
    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.isAvailable = true;
    }

    // TODO 31: Getter 메서드들 구현하기
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    // TODO 32: toString() 메서드 재정의하기
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', pages=" + pages +
                ", price=" + price + "원, available=" + (isAvailable ? "O" : "X") + "}";
    }
}
