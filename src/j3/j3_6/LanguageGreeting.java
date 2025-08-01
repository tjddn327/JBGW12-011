package j3.j3_6;

import java.util.Scanner;

public class LanguageGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("언어를 입력하세요 (한국어/영어/일본어/중국어): ");
        String language = sc.nextLine().toLowerCase();

        // TODO: switch 표현식으로 인사말 설정
        // 힌트: 여러 case 값 묶기
        // 여기에 switch 표현식을 작성하세요
        String greeting = switch (language){
            case "한국어" ->  "안녕하세요!";
            case "영어" -> "Hello!";
            case "일본어" -> "こんにちは！";
            case "중국어" -> "你好！";
            default -> "지원안함";
        };

        System.out.println("인사말: " + greeting);

        // TODO: 언어별 추가 정보 출력
        // 힌트: switch문 사용

        // 여기에 코드를 작성하세요

        switch (language){
            case "한국어" -> System.out.println("한국은 동아시아의 반도 국가입니다.\n한글은 세종대왕이 창제했습니다.");
            case "영어" -> System.out.println("영어는 전 세계에서 가장 널리 사용되는 언어입니다.\n국제 공용어 역할을 합니다.");
            case "일본어" -> System.out.println("일본은 한국 옆동네입니다.\n일본어는 받침이 없습니다.");
            case "중국어" -> System.out.println("중국은 전세계에서 인구가 제일 많습니다.\n중국어는 한자를 토대로 만들어졌습니다.");
        }
    }
}
