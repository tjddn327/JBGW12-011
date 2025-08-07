package j5.j5_6.book;

/**
 * this를 사용하여 매개변수와 인스턴스 변수를 구분하는 예제
 */
public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;

    // 생성자에서 this 사용
    public Book(String title, String author, int pages, double price) {
        // TODO 1: this를 사용하여 매개변수와 인스턴스 변수 구분하기
        // 매개변수 title을 인스턴스 변수 title에 할당
        // 매개변수 author를 인스턴스 변수 author에 할당
        // 매개변수 pages를 인스턴스 변수 pages에 할당
        // 매개변수 price를 인스턴스 변수 price에 할당
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    // setter 메서드에서 this 사용
    public void setTitle(String title) {
        // TODO 2: this를 사용하여 title 설정하기
        this.title = title;
    }

    public void setPrice(double price) {
        // TODO 3: price가 0보다 크면 this.price에 설정하기
        if(price > 0){
            this.price = price;
        }
    }

    // this 없이도 가능한 경우 (이름이 다를 때)
    public void updatePrice(double newPrice) {
        price = newPrice;  // this.price와 동일
    }

    @Override
    public String toString() {
        // TODO 4: "책: [제목] (저자: [저자])" 형식으로 반환하기
        // this를 사용하여 인스턴스 변수에 접근

        return "책: " + this.title + "(저자: " + this.author + ")";
    }
}