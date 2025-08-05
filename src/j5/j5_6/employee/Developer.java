package j5.j5_6.employee;

class Developer extends Employee {
    private double overtimePay;
    private int overtimeHours;

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
        this.overtimePay = 30000;  // 시간당 야근 수당
    }

    public void setOvertimeHours(int hours) {
        this.overtimeHours = hours;
    }

    @Override
    public double calculateSalary() {
        // TODO 25: 부모의 급여 계산 결과에 야근 수당 더하기
        // super.calculateSalary() + (overtimeHours * overtimePay)
        return super.calculateSalary() + (overtimePay * overtimeHours);
    }

    @Override
    public void printPaySlip() {
        // TODO 26: 부모의 printPaySlip() 호출 후 야근 정보 출력하기
        // super.printPaySlip() 호출
        // "야근 시간: [overtimeHours]시간" 출력
        // "야근 수당: [overtimeHours * overtimePay]" 출력
        // "=================" 출력
        System.out.println("개발자:");
        super.printPaySlip();
        System.out.println("야근 시간: " + overtimeHours + "시간");
        System.out.println("야근 수당: " + (overtimePay*overtimeHours));
        System.out.println("=================");
    }
}