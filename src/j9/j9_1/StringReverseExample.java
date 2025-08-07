package j9.j9_1;

public class StringReverseExample {

    /**
     * 재귀를 사용한 문자열 뒤집기
     */
    public static String reverseString(String str) {
        // TODO 1: 기저 사례 구현
        // 힌트: 빈 문자열 또는 한 글자인 경우 그대로 반환
        if (str == null || str.isEmpty()){
            return str;
        }
        // TODO 2: 재귀 사례 구현
        // 힌트: 첫 글자를 맨 뒤로 보내고, 나머지는 재귀적으로 뒤집기
        // str.substring(1) - 첫 글자를 제외한 나머지
        // str.charAt(0) - 첫 글자

        return reverseString(str.substring(1)) + str.charAt(0); // 임시 반환값
    }

    /**
     * 회문(palindrome) 검사
     */
    public static boolean isPalindrome(String str) {
        // 전처리: 소문자 변환, 공백/특수문자 제거
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isPalindromeHelper(cleaned, 0, cleaned.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int left, int right) {
        // TODO 1: 기저 사례 - 포인터가 만나거나 교차

        // TODO 2: 양 끝 문자가 다르면 false

        // TODO 3: 재귀 호출 - 한 칸씩 안쪽으로

        return false; // 임시 반환값
    }

    public static void main(String[] args) {
        System.out.println("=== 문자열 뒤집기 예제 ===");

        // 실행 결과:
        // "hello" → "olleh"
        // "Java" → "avaJ"
        // "recursion" → "noisrucer"
        // "a" → "a"
        // "" → ""
        System.out.println("hello -> " + reverseString("hello"));
        System.out.println("Java -> " + reverseString("Java"));
        System.out.println("recursion -> " + reverseString("recursion"));
        System.out.println("a -> " + reverseString("a"));
        System.out.println("\"\" -> " + reverseString(""));

        System.out.println("\n=== 회문 검사 ===");
        // "racecar" → 회문
        // "A man a plan a canal Panama" → 회문
        // "race a car" → 회문 아님
        // "hello" → 회문 아님
    }
}