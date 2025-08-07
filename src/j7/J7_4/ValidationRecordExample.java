package j7.J7_4;

public class ValidationRecordExample {
    // TODO: 이메일 주소 레코드를 정의하세요
    record Email(String address) {
        // TODO: 정식 생성자에서 유효성 검증을 작성하세요
        public Email {
            if (address == null || address.isBlank()) {
                throw new IllegalArgumentException("이메일 주소는 비어있을 수 없습니다");
            }
            if (!address.contains("@")) {
                throw new IllegalArgumentException("올바른 이메일 형식이 아닙니다");
            }
        }

        // TODO: 도메인 추출 메서드를 작성하세요
        public String domain() {
            return address.substring(address.indexOf("@") + 1);
        }
    }

    // TODO: 나이 레코드를 정의하세요
    record Age(int value) {
        // TODO: 정식 생성자에서 유효성 검증을 작성하세요
        public Age {
            if (value < 0) {
                throw new IllegalArgumentException("나이는 음수일 수 없습니다");
            }
            if (value > 150) {
                throw new IllegalArgumentException("나이가 너무 큽니다");
            }
        }

        // TODO: 연령대 반환 메서드를 작성하세요
        public String ageGroup() {
            if (value < 20) return "미성년";
            if (value < 30) return "20대";
            if (value < 40) return "30대";
            if (value < 50) return "40대";
            if (value < 60) return "50대";
            return "60대 이상";
        }
    }

    public static void main(String[] args) {
        try {
            // TODO: 올바른 이메일로 Email 객체를 생성하세요
            Email email1 = new Email("user@example.com");
            System.out.println("이메일: " + email1);
            System.out.println("도메인: " + email1.domain());

            // TODO: 올바른 나이로 Age 객체를 생성하세요
            Age age1 = new Age(25);
            System.out.println("나이: " + age1.value() + " (" + age1.ageGroup() + ")");

        } catch (IllegalArgumentException e) {
            System.err.println("오류: " + e.getMessage());
        }
    }
}