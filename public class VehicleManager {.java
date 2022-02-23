public class VehicleManager {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setMake("Toyota");
        car.setYear(1990);
        car.setModel("Camry");
        System.out.println("Hi car make  is " + car.getMake());
        System.out.println("The year i was made on is " + car.getYear());
        System.out.println("I am " + car.getModel() + " model");
    }
}