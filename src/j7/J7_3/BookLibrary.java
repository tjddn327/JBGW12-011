package j7.J7_3;

import java.util.ArrayList;

public class BookLibrary {
    static class Book {
        String title;
        String author;
        int year;
        double price;

        // TODO: 생성자를 작성하세요
        public Book(String title, String author, int year, double price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }

        // TODO: toString 메서드를 작성하세요
        @Override
        public String toString() {
            return String.format("%s - %s (%d) %.0f원", title, author, year, price);
        }
    }

    public static void main(String[] args) {
        // TODO: Book을 저장할 ArrayList를 생성하세요
        ArrayList<Book> library = new ArrayList<>();

        // TODO: 다음 도서들을 추가하세요
        library.add(new Book("자바의 정석", "남궁성", 2020, 30000));
        library.add(new Book("이펙티브 자바", "조슈아 블로크", 2018, 36000));
        library.add(new Book("클린 코드", "로버트 마틴", 2013, 29700));
        library.add(new Book("스프링 인 액션", "크레이그 월즈", 2020, 40000));

        // TODO: 전체 도서를 출력하세요
        System.out.println("=== 전체 도서 목록 ===");
        for (Book book : library) {
            System.out.println(book);
        }

        // TODO: "남궁성" 저자의 책을 찾아서 출력하세요
        System.out.println("\n=== 남궁성 저자의 책 ===");
        for (Book book : library) {
            if (book.author.equals("남궁성")) {
                System.out.println(book);
            }
        }

        // TODO: 30000원 이상의 책을 찾아서 출력하세요
        System.out.println("\n=== 30000원 이상의 책 ===");
        for (Book book : library) {
            if (book.price >= 30000) {
                System.out.println(book);
            }
        }

        // TODO: 2020년 이후 출간 도서를 찾아서 출력하세요
        System.out.println("\n=== 2020년 이후 출간 도서 ===");
        for (Book book : library) {
            if (book.year >= 2020) {
                System.out.println(book);
            }
        }

        // TODO: 모든 도서의 총 가격을 계산하세요
        double totalPrice = 0;
        for (Book book : library) {
            totalPrice += book.price;
        }
        System.out.println("\n도서 총 가격: " + totalPrice + "원");
    }
}