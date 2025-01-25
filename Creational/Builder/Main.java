package LLD.Creational.Builder;

// Usage
public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);

        House house = engineer.constructHouse();
        System.out.println(house);
    }
}