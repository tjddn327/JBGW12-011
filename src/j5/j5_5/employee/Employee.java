package j5.j5_5.employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 * 종합적인 직원 관리 시스템
 */
public abstract class Employee {
    protected String id;
    protected String name;
    protected String department;
    protected LocalDate hireDate;

    public Employee(String id, String name, String department) {
        // TODO 70: 필드 초기화하기
        // id, name, department 초기화
        // hireDate는 LocalDate.now()로 설정
        this.id = id;
        this.name = name;
        this.department = department;
        this.hireDate = LocalDate.now();
    }

    // 추상 메서드
    public abstract double calculateMonthlySalary();
    public abstract String getPosition();

    // 공통 메서드
    public int getYearsOfService() {
        // TODO 71: 근속 연수 계산하기
        // Period.between(hireDate, LocalDate.now()).getYears() 반환
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        // TODO 72: 직원 정보 문자열 반환하기
        // "[이름] ([ID]) - [직급], [부서]부서, 연차: [근속년수]년"
        return name + "(" + id + ") - " + department + getPosition() + "부서" + ", 연차:" + hireDate + "년";
    }
}