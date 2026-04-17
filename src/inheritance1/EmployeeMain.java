package inheritance1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee lhs = new Employee();
        lhs.goToWork();
        lhs.getSalary();

        Intern janggre = new Intern();
        janggre.goToWork();
        janggre.getSalary();
        janggre.threeMonthLater();

        Manager ohgwajang = new Manager();
        ohgwajang.goToWork();
        ohgwajang.getSalary();
        ohgwajang.oneYearLater();
    }
}
