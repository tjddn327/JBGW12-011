package j10.j10_1;

import java.util.*;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;
    
    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    // equals() 재정의
    @Override
    public boolean equals(Object obj) {
        // TODO: equals 메서드 구현
        // 1. 같은 객체인지 확인 (this == obj)
        if (this == obj) return true;
        // 2. null이거나 다른 클래스인지 확인
        if (obj == null || getClass() != obj.getClass()) return false;
        // 3. ISBN으로 비교
        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }
    
    // hashCode() 재정의 (equals()와 일관성 유지)
    @Override
    public int hashCode() {
        // TODO: ISBN의 hashCode 반환
        return isbn.hashCode();
    }
    
    @Override
    public String toString() {
        return String.format("'%s' by %s (%d)", title, author, year);
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("978-0134685991", "Effective Java 3rd", "Joshua Bloch", 2018);
        Book book3 = new Book("978-0132350884", "Clean Code", "Robert Martin", 2008);
        
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));
        
        HashSet<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book3);
        
        System.out.println("\nHashSet의 책들:");
        for (Book b : bookSet) {
            System.out.println(b);
        }
        
        System.out.println("\nISBN 978-0134685991 찾기: " + bookSet.contains(new Book("978-0134685991", "", "", 0)));
    }
}
