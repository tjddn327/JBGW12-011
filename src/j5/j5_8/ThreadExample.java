package j5.j5_8;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 익명 클래스를 사용한 스레드와 타이머 예제
 */
public class ThreadExample {

    public static void main(String[] args) {
        System.out.println("메인 스레드 시작");

        // TODO 80: 익명 클래스로 Thread 생성하기
        // Thread를 상속받아 run() 메서드 오버라이드
        // 1부터 5까지 "Worker 1: i" 출력 (1초마다)
        Thread worker1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Worker 1: " + i);
                    try {
                        Thread.sleep(1000); // 1초
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // TODO 81: 익명 클래스로 Runnable 구현하기
        // Runnable 인터페이스 구현
        // 1부터 5까지 "Worker 2: i" 출력 (1.5초마다)
        Thread worker2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Worker 2: " + i);
                    try {
                        Thread.sleep(1500); // 1.5초
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // TODO 82: 람다 표현식으로 스레드 생성하기
        // 1부터 5까지 "Worker 3: i" 출력 (2초마다)
        Thread worker3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker 3: " + i);
                try {
                    Thread.sleep(2000); // 2초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // TODO 83: Timer와 익명 클래스로 TimerTask 구현하기
        // Timer 생성
        // TimerTask를 익명 클래스로 구현
        // count 필드 유지, 실행마다 count 증가
        // "타이머 실행: count회" 출력
        // count가 3이 되면 timer.cancel()하고 "타이머 종료" 출력
        // 1초 후 시작, 2초마다 반복
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                count++;
                System.out.println("타이머 실행: " + count + "회");
                if (count == 3) {
                    timer.cancel();
                    System.out.println("타이머 종료");
                }
            }
        };
        timer.schedule(task, 1000, 2000); // 1초 후 실행, 2초마다 반복

        // TODO 84: 모든 스레드 시작하기
        // worker1, worker2, worker3 start() 호출
        worker1.start();
        worker2.start();
        worker3.start();

        System.out.println("모든 스레드 시작됨");
    }
}
