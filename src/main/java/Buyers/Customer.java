package Buyers;

import Cars.Car;

import java.util.ArrayList;

public class Customer {

    // instance Vars
    private String name;
    private double budget;
    private ArrayList<Car> ownedCars;


    // constructor
    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.ownedCars = new ArrayList<Car>();
    }

    // getters

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }


    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setOwnedCars(ArrayList<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }

    // methods

    public int ownedCarsCount(){
        return this.ownedCars.size();
    }

    public String customerBuysCar(Car car){
        if(this.budget > car.getPrice()) {
            ownedCars.add(car);
        }
        return "Can't buy car, not enough money";
    }


    //    public void CustomerBuys(Car car){
//        this.ownedCars.add(car);
//    }


}
