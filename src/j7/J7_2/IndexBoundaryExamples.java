package j7.J7_2;

public class IndexBoundaryExamples {
    public static void main(String[] args) {
        // 예제 1: 연속된 중복 찾기
        String[] words = {"apple", "banana", "banana", "cherry", "cherry", "cherry"};

        // ❌ 잘못된 방법
        try {
            boolean found = false;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(words[i + 1])) {  // 오류 발생!
                    found = true;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류 발생: " + e.getMessage());
        }

        // TODO: 올바른 방법으로 연속된 중복을 찾는 코드를 작성하세요
        // 힌트: 루프 조건을 words.length - 1로 설정
        boolean hasDuplicate = false;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                System.out.printf("중복 발견: %s (인덱스 %d, %d)\n", words[i], i, i + 1);
                hasDuplicate = true;
            }
        }

        if (!hasDuplicate) {
            System.out.println("연속된 중복이 없습니다.");
        }
    }
}