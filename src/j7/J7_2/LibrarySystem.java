package j7.J7_2;

public class LibrarySystem {
    private static class Book {
        String title;
        String author;
        int year;
        boolean isAvailable;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isAvailable = true;
        }

        @Override
        public String toString() {
            return String.format("%s - %s (%d) [%s]",
                    title, author, year, isAvailable ? "대출가능" : "대출중");
        }
    }

    private Book[] books;
    private int bookCount;

    public LibrarySystem(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // TODO: 책 추가 메서드를 작성하세요
    public boolean addBook(String title, String author, int year) {
        if (bookCount >= books.length) {
            System.out.println("도서관이 가득 찼습니다!");
            return false;
        }
        books[bookCount] = new Book(title, author, year);
        bookCount++;
        System.out.println("책 추가됨: " + title);
        return true;
    }

    // TODO: 책 제거 메서드를 작성하세요 (순서 유지)
    public boolean removeBook(String title) {
        int index = findBookIndex(title);
        if (index == -1) {
            System.out.println("책을 찾을 수 없습니다: " + title);
            return false;
        }
        // 뒤의 책들을 앞으로 한 칸씩 이동
        for (int i = index; i < bookCount - 1; i++) {
            books[i] = books[i + 1];
        }
        bookCount--;
        books[bookCount] = null; // 마지막 요소를 null로 설정
        System.out.println("책 제거됨: " + title);
        return true;
    }

    // TODO: 책 검색 헬퍼 메서드를 작성하세요
    private int findBookIndex(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1; // 찾지 못함
    }

    // TODO: 대출 처리 메서드를 작성하세요
    public boolean borrowBook(String title) {
        int index = findBookIndex(title);
        if (index == -1) {
            System.out.println("대출하려는 책이 없습니다: " + title);
            return false;
        }
        if (!books[index].isAvailable) {
            System.out.println("이미 대출 중입니다: " + title);
            return false;
        }
        books[index].isAvailable = false;
        System.out.println("대출 완료: " + title);
        return true;
    }

    // TODO: 반납 처리 메서드를 작성하세요
    public boolean returnBook(String title) {
        int index = findBookIndex(title);
        if (index == -1) {
            System.out.println("반납하려는 책이 없습니다: " + title);
            return false;
        }
        if (books[index].isAvailable) {
            System.out.println("이미 반납된 상태입니다: " + title);
            return false;
        }
        books[index].isAvailable = true;
        System.out.println("반납 완료: " + title);
        return true;
    }

    // TODO: 전체 도서 목록 출력 메서드를 작성하세요
    public void listAllBooks() {
        System.out.printf("\n=== 도서 목록 (총 %d권) ===\n", bookCount);
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i].toString());
        }
    }

    // TODO: 대출 가능한 책만 출력하는 메서드를 작성하세요
    public void listAvailableBooks() {
        System.out.println("\n=== 대출 가능한 도서 ===");
        int availableCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable) {
                System.out.println("- " + books[i].toString());
                availableCount++;
            }
        }
        System.out.println("대출 가능: " + availableCount + "권");
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem(10);
        library.addBook("자바의 정석", "남궁성", 2020);
        library.addBook("이펙티브 자바", "조슈아 블로크", 2018);
        library.addBook("클린 코드", "로버트 마틴", 2013);
        library.addBook("디자인 패턴", "GoF", 1994);
        library.listAllBooks();
        library.borrowBook("자바의 정석");
        library.borrowBook("클린 코드");
        library.borrowBook("자바의 정석");
        library.listAvailableBooks();
        library.returnBook("자바의 정석");
        library.removeBook("디자인 패턴");
        library.listAllBooks();
    }
}