package j10.j10_2;

import java.util.*;

public class BookManagementSystem {
    
    static class Book {
        String isbn;
        String title;
        String author;
        String genre;
        int year;
        double rating;
        
        Book(String isbn, String title, String author, String genre, int year, double rating) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.year = year;
            this.rating = rating;
        }
        
        @Override
        public String toString() {
            return String.format("%s by %s (%.1f★)", title, author, rating);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Book book = (Book) obj;
            return isbn.equals(book.isbn);
        }
        
        @Override
        public int hashCode() {
            return isbn.hashCode();
        }
    }
    
    private Map<String, Book> bookDatabase;
    private Map<String, Set<Book>> booksByGenre;
    private Map<String, Set<Book>> booksByAuthor;
    private TreeSet<Book> booksByRating;
    private LinkedList<Book> recentlyAdded;
    private static final int RECENT_LIMIT = 10;
    
    public BookManagementSystem() {
        this.bookDatabase = new HashMap<>();
        this.booksByGenre = new HashMap<>();
        this.booksByAuthor = new HashMap<>();
        this.booksByRating = new TreeSet<>((b1, b2) -> {
            int ratingCompare = Double.compare(b2.rating, b1.rating); // 내림차순
            if (ratingCompare != 0) return ratingCompare;
            return b1.title.compareTo(b2.title); // 평점 같으면 제목 오름차순
        });
        this.recentlyAdded = new LinkedList<>();
    }
    
    // 도서 추가
    public void addBook(Book book) {
        // 1. bookDatabase에 ISBN 키로 도서 추가 (중복 ISBN은 덮어쓰기)
        bookDatabase.put(book.isbn, book);
        
        // 2. 장르별 분류 (genre -> Set<Book>)
        booksByGenre.computeIfAbsent(book.genre, k -> new HashSet<>()).add(book);
        
        // 3. 저자별 분류 (author -> Set<Book>)
        booksByAuthor.computeIfAbsent(book.author, k -> new HashSet<>()).add(book);
        
        // 4. 평점 기준 정렬된 집합에 추가
        booksByRating.add(book);
        
        // 5. 최근 추가 목록 관리
        recentlyAdded.addFirst(book); // 맨 앞에 추가
        if (recentlyAdded.size() > RECENT_LIMIT) {
            recentlyAdded.removeLast(); // 10개 초과하면 마지막 삭제
        }
    }
    
    // 장르별 도서 검색
    public List<Book> getBooksByGenre(String genre) {
        Set<Book> books = booksByGenre.getOrDefault(genre, Collections.emptySet());
        return new ArrayList<>(books);
    }
    
    // 저자별 도서 검색
    public List<Book> getBooksByAuthor(String author) {
        Set<Book> books = booksByAuthor.getOrDefault(author, Collections.emptySet());
        return new ArrayList<>(books);
    }
    
    // 평점 상위 N개 도서
    public List<Book> getTopRatedBooks(int n) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> it = booksByRating.iterator();
        while (it.hasNext() && result.size() < n) {
            result.add(it.next());
        }
        return result;
    }
    
    // 최근 추가된 도서 목록
    public List<Book> getRecentlyAddedBooks() {
        return new ArrayList<>(recentlyAdded);
    }
    
    // 통계 출력
    public void printStatistics() {
        System.out.println("=== 도서관 통계 ===");
        System.out.println("총 도서 수: " + bookDatabase.size());
        System.out.println("장르 수: " + booksByGenre.size());
        System.out.println("저자 수: " + booksByAuthor.size());
        
        System.out.println("\n장르별 도서 수:");
        booksByGenre.forEach((genre, books) -> 
            System.out.println("  " + genre + ": " + books.size() + "권")
        );
        
        String topAuthor = null;
        int maxBooks = 0;
        for (Map.Entry<String, Set<Book>> entry : booksByAuthor.entrySet()) {
            if (entry.getValue().size() > maxBooks) {
                maxBooks = entry.getValue().size();
                topAuthor = entry.getKey();
            }
        }
        System.out.println("\n가장 많은 책을 쓴 저자: " + topAuthor + " (" + maxBooks + "권)");
    }
    
    public static void main(String[] args) {
        BookManagementSystem system = new BookManagementSystem();
        
        system.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch", "Programming", 2018, 4.8));
        system.addBook(new Book("978-0135166307", "Clean Code", "Robert Martin", "Programming", 2008, 4.5));
        system.addBook(new Book("978-0201616224", "The Pragmatic Programmer", "Andrew Hunt", "Programming", 1999, 4.6));
        system.addBook(new Book("978-0596009205", "Head First Java", "Kathy Sierra", "Programming", 2005, 4.3));
        system.addBook(new Book("978-1617292545", "Spring in Action", "Craig Walls", "Programming", 2018, 4.4));
        system.addBook(new Book("978-0134494166", "Clean Architecture", "Robert Martin", "Programming", 2017, 4.7));
        
        system.printStatistics();
        
        System.out.println("\n=== 평점 상위 3개 도서 ===");
        List<Book> topRated = system.getTopRatedBooks(3);
        for (int i = 0; i < topRated.size(); i++) {
            System.out.println((i + 1) + ". " + topRated.get(i));
        }
        
        System.out.println("\n=== Robert Martin의 도서 ===");
        List<Book> martinBooks = system.getBooksByAuthor("Robert Martin");
        martinBooks.forEach(System.out::println);
        
        System.out.println("\n=== 최근 추가된 도서 ===");
        List<Book> recent = system.getRecentlyAddedBooks();
        recent.forEach(System.out::println);
    }
}
