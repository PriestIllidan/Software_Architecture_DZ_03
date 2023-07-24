public class Main {
    public static void main(String[] args) {
        Car car1 = new Honda("Civic", "Red", BodyType.SEDAN,
                FuelType.AI95, GearBoxType.AUTOMATIC, 2.0);
        Car car2 = new Honda("CR-V", "Blue", BodyType.SUV,
                FuelType.Diesel, GearBoxType.MECHANICAL, 3.0);
//        System.out.println(car1.NUMBEROFWHEELS);
        car1.fueling();
        car2.fueling();
    }
}
