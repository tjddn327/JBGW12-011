package j5.j5_5.employee;

import java.util.HashMap;
import java.util.Map;

// 직원 관리 시스템
public class EmployeeManagementSystem {
    private Map<String, Employee> employees;

    public EmployeeManagementSystem() {
        // TODO 81: employees를 새 HashMap으로 초기화하기
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        // TODO 82: 직원 추가하기
        // employees Map에 employee.id를 키로 하여 추가
        // "직원 추가: [직원정보]" 출력
        employees.put(employee.id, employee);
        System.out.println("직원 추가: " + employee);
    }

    public double calculateTotalMonthlySalary() {
        // TODO 83: 전체 월급 총액 계산하기
        // 모든 직원의 calculateMonthlySalary() 합계 반환
        double total = 0;
        for (Employee e : employees.values()) {
            total += e.calculateMonthlySalary();
        }
        return total;
    }

    public void displaySalaryReport() {
        // TODO 84: 급여 보고서 출력하기
        // "=== 급여 보고서 ===" 출력
        // 각 직원에 대해:
        //   "[이름] ([직급]): [월급]원" 출력
        // "전체 월 급여 총액: [총액]원" 출력
        System.out.println("\n=== 급여 보고서 ===");
        for (Employee e : employees.values()) {
            System.out.printf("%s (%s): %.1f원\n", e.name, e.getPosition(), e.calculateMonthlySalary());
        }
        System.out.println("전체 월 급여 총액: " + calculateTotalMonthlySalary() + "원");
    }
}