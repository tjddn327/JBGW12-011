package j5.j5_5.employee;

// 계약직 직원
public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String id, String name, String department, double hourlyRate) {
        // TODO 77: 부모 생성자 호출하고 필드 초기화하기
        // hourlyRate 초기화, hoursWorked = 0
        super(id, name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    @Override
    public double calculateMonthlySalary() {
        // TODO 78: 월급 계산하기
        // hourlyRate * hoursWorked 반환
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getPosition() {
        // TODO 79: "계약직" 반환하기
        return "계약직";
    }

    public void setHoursWorked(int hours) {
        // TODO 80: 근무 시간 설정하기
        this.hoursWorked = hours;
    }
}