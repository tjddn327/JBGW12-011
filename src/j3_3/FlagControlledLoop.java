package j3_3;

import java.util.Scanner;

public class FlagControlledLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 소수 찾기 (플래그 사용)
        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();

        boolean isPrime = true;  // 플래그
        int divisor = 2;

        if (number <= 1) {
            isPrime = false;
        }

        // TODO: 소수 판별 루프
        // 힌트:
        // 1. divisor가 number의 제곱근 이하이고 isPrime이 true인 동안
        // 2. number가 divisor로 나누어 떨어지면:
        //    - isPrime을 false로 설정
        // 3. divisor를 증가

        // 여기에 코드를 작성하세요

        while(true){
            if((number%divisor) == 0){
                isPrime = false;
                break;
            }
            if(divisor > Math.sqrt(number) && !isPrime){
                break;
            }
            divisor++;
        }

        if (isPrime) {
            System.out.println(number + "은(는) 소수입니다.");
        } else {
            System.out.println(number + "은(는) 소수가 아닙니다.");
        }

        // 검색 플래그
        System.out.println("\n=== 배열에서 값 찾기 ===");
        int[] numbers = {5, 12, 7, 23, 9, 14, 3};
        System.out.print("찾을 값: ");
        int target = sc.nextInt();

        boolean found = false;  // 플래그
        int index = 0;

        // TODO: 배열에서 값 찾기
        // 힌트:
        // 1. index가 배열 길이보다 작고 found가 false인 동안
        // 2. numbers[index]가 target과 같으면:
        //    - found를 true로 설정
        // 3. 같지 않으면 index 증가

        // 여기에 코드를 작성하세요

        while(true){
            if(index > numbers.length){
                break;
            }
            if(numbers[index] == target){
                found = true;
                break;
            }
            index++;
        }



        if (found) {
            System.out.println(target + "은(는) 인덱스 " + index + "에 있습니다.");
        } else {
            System.out.println(target + "을(를) 찾을 수 없습니다.");
        }
    }
}
