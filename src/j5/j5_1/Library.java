package j5.j5_1;

/**
 * 도서관 클래스 - 여러 도서를 관리
 */
public class Library {
    private Book[] books;
    private int bookCount;
    private final int MAX_BOOKS = 100;

    // 생성자
    public Library() {
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }

    // 도서 추가
    public boolean addBook(String title, String author, String isbn) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("도서관이 가득 찼습니다.");
            return false;
        }

        // 새 도서 객체 생성
        Book newBook = new Book();
        newBook.title = title;
        newBook.author = author;
        newBook.isbn = isbn;
        newBook.pages = 0;  // 나중에 설정
        newBook.isAvailable = true;

        // 배열에 추가
        books[bookCount] = newBook;
        bookCount++;

        System.out.println("도서 '" + title + "'이(가) 추가되었습니다.");
        return true;
    }

    // ISBN으로 도서 찾기
    public Book findBookByISBN(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isbn.equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    // 제목으로 도서 검색 (부분 일치)
    public void searchByTitle(String keyword) {
        System.out.println("\n'" + keyword + "' 검색 결과:");
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("- " + books[i].title + " (" + books[i].author + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    // 대출 가능한 도서 목록
    public void showAvailableBooks() {
        System.out.println("\n=== 대출 가능한 도서 목록 ===");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable) {
                System.out.println((i + 1) + ". " + books[i].title +
                        " - " + books[i].author);
            }
        }
    }

    // 전체 도서 통계
    public void showStatistics() {
        int availableCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable) {
                availableCount++;
            }
        }

        System.out.println("\n=== 도서관 통계 ===");
        System.out.println("전체 도서 수: " + bookCount);
        System.out.println("대출 가능: " + availableCount);
        System.out.println("대출 중: " + (bookCount - availableCount));
    }
}

