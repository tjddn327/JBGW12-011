package j5.j5_5.employee;

// 테스트
public class CompanyTest {
    public static void main(String[] args) {
        // TODO 85: 직원 관리 시스템 생성하기
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // TODO 86: 다양한 직원 추가하기
        // 정규직: "E001", "김철수", "개발부", 3000000원
        // 계약직: "E002", "이영희", "디자인부", 50000원(시급)
        FullTimeEmployee emp1 = new FullTimeEmployee("E001", "김철수", "개발부", 3000000);
        ContractEmployee emp2 = new ContractEmployee("E002", "이영희", "디자인부", 50000);

        system.addEmployee(emp1);
        system.addEmployee(emp2);
        // TODO 87: 보너스와 근무시간 설정하기
        // 김철수 보너스: 500000원
        // 이영희 근무시간: 160시간
        emp1.setBonus(500000);
        emp2.setHoursWorked(160);

        // TODO 88: 급여 보고서 출력하기
        system.displaySalaryReport();
    }
}