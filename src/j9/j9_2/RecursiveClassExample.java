package j9.j9_2;

public class RecursiveClassExample {

    /** * 직원 클래스 - 감독자 관계를 표현     */
    static class Employee {
        String name;
        String position;
        Employee supervisor;

        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        // 사장까지의 계층 구조를 출력
        public void printHierarchy() {
            // TODO: 현재 직원부터 사장까지의 조직 체계를 출력
            // 힌트: while 루프를 사용하여 supervisor가 null이 될 때까지 이동
            Employee current = this;
            while (current != null) {
                System.out.println(current.position + ": " + current.name);
                current = current.supervisor;
            }
        }

        // 사장까지의 거리 계산 (재귀)
        public int getDistanceToPresident() {
            // TODO: 재귀를 사용하여 사장까지의 거리 계산
            // 힌트: supervisor가 null이면 본인이 사장 (거리 0)
            //      아니면 1 + supervisor의 거리

            if (supervisor == null) {
                return 0; // 기저 사례: 본인이 사장
            }
            return 1 + supervisor.getDistanceToPresident(); // 재귀 사례
        }
    }

    public static void main(String[] args) {
        // 조직 구조 생성
        Employee president = new Employee("김대표", "대표이사");
        Employee vicePresident = new Employee("이부사", "부사장");
        Employee director = new Employee("박이사", "이사");
        Employee manager = new Employee("최부장", "부장");
        Employee employee = new Employee("정사원", "사원");

        // 감독자 관계 설정
        employee.supervisor = manager;
        manager.supervisor = director;
        director.supervisor = vicePresident;
        vicePresident.supervisor = president;
        president.supervisor = null;

        // 실행 결과:
        System.out.println("=== 정사원의 조직 체계 ===");
        employee.printHierarchy();

        System.out.println("\n사장까지의 거리: " + employee.getDistanceToPresident());
    }
}