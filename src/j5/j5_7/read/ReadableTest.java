package j5.j5_7.read;

// 테스트 클래스
public class ReadableTest {
    public static void main(String[] args) {
        // TODO 36: StringReader 테스트하기
        // "Hello World\nJava Programming" 문자열로 생성
        // readLine()으로 첫 줄 읽고 출력
        // readWord()로 다음 단어 읽고 출력
        StringReader sr = new StringReader("Hello World\nJava Programming");
        sr.readLine();
        System.out.println("첫 줄: " + sr.readLine());
        sr.readWord();
        System.out.println("단어: " + sr.readWord());


        // TODO 37: StarPattern 테스트하기
        // StarPattern 객체 생성
        // readAll()로 전체 패턴 읽고 출력
        StarPattern sp = new StarPattern();
        sp.readAll();
    }
}