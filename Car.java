/* 1) Спроектировать абстрактный класс «Car» у которого должны быть свойства:
марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
*/
public abstract class Car implements FillingStation{

    private String brand;
    private String model;
    private String color;
    private BodyType bodyType;
    final int NUMBEROFWHEELS = 4;
    private FuelType fuelType;
    private GearBoxType gearBoxType;
    private double engineCapacity;

    public void move() {
        System.out.println();
    }

    public void service() {
        System.out.println();
    }

    public void gearShift() {
        System.out.println();
    }

    public int getNUMBEROFWHEELS() {
        return NUMBEROFWHEELS;
    }

    public void turnOnHeadlights() {
        System.out.println();
    }

    public void turnOnWipers() {
        System.out.println();
    }

    public Car(String brand, String model, String color, BodyType bodyType, FuelType fuelType,
               GearBoxType gearBoxType, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

