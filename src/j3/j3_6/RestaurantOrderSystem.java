package j3.j3_6;

import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🍽️ 레스토랑 주문 시스템에 오신 것을 환영합니다!");

        while (true) {
            showMainMenu();
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("이용해 주셔서 감사합니다! 👋");
                break;
            }

            processMenuChoice(choice);
        }
    }

    public static void showMainMenu() {
        System.out.print("""
            
            === 메인 메뉴 ===
            1. 🍝 파스타 메뉴
            2. 🍕 피자 메뉴
            3. 🥗 샐러드 메뉴
            4. 🍰 디저트 메뉴
            5. ☕ 음료 메뉴
            6. 🛒 주문 확인
            7. 💳 결제하기
            0. 종료
            
            선택하세요: """);
    }

    public static void processMenuChoice(int choice) {
        // TODO: 메뉴 선택 처리
        // 힌트: switch문으로 각 메뉴 처리

        // 여기에 코드를 작성하세요
        String[] pasta = {"스파게티 까르보나라 - 15,000원", "토마토 파스타 - 12,000원", "크림 파스타 - 14,000원", "페스토 파스타 - 16,000원"};

        switch (choice) {
            case 1 -> {
                System.out.println("🍝 파스타 메뉴");
                showSubMenu("파스타", pasta);
            }
            case 2 -> {
                System.out.println("🍕 피자 메뉴");
            }
            case 3 -> {
                System.out.println("🥗 샐러드 메뉴");
            }
            case 4 -> {
                System.out.println("🍰 디저트 메뉴");
            }
            case 5 -> {
                System.out.println("☕ 음료 메뉴");
            }
            case 6 -> {
                System.out.println("🛒 주문 확인");
            }
            case 7 -> {
                System.out.println("💳 결제하기");
                processPayment();
            }
            case 0 -> {
                System.out.println("종료");
            }
        }
    }

    public static void showSubMenu(String category, String[] items) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("\n=== " + category + " 상세 메뉴 ===");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
        System.out.println("메인 메뉴로 돌아가려면 엔터를 누르세요.");
        sc.nextLine();
    }

    public static void processPayment() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("결제 방법을 선택하세요 (card/cash/mobile): ");
        String paymentMethod = sc.nextLine().toLowerCase();

        // TODO: 결제 방법별 처리
        // 힌트: switch 표현식과 yield
        String message = switch (paymentMethod){// 여기에 switch 표현식을 작성하세요
            case "card" -> {
                yield "카드를 삽입해주세요...\uD83D\uDCB3 카드 결제가 완료되었습니다.";
            }
            case "cash" -> {
                yield "현금주세요... 현금 결제가 완료됨.";
            }
            case "moblie" -> {
                yield "삼성페이시면 여기 올려주세요... 결제가 완료되었습니다.";
            }
            default -> {
                yield "❌";
            }
        };

                System.out.println(message);
        if (!message.startsWith("❌")) {
            System.out.println("주문이 접수되었습니다. 조리 시간은 15-20분입니다. 🍽️");
        }
    }
}
