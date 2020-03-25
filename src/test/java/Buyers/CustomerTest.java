package Buyers;

import Cars.ElectricCar;
import Cars.HybridCar;
import Cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    PetrolCar petrolCar;
    HybridCar hybridCar;
    ElectricCar electricCar;
    Customer customer;

    @Before
    public void before() {
        petrolCar = new PetrolCar("Petrol", "Big Wheels", "EBC", "Black", 18000);
        hybridCar = new HybridCar("Hybrid", "Avon", "Stark", "Red", 14000);
        electricCar = new ElectricCar("Electric", "Chunky Bois", "Easy Stoppers", "Blue", 240000);
        customer = new Customer("Peter", 16000);
    }

    @Test
    public void canGetName(){
        assertEquals("Peter", customer.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(16000, customer.getBudget(), 0.1);
    }

    @Test
    public void ownCardStartsEmpty(){
        assertEquals(0, customer.ownedCarsCount());
    }

    @Test
    public void customerBuysCar(){
        customer.customerBuysCar(hybridCar);
        assertEquals(1, customer.ownedCarsCount());
    }

    @Test
    public void tillDoesNotCoverCarCost(){
        assertEquals("Can't buy car, not enough money", customer.customerBuysCar(electricCar));
    }


}
