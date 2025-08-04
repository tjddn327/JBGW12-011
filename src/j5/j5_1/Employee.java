package j5.j5_1;

/**
 * 직원 정보 클래스
 */
public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter/Setter
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setDepartment(String department) { this.department = department; }

    public void printInfo() {
        System.out.printf("%s (%s부서): %.0f원\n", name, department, salary);
    }
}

