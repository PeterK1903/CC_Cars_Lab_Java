package Cars;

public class HybridCar extends Car {

    public HybridCar(String engine, String tyres, String brakes, String colour, double price) {
        super(engine, tyres, brakes, colour, price);
    }

    public String drive() {
        return "Hybrid cars drive best!";
    }
}
