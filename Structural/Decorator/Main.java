package LLD.Structural.Decorator;

// Usage
public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: " + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of Coffee with Milk: " + milkCoffee.cost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of Coffee with Milk and Sugar: " + milkSugarCoffee.cost());
    }
}