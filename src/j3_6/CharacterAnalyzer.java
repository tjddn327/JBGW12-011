package j3_6;

import java.util.Scanner;

public class CharacterAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        char ch = sc.next().charAt(0);

        // TODO: 문자 종류 판별 switch문
        // 힌트: 여러 case 묶기, Character.isLetter(), Character.isDigit()

        // 여기에 코드를 작성하세요
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println(ch+"는 소문자 모음입니다.");
            }
            case 'A', 'E', 'I', 'O', 'U' -> {
                System.out.println(ch+"는 대문자 모음입니다.");
            }
            default -> {
                if(Character.isLetter(ch)) {
                    System.out.println(ch + "는 자음입니다");
                }else if(!Character.isLetter(ch) && !Character.isDigit(ch)) {
                    System.out.println(ch + "는 특수문자입니다.");
                }else if(Character.isDigit(ch)) {
                    System.out.println(ch + "는 숫자입니다.");
                }
            }
        }
    }
}
