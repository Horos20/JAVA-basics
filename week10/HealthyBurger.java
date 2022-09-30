package week10;

public class HealthyBurger implements healthyInterface {

    private double price;
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        this.price = price;
        System.out.println("Healthy hamburger on a Brown rye roll with " + meat + ", price is " + price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    @Override
    public double itemizeHamburger() {
        return price + healthyExtra1Price + healthyExtra2Price;
    }
}
