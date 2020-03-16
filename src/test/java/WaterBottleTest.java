import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    @Before
    public void waterBottle = new WaterBottle(100);

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.volume);
    }

    @Test
    public void canEmpty(){
        waterBottle.empty;
        assertEquals(0, waterBottle.volume);
    }

    @Test
    public void canRefill(){
        waterBottle.empty;
        waterBottle.refill;
        assertEquals(100, waterBottle.volume);
    }
}
