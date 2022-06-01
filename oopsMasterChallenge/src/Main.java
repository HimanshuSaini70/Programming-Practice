public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","sausage",3.56,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1(" tomato ",0.25);
        hamburger.addHamburgerAddition2(" lettuce",0.5);
        hamburger.addHamburgerAddition3(" cheese",1.15);
        System.out.println("total burger price "+ hamburger.itemizeHamburger() );
    }
}
