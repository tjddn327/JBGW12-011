package j7.J7_2;

import java.util.Arrays;
import java.util.ArrayList;

public class DynamicStringArray {
    private String[] words;
    private int wordCount;

    public DynamicStringArray() {
        words = new String[8];
        wordCount = 0;
    }

    // TODO: 단어 추가 메서드를 작성하세요
    public void addWord(String word) {
        if (wordCount == words.length) {
            words = Arrays.copyOf(words, words.length * 2);
        }
        words[wordCount++] = word;
    }

    // TODO: 여러 단어 한 번에 추가 메서드를 작성하세요
    public void addWords(String... newWords) {
        for (String word : newWords) {
            addWord(word);
        }
    }

    // TODO: 문장으로 추가 메서드를 작성하세요
    public void addSentence(String sentence) {
        addWords(sentence.split("\\s+"));
    }

    // TODO: 특정 패턴의 단어 찾기 메서드를 작성하세요
    public String[] findWordsMatching(String pattern) {
        ArrayList<String> matches = new ArrayList<>();
        for (int i = 0; i < wordCount; i++) {
            if (words[i].matches(pattern)) {
                matches.add(words[i]);
            }
        }
        return matches.toArray(new String[0]);
    }

    // TODO: 단어 빈도수 출력 메서드를 작성하세요
    public void printWordFrequency() {
        System.out.println("\n=== 단어 빈도수 ===");
        if (wordCount == 0) {
            System.out.println("단어가 없습니다.");
            return;
        }
        String[] sortedWords = Arrays.copyOf(words, wordCount);
        Arrays.sort(sortedWords);

        int count = 1;
        for (int i = 1; i < sortedWords.length; i++) {
            if (sortedWords[i].equals(sortedWords[i - 1])) {
                count++;
            } else {
                System.out.println(sortedWords[i - 1] + ": " + count + "회");
                count = 1;
            }
        }
        // 마지막 단어 처리
        if (sortedWords.length > 0) {
            System.out.println(sortedWords[sortedWords.length - 1] + ": " + count + "회");
        }
    }

    // TODO: 모든 단어를 하나의 문자열로 결합하는 메서드를 작성하세요
    public String join(String separator) {
        if (wordCount == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            sb.append(words[i]);
            if (i < wordCount - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    // TODO: 통계 정보 출력 메서드를 작성하세요
    public void printStatistics() {
        System.out.println("\n=== 통계 정보 ===");
        if (wordCount == 0) {
            System.out.println("데이터 없음");
            return;
        }
        long totalLength = 0;
        String longestWord = "";
        for (int i = 0; i < wordCount; i++) {
            totalLength += words[i].length();
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("총 단어 수: " + wordCount);
        System.out.println("배열 용량: " + words.length);
        System.out.printf("사용률: %.1f%%\n", (double) wordCount / words.length * 100);
        System.out.printf("평균 단어 길이: %.1f\n", (double) totalLength / wordCount);
        System.out.printf("가장 긴 단어: %s (%d글자)\n", longestWord, longestWord.length());
    }

    public static void main(String[] args) {
        DynamicStringArray dsa = new DynamicStringArray();
        dsa.addWords("Java", "Python", "JavaScript", "Java", "C++");
        dsa.addSentence("Java is a popular programming language");
        dsa.addWord("Java");
        System.out.println("모든 단어: " + dsa.join(", "));
        dsa.printWordFrequency();
        System.out.println("\n=== 'Java'로 시작하는 단어 ===");
        String[] javaWords = dsa.findWordsMatching("Java.*");
        System.out.println(Arrays.toString(javaWords));
        dsa.printStatistics();
    }
}