package j5.j5_3;

import java.util.Random;

/**
 * Random 클래스의 다양한 활용 예제
 */
public class RandomExample {
    private static Random random = new Random();

    /**
     * 주사위 시뮬레이션 클래스
     */
    public static class DiceSimulator {
        private Random rand;

        // TODO 9: 생성자 구현하기
        public DiceSimulator() {
            this.rand = new Random(); // Random 객체 생성
        }

        // TODO 10: 주사위 하나 굴리기 메서드 구현하기
        public int rollDie() {
            return rand.nextInt(6) + 1; // 1-6 사이의 값
        }

        // TODO 11: 주사위 여러 개 굴리기 메서드 구현하기
        public int rollDice(int count) {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += rollDie();
            }
            return sum;
        }

        // TODO 12: 주사위 통계 시뮬레이션 메서드 구현하기
        public void simulateRolls(int times) {
            int[] counts = new int[13]; // 2-12 합계 카운트

            for (int i = 0; i < times; i++) {
                int sum = rollDie() + rollDie();
                counts[sum]++;
            }

            System.out.println("=== 주사위 2개 굴리기 " + times + "회 결과 ===");
            for (int i = 2; i <= 12; i++) {
                double percent = (counts[i] * 100.0) / times;
                System.out.printf("합계 %2d: %5d회 (%.1f%%)\n", i, counts[i], percent);
            }
        }
    }

    /**
     * 랜덤 문자열 생성기 클래스
     */
    public static class RandomStringGenerator {
        private static final String CHARACTERS =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // TODO 13: 비밀번호 생성 메서드 구현하기
        public static String generatePassword(int length) {
            StringBuilder password = new StringBuilder();
            Random rand = new Random();
            for (int i = 0; i < length; i++) {
                int index = rand.nextInt(CHARACTERS.length());
                password.append(CHARACTERS.charAt(index));
            }
            return password.toString();
        }
    }

    /**
     * 랜덤 데이터 생성기 클래스
     */
    public static class RandomDataGenerator {
        private static final String[] FIRST_NAMES =
                {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임"};
        private static final String[] LAST_NAMES =
                {"철수", "영희", "민수", "지영", "현우", "수진", "준호", "은영", "태현", "소영"};

        // TODO 14: 랜덤 이름 생성 메서드 구현하기
        public static String generateName() {
            String first = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String last = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            return first + last;
        }

        // TODO 15: 랜덤 나이 생성 메서드 구현하기
        public static int generateAge(int min, int max) {
            return random.nextInt(max - min + 1) + min;
        }
    }

    // TODO 16: 사용 예제 완성하기
    public static void main(String[] args) {
        System.out.println("=== Random 클래스 활용 예제 ===\n");

        // TODO 17: 주사위 시뮬레이션 테스트하기
        DiceSimulator dice = new DiceSimulator();
        dice.simulateRolls(10000);

        // TODO 18: 랜덤 비밀번호 생성 테스트하기
        System.out.println("\n=== 랜덤 비밀번호 생성 ===");
        String password = RandomStringGenerator.generatePassword(8);
        System.out.println("간단한 비밀번호: " + password);

        // TODO 19: 랜덤 사용자 데이터 생성 테스트하기
        System.out.println("\n=== 랜덤 사용자 데이터 ===");
        for (int i = 0; i < 5; i++) {
            String name = RandomDataGenerator.generateName();
            int age = RandomDataGenerator.generateAge(20, 30);
            System.out.println(name + " (" + age + "세)");
        }
    }
}
