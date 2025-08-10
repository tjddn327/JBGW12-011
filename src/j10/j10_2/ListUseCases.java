package j10.j10_2;

import java.util.*;

public class ListUseCases {
    
    // 사례 1: 대량 데이터 저장 및 조회 - ArrayList 적합
    static class DataRepository {
        private ArrayList<String> data = new ArrayList<>();
        
        public void loadData(List<String> items) {
            // 모든 요소를 data에 추가
            data.addAll(items);
        }
        
        public String getData(int index) {
            // 지정된 인덱스의 데이터 반환
            return data.get(index);
        }
        
        public List<String> search(String keyword) {
            List<String> results = new ArrayList<>();
            // keyword 포함하는 모든 항목 추가
            for (String item : data) {
                if (item.contains(keyword)) {
                    results.add(item);
                }
            }
            return results;
        }
    }
    
    // 사례 2: 작업 큐 - LinkedList 적합
    static class TaskQueue {
        private LinkedList<String> tasks = new LinkedList<>();
        
        public void addTask(String task) {
            // 일반 작업을 큐 끝에 추가
            tasks.addLast(task);
        }
        
        public void addUrgentTask(String task) {
            // 긴급 작업을 큐 앞에 추가
            tasks.addFirst(task);
        }
        
        public String getNextTask() {
            // 첫 번째 작업 제거하고 반환
            return tasks.pollFirst();
        }
        
        public boolean hasTask() {
            // 작업 남아있는지 확인
            return !tasks.isEmpty();
        }
    }
    
    // 사례 3: 브라우저 히스토리 - LinkedList 적합
    static class BrowserHistory {
        private LinkedList<String> history = new LinkedList<>();
        private int currentIndex = -1;
        
        public void visit(String url) {
            // 현재 위치 이후 히스토리 삭제
            while (history.size() > currentIndex + 1) {
                history.removeLast();
            }
            // 새 URL 추가 및 인덱스 증가
            history.add(url);
            currentIndex++;
        }
        
        public String back() {
            // 이전 페이지로 이동 가능하면 이동 후 반환
            if (currentIndex > 0) {
                currentIndex--;
                return history.get(currentIndex);
            }
            return null;
        }
        
        public String forward() {
            // 다음 페이지로 이동 가능하면 이동 후 반환
            if (currentIndex < history.size() - 1) {
                currentIndex++;
                return history.get(currentIndex);
            }
            return null;
        }
        
        public String current() {
            // 현재 페이지 URL 반환
            if (currentIndex >= 0 && currentIndex < history.size()) {
                return history.get(currentIndex);
            }
            return null;
        }
    }
    
    public static void main(String[] args) {
        // 데이터 저장소 테스트
        DataRepository repo = new DataRepository();
        repo.loadData(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
        System.out.println("Index 2: " + repo.getData(2));
        System.out.println("Search 'err': " + repo.search("err"));
        
        // 작업 큐 테스트
        System.out.println("\n=== 작업 큐 ===");
        TaskQueue queue = new TaskQueue();
        queue.addTask("일반 작업 1");
        queue.addTask("일반 작업 2");
        queue.addUrgentTask("긴급 작업");
        
        while (queue.hasTask()) {
            System.out.println("처리: " + queue.getNextTask());
        }
        
        // 브라우저 히스토리 테스트
        System.out.println("\n=== 브라우저 히스토리 ===");
        BrowserHistory browser = new BrowserHistory();
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");
        
        System.out.println("현재: " + browser.current());
        System.out.println("뒤로: " + browser.back());
        System.out.println("뒤로: " + browser.back());
        System.out.println("앞으로: " + browser.forward());
        browser.visit("stackoverflow.com");
        System.out.println("새 방문: " + browser.current());
    }
}
