package ParkingLot;

import java.util.*;
import ParkingLot.ParkingSlot.ParkingSlot;
import ParkingLot.vechicle.Vehicle;

public class ParkingLot {
    List<ParkingSlot> slots;
    int capacity;
    Map<Vehicle, ParkingSlot> vechileVsPakringSlot;

    // Applied Singelton pattern so that only one instnace of ParkingLot is created
    private static ParkingLot instance;

    private ParkingLot() {
        this.slots = new ArrayList<>();
        this.capacity = 100;
        vechileVsPakringSlot = new HashMap<>();
        for(int i=0; i<this.capacity; i++){
            slots.add(new ParkingSlot(i));
        }
    };

    public static ParkingLot getInstance(){
        if(instance==null){
            return new ParkingLot();
        }
        return instance;
    }

    public void newVehicle(Vehicle vehicle){
        // fnid the nerest parking slot which is freee
        for(int i=0; i<this.capacity; i++){

        }
    }

    public void leaveVechicle(Vehicle vehicle){

    }

    public List<ParkingSlot> getAvailableParkingSlots(){
        List<ParkingSlot> avialableParkingSlots = new ArrayList<>();

        return avialableParkingSlots;
    }

    public void addParkingSlot(ParkingSlot parkingSlot){
        for(int i=0; i<this.capacity; i++){

        }
    }

}
