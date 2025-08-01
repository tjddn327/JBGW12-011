package j3.j3_6;

import java.util.Scanner;

public class BrowserDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("브라우저명을 입력하세요: ");
        String browser = sc.nextLine().toLowerCase();

        // TODO: switch 표현식으로 브라우저 정보 설정
        // 힌트: yield 사용
        String engineInfo = switch (browser){// 여기에 switch 표현식을 작성하세요
            case "chrome" -> {
                yield "Choromium 기반 브라우저입니다.\nlink 렌더링 엔진을 사용합니다.\nV8 JavaScript 엔진을 사용합니다.";
            }
            case "firefox" -> {

                yield "Mozilla Foundation의 브라우저입니다.\nGecko 렌더링 엔진을 사용합니다.\nSpiderMonkey JavaScript 엔진을 사용합니다.";
            }
            default -> {
                yield "그런 브라우저는 몰루?";
            }
        };

                System.out.println("\n브라우저 정보:");
        System.out.println(engineInfo);

        // TODO: 보안 등급 평가
        // 힌트: switch 표현식
        String securityLevel = switch (browser){// 여기에 switch 표현식을 작성하세요
            case "chrome" -> "높음";
            case "firefox" -> "높음";
            default -> "몰루?";
        };

                System.out.println("보안 수준: " + securityLevel);
    }
}
