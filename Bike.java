import javax.management.relation.InvalidRelationIdException;

public class Bike extends Vehicle implements Maintanable {
    private boolean helmetIncluded;

    Bike(int vehicleId,String brand,double rentPerDay,boolean helmetIncluded){
        super(vehicleId, brand, rentPerDay);
        this.helmetIncluded=helmetIncluded;
    }

    public boolean gethelmetIncluded(){
        return helmetIncluded;
    }

    public void sethelmetIncluded(boolean helmetIncluded){
        this.helmetIncluded=helmetIncluded;
    }



    public double calculateRent(int days) throws InvalidRentLException{
        if(days<= 0){
            throw new InvalidRentLException("Days must be graeter than 0");
        }

        return  (getRentPerDay()*days)-100; 
    }

    @Override
    public void performMaintenance(){
        System.out.println("Bike mainatenance completed");
    }

    @Override
    public String toString(){
        return "Bike [vehicleId=" + super.getVehicleId() + ", brand=" + super.getBrand() + ", rentPerDay=" + super.getRentPerDay() + ", helmet Included"+helmetIncluded+ "]";
    }

    
}
