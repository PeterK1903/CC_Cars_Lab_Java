package Cars;

import Cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before() {
       electricCar = new ElectricCar("Electric", "Chunky Bois", "Easy Stoppers", "Blue", 24000);
    }

    @Test
    public void getEngine(){
        assertEquals("Electric", electricCar.getEngine());
    }

    @Test
    public void getTyres(){
        assertEquals("Chunky Bois", electricCar.getTyres());
    }

    @Test
    public void getBrakes(){
        assertEquals("Easy Stoppers", electricCar.getBrakes());
    }

    @Test
    public void getColour(){
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void getPrice(){
        assertEquals(24000, electricCar.getPrice(), 0.1);
    }

    @Test
    public void canDrive(){
        assertEquals("Electric cars drive best!", electricCar.drive());
    }

}
