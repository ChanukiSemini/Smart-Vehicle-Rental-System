import java.util.ArrayList;
public class RentalService {
    private ArrayList<Vehicle> vehicles=new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void displayVehicle(){
          for (Vehicle v: vehicles){
            System.out.println(v);
          }
    }
    
    public void searchVehicle(int id){
    for (Vehicle v: vehicles){
         if(v.getVehicleId()==id){
            System.out.println(v);
            return;
         }

    }
    System.out.println("vehicle not found");
}
   
    public void searchVehicle(String brand){

        for (Vehicle v: vehicles){
            if(v.getBrand().equalsIgnoreCase(brand)){
                System.out.println(v);
            }
        }
        System.out.println("vEHICLE NOT FOUND");
    }

    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }




}
