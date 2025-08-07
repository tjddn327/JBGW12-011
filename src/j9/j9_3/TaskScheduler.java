package j9.j9_3;

import java.util.concurrent.TimeUnit;

public class TaskScheduler {

    static class Task {
        private String name;
        private int priority;
        private long estimatedTime;  // 밀리초 단위

        public Task(String name, int priority, long estimatedTime) {
            this.name = name;
            this.priority = priority;
            this.estimatedTime = estimatedTime;
        }

        public void execute() {
            System.out.println("실행 중: " + name);
            try {
                Thread.sleep(estimatedTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("완료: " + name);
        }

        @Override
        public String toString() {
            return String.format("%s (우선순위: %d, 예상시간: %dms)",
                    name, priority, estimatedTime);
        }
    }

    private LinkedQueue<Task> taskQueue;
    private boolean isRunning;

    public TaskScheduler() {
        this.taskQueue = new LinkedQueue<>();
        this.isRunning = false;
    }

    /**
     * 작업 추가
     */
    public void addTask(Task task) {
        taskQueue.enqueue(task);
        System.out.println("작업 추가됨: " + task);
    }

    /**
     * 모든 작업 실행
     */
    public void executeAll() {
        isRunning = true;
        System.out.println("\n=== 작업 실행 시작 ===");

        long startTime = System.currentTimeMillis();

        while (!taskQueue.isEmpty() && isRunning) {
            Task task = taskQueue.dequeue();
            task.execute();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\n=== 작업 실행 완료 ===");
        System.out.println("총 실행 시간: " + (endTime - startTime) + "ms");
    }

    /**
     * 실행 중지
     */
    public void stop() {
        isRunning = false;
    }

    /**
     * 대기 중인 작업 수
     */
    public int getPendingTaskCount() {
        return taskQueue.size();
    }

    /**
     * 우선순위 큐 (간단한 구현)
     */
    static class PriorityTaskScheduler {
        private LinkedQueue<Task>[] queues;
        private int maxPriority;

        @SuppressWarnings("unchecked")
        public PriorityTaskScheduler(int maxPriority) {
            this.maxPriority = maxPriority;
            this.queues = new LinkedQueue[maxPriority + 1];

            for (int i = 0; i <= maxPriority; i++) {
                queues[i] = new LinkedQueue<>();
            }
        }

        public void addTask(Task task) {
            if (task.priority < 0 || task.priority > maxPriority) {
                throw new IllegalArgumentException("잘못된 우선순위: " + task.priority);
            }

            queues[task.priority].enqueue(task);
            System.out.println("우선순위 큐에 추가: " + task);
        }

        public void executeAll() {
            System.out.println("\n=== 우선순위 작업 실행 시작 ===");

            // 높은 우선순위부터 실행
            for (int priority = maxPriority; priority >= 0; priority--) {
                while (!queues[priority].isEmpty()) {
                    Task task = queues[priority].dequeue();
                    task.execute();
                }
            }

            System.out.println("=== 우선순위 작업 실행 완료 ===");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 작업 스케줄러 테스트 ===");

        // 일반 큐 스케줄러
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("데이터베이스 백업", 2, 300));
        scheduler.addTask(new Task("이메일 전송", 1, 100));
        scheduler.addTask(new Task("로그 파일 정리", 0, 200));
        scheduler.addTask(new Task("보고서 생성", 2, 500));

        scheduler.executeAll();

        // 우선순위 큐 스케줄러
        System.out.println("\n=== 우선순위 스케줄러 테스트 ===");

        PriorityTaskScheduler priorityScheduler = new PriorityTaskScheduler(3);

        priorityScheduler.addTask(new Task("긴급: 시스템 오류 수정", 3, 400));
        priorityScheduler.addTask(new Task("일반: 데이터 백업", 1, 300));
        priorityScheduler.addTask(new Task("높음: 보안 업데이트", 2, 200));
        priorityScheduler.addTask(new Task("낮음: 캐시 정리", 0, 100));

        priorityScheduler.executeAll();
    }
}