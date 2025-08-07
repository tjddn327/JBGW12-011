package j5.j5_6.employee;

// 테스트
public class MethodExtensionExample {
    public static void main(String[] args) {
        // TODO 27: 세 타입의 직원 객체 생성하기
        // Employee: "김직원", 2500000
        // Manager: "이과장", 3500000, 1000000 (보너스)
        // Developer: "박개발", 3000000
        Employee e = new Employee("김직원", 2500000);
        Manager m = new Manager("이과장", 3500000, 1000000);
        Developer d = new Developer("박개발", 3000000);

        // TODO 28: 개발자의 야근 시간 20시간으로 설정하기
        d.setOvertimeHours(20);

        // TODO 29: 각 직원의 급여 명세서 출력하기
        System.out.println("일반 직원:");
        e.printPaySlip();
        m.printPaySlip();
        d.printPaySlip();
    }
}
