package j5.j5_6.employee;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // TODO 23: 부모의 급여 계산 결과에 bonus를 더하기
        // super.calculateSalary() 호출
        return super.calculateSalary() + bonus;
    }

    @Override
    public void printPaySlip() {
        // TODO 24: 부모의 printPaySlip() 호출 후 추가 정보 출력하기
        // super.printPaySlip() 호출
        // "보너스: [bonus]" 출력
        // "=================" 출력
        System.out.println("관리자:");
        super.printPaySlip();
        System.out.println("보너스: " + bonus);
        System.out.println("=================");
    }
}