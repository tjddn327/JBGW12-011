package j5.j5_1;

/**
 * 도서 정보를 관리하는 클래스
 */
public class Book {
    // TODO 11: 인스턴스 변수 선언하기
    // title(제목), author(저자), isbn, pages(페이지수), isAvailable(대출가능여부) 변수를 public으로 선언
    public String title;
    public String author;
    public String isbn;
    public int pages;
    public boolean isAvailable;

    // TODO 12: 도서 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "=== 도서 정보 ===" 출력
        // "제목: [제목]", "저자: [저자]", "ISBN: [isbn]", "페이지: [페이지수]" 출력
        // "대출 가능: [예/아니오]" 출력 (isAvailable이 true면 "예", false면 "아니오")
        System.out.println("=== 도서 정보 ===");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("ISBN:" + isbn);
        System.out.println("페이지: " + pages);
        if(isAvailable){
            System.out.println("대출 가능: 예");
            System.out.println();
        }else{
            System.out.println("대출 가능: 아니오");
            System.out.println();
        }

    }

    // TODO 13: 대출 처리 메서드 구현하기
    public void borrowBook() {
        // isAvailable이 true면:
        //   - isAvailable을 false로 변경
        //   - "'[제목]' 도서가 대출되었습니다." 출력
        // 아니면:
        //   - "'[제목]' 도서는 현재 대출 중입니다." 출력
        if(isAvailable){
            isAvailable = false;
            System.out.println("'" + title + "의 정석' 도서가 대출되었습니다.");
        }else{
            System.out.println("'" + title + "의 정석' 도서는 현재 대출 중입니다.");
        }
    }

    // TODO 14: 반납 처리 메서드 구현하기
    public void returnBook() {
        // isAvailable을 true로 변경
        // "'[제목]' 도서가 반납되었습니다." 출력
        isAvailable = true;
        System.out.println("'" + title + "의 정석' 도서가 반납되었습니다.");
    }
}