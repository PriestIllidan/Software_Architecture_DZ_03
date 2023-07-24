// 2) Создать конкретный автомобиль путём наследования класса «Car».
public class Honda extends Car implements FillingStation {
    public Honda(String model, String color, BodyType bodyType, FuelType fuelType,
                 GearBoxType gearBoxType, double engineCapacity) {
        super("Honda", model, color, bodyType, fuelType, gearBoxType, engineCapacity);
    }

    @Override
    public void fueling() {
        System.out.println(this.getBrand() + " " + this.getModel() + " fueling " + getFuelType());
    }
}