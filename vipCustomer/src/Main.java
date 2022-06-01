public class Main {
    public static void main(String[] args) {
        vipCustomer customer = new vipCustomer("JAVAMASTER",100,"hsaini48@yahoo.com");
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getName());
        vipCustomer customer1 = new vipCustomer();
        System.out.println(customer1.getEmailAddress());
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());

    }
}
