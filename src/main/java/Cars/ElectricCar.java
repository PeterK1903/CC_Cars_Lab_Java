package Cars;

public class ElectricCar extends Car {

    public ElectricCar(String engine, String tyres, String brakes, String colour, double price) {
        super(engine, tyres, brakes, colour, price);
    }

    public String drive() {
        return "Electric cars drive best!";
    }
}
