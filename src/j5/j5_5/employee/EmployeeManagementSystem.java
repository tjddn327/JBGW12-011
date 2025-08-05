package j5.j5_5.employee;

import java.util.HashMap;
import java.util.Map;

// 직원 관리 시스템
public class EmployeeManagementSystem {
    private Map<String, Employee> employees;

    public EmployeeManagementSystem() {
        // TODO 81: employees를 새 HashMap으로 초기화하기
        employees = new HashMap<String, Employee>();
    }

    public void addEmployee(Employee employee) {
        // TODO 82: 직원 추가하기
        // employees Map에 employee.id를 키로 하여 추가
        // "직원 추가: [직원정보]" 출력
        System.out.println("직원 추가: ");
    }

    public double calculateTotalMonthlySalary() {
        // TODO 83: 전체 월급 총액 계산하기
        // 모든 직원의 calculateMonthlySalary() 합계 반환
        return 0;
    }

    public void displaySalaryReport() {
        // TODO 84: 급여 보고서 출력하기
        // "=== 급여 보고서 ===" 출력
        // 각 직원에 대해:
        //   "[이름] ([직급]): [월급]원" 출력
        // "전체 월 급여 총액: [총액]원" 출력
        System.out.println("\n=== 급여 보고서 ===");
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
        }
        calculateTotalMonthlySalary();
    }
}