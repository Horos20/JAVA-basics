package week10;

public class DeluxeBurger implements Interface {

    private double price;
    private double chips;
    private double drinks;
    public DeluxeBurger() {
        this.price = 14.54;
        this.chips = 2.75;
        this.drinks = 1.81;
        Hamburger hamburger = new Hamburger("Deluxe", "Sausage & Bacon ", this.price, "White");
        hamburger.addHamburgerAddition1("chips", this.chips);
        hamburger.addHamburgerAddition2("drinks", this.drinks);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        return  chips + drinks + this.price;
    }
}
