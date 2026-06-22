import javax.management.relation.InvalidRelationIdException;

public abstract class Vehicle {
    private int vehicleId;
    private String brand;
    private double rentPerDay;

    private static int totalVehicles=0;

    Vehicle(int vehicleId,String brand,double rentPerDay){
           this.vehicleId=vehicleId;
           this.brand=brand;
           this.rentPerDay=rentPerDay;
           totalVehicles++;
    }

    
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public abstract double calculateRent(int days) throws InvalidRentLException;

    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", brand=" + brand + ", rentPerDay=" + rentPerDay + "]";
    }


    public static int getTotalVehicles() {
        return totalVehicles;
    }


    public static void setTotalVehicles(int totalVehicles) {
        Vehicle.totalVehicles = totalVehicles;
    }

    
        
    
}
