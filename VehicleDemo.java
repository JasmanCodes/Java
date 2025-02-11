class Vehicle {
    protected String brand, model;
    protected double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand + " " + model + " - $" + price);
    }
}

class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + seatingCapacity + ", Fuel: " + fuelType);
    }
}

class ElectricCar extends Car {
    protected int batteryCapacity;
    protected double chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh, Charge Time: " + chargingTime + " hrs");
    }
}

class Motorcycle extends Vehicle {
    protected int engineCapacity;
    protected String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine: " + engineCapacity + " cc, Type: " + type);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        new Car("Toyota", "Camry", 30000, 5, "Petrol").displayDetails();
        System.out.println();
        new ElectricCar("Tesla", "Model 3", 50000, 5, "Electric", 75, 6.5).displayDetails();
        System.out.println();
        new Motorcycle("Yamaha", "R1", 20000, 998, "Sport").displayDetails();
    }
}

