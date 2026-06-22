public class Main {

    public static void main(String[] args){
        RentalService service=new RentalService();

        Vehicle car1=new Car(1, "TOYOTA", 5000, 5);
        Vehicle bike1=new Bike(2, "YAMAHA", 2000, true);

        service.addVehicle(car1);
        service.addVehicle(bike1);

        System.out.println("All Vehicles");
        service.displayVehicle();
        System.out.println();

        System.out.println("Search by ID");
        service.searchVehicle(1);
        System.out.println("Search by Brand");
        service.searchVehicle("YAMAHA");

        System.out.println();

        System.out.println("Polymorphism Example");

        for(Vehicle v: service.getVehicles()){
            try{
            double rent=v.calculateRent(5);
            System.out.println(v.getBrand()+"Rent = "+ rent);
            } catch(InvalidRentLException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Total Vehicles= "+ Vehicle.getTotalVehicles());
    }
    
}
