package j5.j5_6.employee;

/**
 * 부모 클래스의 기능을 확장하는 예제
 */
class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void printPaySlip() {
        System.out.println("=== 급여 명세서 ===");
        System.out.println("직원명: " + name);
        System.out.println("기본급: " + baseSalary);
        System.out.println("총 급여: " + calculateSalary());
    }
}