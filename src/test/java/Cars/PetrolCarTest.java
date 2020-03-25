package Cars;

import Cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;

    @Before
    public void before() {
        petrolCar = new PetrolCar("Petrol", "Big Wheels", "EBC", "Black", 18000);
    }

    @Test
    public void getEngine(){
        assertEquals("Petrol", petrolCar.getEngine());
    }

    @Test
    public void getTyres(){
        assertEquals("Big Wheels", petrolCar.getTyres());
    }

    @Test
    public void getBrakes(){
        assertEquals("EBC", petrolCar.getBrakes());
    }

    @Test
    public void getColour(){
        assertEquals("Black", petrolCar.getColour());
    }

    @Test
    public void getPrice(){
        assertEquals(18000, petrolCar.getPrice(), 0.1);
    }

    @Test
    public void canDrive(){
        assertEquals("Petrol cars drive best!", petrolCar.drive());
    }

}
