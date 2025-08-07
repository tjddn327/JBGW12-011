package j5.j5_7.file;

// 파일 시스템 테스트
public class FileSystemTest {
    public static void main(String[] args) {
        // TODO 111: 디렉토리와 파일 생성하기
        // root 디렉토리: "root", "/"
        // readme 파일: "README.txt", "/README.txt"
        // readme에 "이것은 읽어보기 파일입니다." 쓰기
        SimpleDirectory root = new SimpleDirectory("root", "/");
        TextFile readme = new TextFile("README.txt", "/README.txt");
        readme.writeString("이것은 읽어보기 파일입니다.");

        // TODO 112: 파일 시스템 구성하기
        // root에 readme 추가
        root.addItem(readme);

        // TODO 113: 파일 시스템 정보 출력하기
        // "=== 파일 시스템 내용 ==="
        // root 디렉토리 이름과 크기 출력
        // readme 파일 이름, 크기, 내용 출력
        System.out.println("=== 파일 시스템 내용 ===");
        System.out.println("디렉토리: " + root.getName() + " (" + root.getSize() + " bytes)");

        for (FileSystemItem item : root.listItems()) {
            if (item instanceof File) {
                File file = (File) item;
                System.out.println("파일: " + file.getName() + " (" + file.getSize() + " bytes)");
                System.out.println("내용: " + file.readAsString());
            }
        }
    }
}