package j4.j4_4;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("=== 소수 관련 함수 ===\n");

        // TODO 62: 소수 판별 테스트하기
        System.out.println("1~20까지의 소수:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // TODO 63: n번째 소수 찾기 테스트하기
        System.out.println("처음 10개의 소수:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(nthPrime(i) + " ");
        }
        System.out.println("\n");

        // TODO 64: 소수 개수 세기 테스트하기
        int limit = 100;
        System.out.println("1~" + limit + " 사이의 소수 개수: " +
                countPrimes(limit));

        // TODO 65: 쌍둥이 소수 찾기 테스트하기
        System.out.println("\n" + limit + " 이하의 쌍둥이 소수:");
        findTwinPrimes(limit);
    }

    // TODO 66: 소수 판별 함수 구현하기
    static boolean isPrime(int n) {
        // 소수 여부 판단
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // TODO 67: n번째 소수 구하기 함수 구현하기
    static int nthPrime(int n) {
        // n번째 소수 찾기
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    // TODO 68: 범위 내 소수 개수 함수 구현하기
    static int countPrimes(int limit) {
        // 소수 개수 세기
        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    // TODO 69: 쌍둥이 소수 찾기 함수 구현하기
    static void findTwinPrimes(int limit) {
        // 차이가 2인 소수 쌍 찾기
        for (int i = 2; i <= limit - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
