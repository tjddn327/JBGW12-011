package j4.j4_7;

public class StringPreconditionExample {
    public static void main(String[] args) {
        System.out.println("=== 문자열 사전/사후 조건 예제 ===\n");

         String test1 = "level";
         String test2 = "hello";
         String test3 = "a man a plan a canal panama";

         System.out.println("'" + test1 + "' 회문인가? " + isPalindrome(test1));
         System.out.println("'" + test2 + "' 회문인가? " + isPalindrome(test2));

         String result = removeSpaces(test3);
         System.out.println("공백 제거: '" + result + "'");
    }

    public static boolean isPalindrome(String str) {
        if (str == null) throw new IllegalArgumentException("문자열이 null입니다.");

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static String removeSpaces(String str) {
        if (str == null) throw new IllegalArgumentException("문자열이 null입니다.");

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ' ') sb.append(c);
        }

        return sb.toString();
    }
}
