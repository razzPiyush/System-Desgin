package LLD.Creational.Builder;

// Concrete Builder
class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    public void buildWalls() {
        house.setWalls("Concrete Walls");
    }

    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    public House getHouse() {
        return house;
    }
}