package j3.j3_5;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        double number = sc.nextDouble();

        // 여기에 코드를 작성하세요
        if(number == (int)number){
            if(number > 0) {
                System.out.println("양수입니다.");
                if(number > 1000){
                    System.out.println("매우 큰 양수입니다.");
                }
            }else if(number < 0) {
                System.out.println("음수입니다.");
            }else{
                System.out.println("0입니다.");
            }
            System.out.println("정수입니다.");
        }else{
            if(number > 0) {
                System.out.println("양수입니다.");
                if(number > 1000){
                    System.out.println("매우 큰 양수입니다.");
                }
            }else if(number < 0) {
                System.out.println("음수입니다.");
            }
            System.out.println("실수입니다.");
        }

    }
}
