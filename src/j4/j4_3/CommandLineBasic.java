package j4.j4_3;

import java.util.Scanner;
import java.util.*;

public class CommandLineBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String insu = sc.nextLine();
        System.out.println("=== 명령줄 인수 처리 ===\n");
        String[] names = insu.split(" ");
        // TODO 57: 인수 개수 확인하고 출력하기
        System.out.println("전달받은 인수 개수: " + names.length);
        // TODO 59: 모든 인수 출력하기
        System.out.println("\n전달받은 인수:");
        for(int i = 0; i < names.length; i++){
            System.out.println("args["+i+"] = " + names[i]);
        }
        // TODO 58: 인수가 없는 경우 처리하기
        for(int j = 0; j < names.length; j++){

        }
        // TODO 60: 인수 타입 변환하기
    }
}