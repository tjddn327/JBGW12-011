package j5.j5_1;

// 도서관 시스템 테스트
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // 도서 추가
        library.addBook("Java의 정석", "남궁성", "978-89-968088-0-1");
        library.addBook("Clean Code", "Robert C. Martin", "978-89-966260-2-3");
        library.addBook("Effective Java", "Joshua Bloch", "978-89-6848-047-4");
        library.addBook("Java Concurrency in Practice", "Brian Goetz", "978-89-6077-192-2");

        // 도서 검색
        library.searchByTitle("Java");

        // 대출 가능 목록
        library.showAvailableBooks();

        // 도서 대출
        Book book = library.findBookByISBN("978-89-968088-0-1");
        if (book != null) {
            book.borrowBook();
        }

        // 통계 표시
        library.showStatistics();
    }
}
