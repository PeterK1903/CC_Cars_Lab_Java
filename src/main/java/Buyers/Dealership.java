package Buyers;

import Cars.Car;

import java.util.ArrayList;

public class Dealership {

    // Instance Vars
   private String name;
   private double till;
   private ArrayList<Car> stock;
   private Customer customer;

   // constructor
    public Dealership(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<Car>();
    }

    // getter

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    // setter


    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }


    // methods

    public int countStock(){
        return stock.size();
    }

    public String dealershipBuysCar(Car car){
        if(this.till > car.getPrice()) {
            stock.add(car);
        }
        return "Can't buy car, not enough money";
    }

//    public String customerBuysCarFromDealership(Car car, Customer customer){
//        if(this.stock.contains(car)){
//            if(this.customer.getBudget() > car.getPrice()){
//                this.customer.CustomerBuys(car);
//            }
//        }
//        return "Sorry you don't have the budget for this car";
//    }

    public void customerBuysCarFromDealership(Car car, Customer customer){
        if(this.stock.contains(car)){
            stock.remove(car);
            customer.customerBuysCar(car);
        }
    }

}
