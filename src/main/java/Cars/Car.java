package Cars;

import Behaviours.IDrive;

public abstract class Car implements IDrive {

    // instance vars

    private String engine;
    private String tyres;
    private String brakes;
    private String colour;
    private double price;

    // constructor

    public Car(String engine, String tyres, String brakes, String colour, double price) {
        this.engine = engine;
        this.tyres = tyres;
        this.brakes = brakes;
        this.colour = colour;
        this.price = price;
    }

    // getters

    public String getEngine() {
        return engine;
    }

    public String getTyres() {
        return tyres;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    // setters

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
