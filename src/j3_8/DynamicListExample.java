package j3_8;

import java.util.Scanner;

public class DynamicListExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        String[] todoList = new String[MAX_SIZE];
        int itemCount = 0;

        System.out.println("=== To-Do 리스트 관리 ===");

        while (true) {
            System.out.println("\n메뉴:");
            System.out.println("1. 항목 추가");
            System.out.println("2. 항목 목록 보기");
            System.out.println("3. 항목 삭제");
            System.out.println("4. 완료된 항목 표시");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // 항목 추가
                    if (itemCount >= MAX_SIZE) {
                        System.out.println("❌ 리스트가 가득 찼습니다!");
                    } else {
                        System.out.print("추가할 항목: ");
                        String newItem = sc.nextLine();
                        todoList[itemCount] = newItem;
                        itemCount++;
                        System.out.println("✅ 항목이 추가되었습니다.");
                    }
                    break;

                case 2: // 목록 보기
                    if (itemCount == 0) {
                        System.out.println("📋 리스트가 비어있습니다.");
                    } else {
                        System.out.println("\n📋 To-Do 리스트 (" + itemCount + "개):");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println((i + 1) + ". " + todoList[i]);
                        }
                    }
                    break;

                case 3: // 항목 삭제
                    if (itemCount == 0) {
                        System.out.println("❌ 삭제할 항목이 없습니다.");
                    } else {
                        System.out.print("삭제할 항목 번호 (1-" + itemCount + "): ");
                        int deleteIndex = sc.nextInt() - 1;

                        if (deleteIndex >= 0 && deleteIndex < itemCount) {
                            // TODO: 항목 삭제 로직
                            // 힌트: 배열 요소 이동

                            // 여기에 코드를 작성하세요
                            for (int i = deleteIndex; i < itemCount - 1; i++) {
                                todoList[i] = todoList[i + 1];
                            }
                            // 마지막 항목은 null 처리 (선택 사항)
                            todoList[itemCount - 1] = null;
                            itemCount--;  // 항목 개수 감소
                            System.out.println("✅ 항목이 삭제되었습니다.");
                        } else {
                            System.out.println("❌ 잘못된 번호입니다.");
                        }
                    }
                    break;

                case 4: // 완료 표시
                    if (itemCount == 0) {
                        System.out.println("❌ 표시할 항목이 없습니다.");
                    } else {
                        System.out.print("완료할 항목 번호 (1-" + itemCount + "): ");
                        int completeIndex = sc.nextInt() - 1;

                        if (completeIndex >= 0 && completeIndex < itemCount) {
                            if (!todoList[completeIndex].startsWith("✓ ")) {
                                todoList[completeIndex] = "✓ " + todoList[completeIndex];
                                System.out.println("✅ 완료로 표시되었습니다.");
                            } else {
                                System.out.println("ℹ️ 이미 완료된 항목입니다.");
                            }
                        } else {
                            System.out.println("❌ 잘못된 번호입니다.");
                        }
                    }
                    break;

                case 0: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("❌ 잘못된 선택입니다.");
            }
        }
    }
}
