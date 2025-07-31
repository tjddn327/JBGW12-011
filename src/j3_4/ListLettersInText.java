package j3_4;

import java.util.Scanner;

public class ListLettersInText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("텍스트를 입력하세요:");
        String str = sc.nextLine();

        // 대문자로 변환
        str = str.toUpperCase();

        int count = 0;
        System.out.println("\n입력한 텍스트에 포함된 문자:");

        // TODO: 각 알파벳 확인
        // 힌트:
        // 1. letter를 'A'부터 'Z'까지 반복
        // 2. 각 letter에 대해:
        //    - found를 false로 초기화
        //    - str의 각 문자를 확인하여 letter와 같은지 검사
        //    - 찾으면 found = true 설정하고 break
        //    - found가 true면 letter 출력하고 count 증가

        // 여기에 코드를 작성하세요

        for(char letter = 'A'; letter <= 'Z'; letter++){
            boolean found = false;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == letter){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.print(letter + " ");
                count++;
            }

        }

        System.out.println("\n\n서로 다른 문자의 개수: " + count);

        // TODO: 문자 빈도수 계산
        // 힌트:
        // 1. letter를 'A'부터 'Z'까지 반복
        // 2. 각 letter에 대해:
        //    - frequency를 0으로 초기화
        //    - str의 각 문자가 letter와 같으면 frequency 증가
        //    - frequency > 0이면 출력
        System.out.println("\n문자별 빈도수:");

        // 여기에 코드를 작성하세요
        for(char letter = 'A'; letter <= 'Z'; letter++) {
            int frequency = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == letter) {
                    frequency++;
                }
            }
            if(frequency > 0){
                System.out.println(letter + ":" +  frequency + "개");
            }
        }
    }
}
