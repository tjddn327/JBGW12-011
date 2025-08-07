package j7.J7_5;

import java.util.Scanner;

public class PhoneBookExample {
    static class PhoneEntry {
        String name;
        String phone;
        String email;

        PhoneEntry(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("%-10s | %-15s | %s", name, phone, email);
        }
    }

    static class PhoneBook {
        private PhoneEntry[] entries;
        private int count;

        public PhoneBook(int capacity) {
            entries = new PhoneEntry[capacity];
            count = 0;
        }

        // TODO: 연락처 추가 메서드를 작성하세요
        // 매개변수: String name, String phone, String email
        // 반환값: 성공하면 true, 실패하면 false
        // 조건: 전화번호부가 가득 차거나 중복 이름이 있으면 실패
        public boolean addContact(String name, String phone, String email) {
            // TODO: 배열이 가득 찼는지 확인
            if (count >= entries.length) {
                System.out.println("전화번호부가 가득 찼습니다.");
                return false;
            }

            // TODO: 중복 이름 확인
            if (findByName(name) != null) {
                System.out.println("이미 존재하는 이름입니다: " + name);
                return false;
            }

            // TODO: 새 연락처 추가
            entries[count++] = new PhoneEntry(name, phone, email);
            return true;
        }

        // TODO: 이름으로 검색하는 메서드를 작성하세요
        // 매개변수: String name
        // 반환값: 찾은 PhoneEntry 객체, 없으면 null
        public PhoneEntry findByName(String name) {
            for (int i = 0; i < count; i++) {
                if (entries[i].name.equals(name)) {
                    return entries[i];
                }
            }
            return null;
        }

        // TODO: 전화번호로 검색하는 메서드를 작성하세요
        // 매개변수: String phone
        // 반환값: 찾은 PhoneEntry 객체, 없으면 null
        public PhoneEntry findByPhone(String phone) {
            for (int i = 0; i < count; i++) {
                if (entries[i].phone.equals(phone)) {
                    return entries[i];
                }
            }
            return null;
        }

        // TODO: 연락처 수정 메서드를 작성하세요
        // 매개변수: String name, String newPhone, String newEmail
        // 반환값: 성공하면 true, 실패하면 false
        public boolean updateContact(String name, String newPhone, String newEmail) {
            // TODO: 이름으로 연락처를 찾고 수정하세요
            PhoneEntry entry = findByName(name);
            if (entry != null) {
                entry.phone = newPhone;
                entry.email = newEmail;
                return true;
            }
            return false;
        }

        // TODO: 연락처 삭제 메서드를 작성하세요
        // 매개변수: String name
        // 반환값: 성공하면 true, 실패하면 false
        // 힌트: 삭제 후 뒤의 요소들을 앞으로 이동시켜야 함
        public boolean deleteContact(String name) {
            // TODO: 삭제할 연락처를 찾으세요
            for (int i = 0; i < count; i++) {
                if (entries[i].name.equals(name)) {
                    // TODO: 뒤의 항목들을 앞으로 이동시키세요
                    for (int j = i; j < count - 1; j++) {
                        entries[j] = entries[j + 1];
                    }
                    // TODO: count를 줄이고 마지막 참조를 null로 설정
                    count--;
                    entries[count] = null;
                    return true;
                }
            }
            return false;
        }

        // 전체 목록 출력
        public void printAll() {
            if (count == 0) {
                System.out.println("전화번호부가 비어있습니다.");
                return;
            }

            System.out.println("=== 전화번호부 ===");
            System.out.println("이름       | 전화번호        | 이메일");
            System.out.println("----------------------------------------");
            for (int i = 0; i < count; i++) {
                System.out.println(entries[i]);
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(100);
        Scanner scanner = new Scanner(System.in);

        // 샘플 데이터 추가
        phoneBook.addContact("김철수", "010-1234-5678", "kim@email.com");
        phoneBook.addContact("이영희", "010-2345-6789", "lee@email.com");
        phoneBook.addContact("박민수", "010-3456-7890", "park@email.com");

        while (true) {
            System.out.println("\n=== 전화번호부 메뉴 ===");
            System.out.println("1. 전체 목록");
            System.out.println("2. 이름으로 검색");
            System.out.println("3. 연락처 추가");
            System.out.println("4. 연락처 수정");
            System.out.println("5. 연락처 삭제");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 소비

            switch (choice) {
                case 1:
                    phoneBook.printAll();
                    break;
                case 2:
                    System.out.print("검색할 이름: ");
                    String searchName = scanner.nextLine();
                    PhoneEntry found = phoneBook.findByName(searchName);
                    if (found != null) {
                        System.out.println("검색 결과: " + found);
                    } else {
                        System.out.println("찾을 수 없습니다: " + searchName);
                    }
                    break;
                case 3:
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("전화번호: ");
                    String phone = scanner.nextLine();
                    System.out.print("이메일: ");
                    String email = scanner.nextLine();

                    if (phoneBook.addContact(name, phone, email)) {
                        System.out.println("연락처가 추가되었습니다.");
                    }
                    break;
                case 4:
                    System.out.print("수정할 이름: ");
                    String updateName = scanner.nextLine();
                    System.out.print("새 전화번호: ");
                    String newPhone = scanner.nextLine();
                    System.out.print("새 이메일: ");
                    String newEmail = scanner.nextLine();

                    if (phoneBook.updateContact(updateName, newPhone, newEmail)) {
                        System.out.println("연락처가 수정되었습니다.");
                    } else {
                        System.out.println("찾을 수 없습니다: " + updateName);
                    }
                    break;
                case 5:
                    System.out.print("삭제할 이름: ");
                    String deleteName = scanner.nextLine();

                    if (phoneBook.deleteContact(deleteName)) {
                        System.out.println("연락처가 삭제되었습니다.");
                    } else {
                        System.out.println("찾을 수 없습니다: " + deleteName);
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}