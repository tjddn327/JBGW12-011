package j4.j4_6;

// TODO 41: StringUtils 클래스에 상세한 Javadoc 주석 작성하기
/**
 * <p>
 * <h2>주요 기능</h2>
 * <ol>
 *   <li>문자열 뒤집기</li>
 *   <li>회문 판별</li>
 *   <li>공백 제거 후 비교</li>
 * </ol>
 *
 * <p><strong>참고:</strong> 문자열 처리를 간편하게 할 수 있도록 도와주는 유틸리티 클래스입니다.
 *
 * @since 1.0
 */
class StringUtils {

    // TODO 42: reverse 메서드에 예제가 포함된 Javadoc 주석 작성하기
    /**
     * 주어진 문자열을 뒤집어 반환합니다.
     * <p>예제:
     * <blockquote>
     * <pre>
     * String reversed = StringUtils.reverse("hello");
     * // 결과: "olleh"
     * </pre>
     * </blockquote>
     *
     * @param str 입력 문자열
     * @return 뒤집힌 문자열, null이면 null 반환
     */
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // TODO 43: isPalindrome 메서드에 Javadoc 주석 작성하기
    /**
     * 주어진 문자열이 회문인지 여부를 반환합니다.
     * <p>공백과 대소문자는 무시됩니다.
     * <br>예: "A man a plan a canal Panama" 는 true 반환
     *
     * @param str 입력 문자열
     * @return 회문이면 true, 아니면 false
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = reverse(cleaned);
        return cleaned.equals(reversed);
    }
}