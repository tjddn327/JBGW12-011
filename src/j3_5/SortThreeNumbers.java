package j3_5;

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 개의 숫자를 입력하면 오름차순으로 정렬합니다.");

        System.out.print("첫 번째 숫자: ");
        int x = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int y = sc.nextInt();
        System.out.print("세 번째 숫자: ");
        int z = sc.nextInt();

        System.out.print("\n정렬 결과: ");

        // TODO: 세 수 정렬 로직
        // 힌트: x가 가장 작은/큰/중간인 경우로 나누어 처리

        // 여기에 코드를 작성하세요
        if(x > y && y > z) {
            System.out.println("정렬 결과: " + z + " " + y + " " + x);
        }else if(x > z && z > y) {
            System.out.println("정렬 결과: " + y + " " + z + " " + x);
        }else if(y > x && x > z){
            System.out.println("정렬 결과: " + z + " " + x + " " + y);
        }else if(y > z && z > x){
            System.out.println("정렬 결과: " + x + " " + z + " " + y);
        }else if(z > y && y > x){
            System.out.println("정렬 결과: " + x + " " + y + " " + z);
        }else if(z > x && x > y){
            System.out.println("정렬 결과: " + y + " " + x + " " + z);
        }

        // TODO: 추가 정보 계산
        // 힌트: min과 max 변수 사용

        // 여기에 코드를 작성하세요
        int m = Math.min(Math.min(x,y),z);
        int q = Math.max(Math.max(x,y),z);

        System.out.println("최솟값: " + m);
        System.out.println("최댓값: " + q);
        System.out.println("범위: " + (q-m));

    }
}
