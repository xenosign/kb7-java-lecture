package classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();

        customer1.name = "홍상우";
        customer1.age = 27;
        customer1.total = 4200;
        customer1.isBlacklist = false;

        System.out.println(customer1.name);
        System.out.println(customer1.age);
        System.out.println(customer1.total);
        System.out.println(customer1.isBlacklist);
    }
}

