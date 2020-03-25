package Cars;

public class PetrolCar extends Car {

    public PetrolCar(String engine, String tyres, String brakes, String colour, double price) {
        super(engine, tyres, brakes, colour, price);
    }

    public String drive() {
        return "Petrol cars drive best!";
    }
}
