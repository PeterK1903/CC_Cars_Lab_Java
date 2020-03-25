package Buyers;

import Cars.ElectricCar;
import Cars.HybridCar;
import Cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    HybridCar hybridCar;
    ElectricCar electricCar;
    Customer customer;

    @Before
    public void before(){
        dealership = new Dealership("Pete's house of cars", 200000);
        petrolCar = new PetrolCar("Petrol", "Big Wheels", "EBC", "Black", 18000);
        hybridCar = new HybridCar("Hybrid", "Avon", "Stark", "Red", 14000);
        electricCar = new ElectricCar("Electric", "Chunky Bois", "Easy Stoppers", "Blue", 240000);
        customer = new Customer("Peter", 16000);
    }

    @Test
    public void canGetName(){
        assertEquals("Pete's house of cars", dealership.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(200000, dealership.getTill(), 0.1);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, dealership.countStock());
    }

    @Test
    public void dealershipBuysCard(){
        dealership.dealershipBuysCar(petrolCar);
        dealership.dealershipBuysCar(hybridCar);
        assertEquals(2, dealership.countStock());
    }

    @Test
    public void tillDoesNotCoverCarCost(){
        assertEquals("Can't buy car, not enough money", dealership.dealershipBuysCar(electricCar));
    }

    @Test
    public void CustomerBuysFromDealership(){
        dealership.dealershipBuysCar(hybridCar);
        dealership.customerBuysCarFromDealership(hybridCar, customer);
        assertEquals(1, customer.ownedCarsCount());
    }
}
