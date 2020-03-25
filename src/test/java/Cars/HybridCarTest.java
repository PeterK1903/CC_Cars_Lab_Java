package Cars;

import Cars.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before() {
        hybridCar = new HybridCar("Hybrid", "Avon", "Stark", "Red", 14000);
    }

    @Test
    public void getEngine(){
        assertEquals("Hybrid", hybridCar.getEngine());
    }

    @Test
    public void getTyres(){
        assertEquals("Avon", hybridCar.getTyres());
    }

    @Test
    public void getBrakes(){
        assertEquals("Stark", hybridCar.getBrakes());
    }

    @Test
    public void getColour(){
        assertEquals("Red", hybridCar.getColour());
    }

    @Test
    public void getPrice(){
        assertEquals(14000, hybridCar.getPrice(), 0.1);
    }

    @Test
    public void canDrive(){
        assertEquals("Hybrid cars drive best!", hybridCar.drive());
    }
}
