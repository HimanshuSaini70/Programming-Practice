public class vipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public vipCustomer(){
    this("Himanshu",500,"manshu48@gmail.com");
        System.out.println("first constructor is called");
    }
    public vipCustomer(String name ,double creditLimit){

this(name,creditLimit,"manshu48@gmail.com");
        System.out.println("second constructor has been called");
    }
    public vipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
