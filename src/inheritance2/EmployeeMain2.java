package inheritance2;

public class EmployeeMain2 {
    public static void main(String[] args) {
        Employee leeDaeJoo = new Employee("이대주", 3000000);

        leeDaeJoo.goToWork();
        leeDaeJoo.getSalary();

        Intern songJunSoo = new Intern("송준수", 2000000);
    }
}
