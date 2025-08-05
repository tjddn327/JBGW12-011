package j5.j5_5.employee;

// 정규직 직원
public class FullTimeEmployee extends Employee {
    protected double baseSalary;
    protected double bonus;

    public FullTimeEmployee(String id, String name, String department, double baseSalary) {
        // TODO 73: 부모 생성자 호출하고 필드 초기화하기
        // baseSalary 초기화, bonus = 0
        super(id, name, department);
        this.baseSalary = baseSalary;
        bonus = 0;
    }

    @Override
    public double calculateMonthlySalary() {
        // TODO 74: 월급 계산하기
        // baseSalary + bonus 반환
        return baseSalary + bonus;
    }

    @Override
    public String getPosition() {
        // TODO 75: "정규직" 반환하기
        return "정규직";
    }

    public void setBonus(double bonus) {
        // TODO 76: 보너스 설정하기
        this.bonus = bonus;
    }
}