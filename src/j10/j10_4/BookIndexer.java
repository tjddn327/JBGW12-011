package j10.j10_4;

import java.util.*;
import java.io.*;

public class BookIndexer {
    private TreeMap<String, TreeSet<Integer>> index;
    private Set<String> stopWords;  // 무시할 단어들

    public BookIndexer() {
        index = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        stopWords = new HashSet<>(Arrays.asList(
            "the", "a", "an", "and", "or", "but", "in", "on", 
            "at", "to", "for", "of", "with", "by", "is", "was"
        ));
    }

    // 페이지 처리
    public void processPage(int pageNumber, String content) {
        // TODO 16: 소문자 변환 후 단어 분리
        String[] words = content.toLowerCase().split("\\W+");

        // TODO 17: 단어 필터링 및 참조 추가
        for (String word : words) {
            if (word.length() > 2 && !stopWords.contains(word)) {
                addReference(word, pageNumber);
            }
        }
    }

    // 참조 추가
    private void addReference(String term, int pageNum) {
        index.computeIfAbsent(term, k -> new TreeSet<>())
             .add(pageNum);
    }

    // 인덱스 출력
    public void printIndex() {
        System.out.println("=== 인덱스 ===");

        for (Map.Entry<String, TreeSet<Integer>> entry : index.entrySet()) {
            String term = entry.getKey();
            TreeSet<Integer> pages = entry.getValue();

            // 최소 2페이지 이상에서 나타난 용어만 출력
            if (pages.size() >= 2) {
                System.out.printf("%-20s ", term);

                // 페이지 번호를 범위로 압축
                printCompressedPages(pages);
                System.out.println();
            }
        }
    }

    // 연속된 페이지를 범위로 표시
    private void printCompressedPages(TreeSet<Integer> pages) {
        Iterator<Integer> iter = pages.iterator();
        if (!iter.hasNext()) return;

        // TODO 18: 첫 페이지 저장
        int start = iter.next();
        int prev = start;

        while (iter.hasNext()) {
            // TODO 19: 다음 페이지 가져오기
            int current = iter.next();

            // TODO 20: 연속성 체크 및 출력
            if (current != prev + 1) {
                if (start == prev) {
                    System.out.print(start + ", ");
                } else {
                    System.out.print(start + "-" + prev + ", ");
                }
                start = current;
            }
            // TODO 21: prev 업데이트
            prev = current;
        }

        // TODO 22: 마지막 범위 출력
        if (start == prev) {
            System.out.print(start);
        } else {
            System.out.print(start + "-" + prev);
        }
    }

    // 특정 용어 검색
    public void searchTerm(String term) {
        TreeSet<Integer> pages = index.get(term.toLowerCase());

        if (pages == null || pages.isEmpty()) {
            System.out.println("'" + term + "'를 찾을 수 없습니다.");
        } else {
            System.out.print("'" + term + "' 발견 페이지: ");
            printCompressedPages(pages);
            System.out.println(" (총 " + pages.size() + "페이지)");
        }
    }

    public static void main(String[] args) {
        BookIndexer indexer = new BookIndexer();

        // 샘플 페이지 처리
        indexer.processPage(15, "Java programming is powerful and versatile");
        indexer.processPage(23, "Object-oriented programming with Java");
        indexer.processPage(24, "Java collections framework provides data structures");
        indexer.processPage(25, "The Java programming language is platform independent");
        indexer.processPage(45, "Advanced Java programming techniques");
        indexer.processPage(67, "Java collections include List, Set, and Map");
        indexer.processPage(89, "Programming in Java requires understanding objects");

        // 인덱스 출력
        indexer.printIndex();

        // 특정 용어 검색
        System.out.println("\n=== 용어 검색 ===");
        indexer.searchTerm("Java");
        indexer.searchTerm("programming");
        indexer.searchTerm("Python");
    }
}
