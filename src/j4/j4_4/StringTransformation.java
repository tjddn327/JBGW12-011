package j4.j4_4;

public class StringTransformation {
    public static void main(String[] args) {
        System.out.println("=== 문자열 변환 함수 ===\n");

        // TODO 52: 대소문자 변환 테스트하기
        String text = "Hello World!";
        System.out.println("원본: " + text);
        System.out.println("대문자: " + toUpperCase(text));
        System.out.println("소문자: " + toLowerCase(text));
        System.out.println("대소문자 반전: " + swapCase(text));

        // TODO 53: 문자 제거/치환 테스트하기
        System.out.println("\n=== 문자 처리 ===");
        System.out.println("모음 제거: " + removeVowels("Hello World"));
        System.out.println("공백 제거: " + removeSpaces("Hello World"));
        System.out.println("숫자만 추출: " + extractDigits("abc123def456"));

        // TODO 54: 문자열 반복 테스트하기
        System.out.println("\n=== 문자열 반복 ===");
        System.out.println("repeat(\"Hi\", 3): " + repeat("Hi", 3));
        System.out.println("repeat(\"*\", 10): " + repeat("*", 10));
    }

    // TODO 55: 대문자로 변환 함수 구현하기
    static String toUpperCase(String str) {
        // 대문자 변환
        return str.toUpperCase();
    }

    // TODO 56: 소문자로 변환 함수 구현하기
    static String toLowerCase(String str) {
        // 소문자 변환
        return str.toLowerCase();
    }

    // TODO 57: 대소문자 반전 함수 구현하기
    static String swapCase(String str) {
        // 대소문자 바꾸기
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // TODO 58: 모음 제거 함수 구현하기
    static String removeVowels(String str) {
        // 모음 제거
        return str.replaceAll("(?i)[aeiou]", "");
    }

    // TODO 59: 공백 제거 함수 구현하기
    static String removeSpaces(String str) {
        // 공백 제거
        return str.replaceAll("\\s+", "");
    }

    // TODO 60: 숫자만 추출 함수 구현하기
    static String extractDigits(String str) {
        // 숫자만 추출
        StringBuilder digits = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        return digits.toString();
    }

    // TODO 61: 문자열 반복 함수 구현하기
    static String repeat(String str, int times) {
        // 문자열 반복
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
