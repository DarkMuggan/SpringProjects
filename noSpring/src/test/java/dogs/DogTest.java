package dogs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/12/2016.
 */
public class DogTest {
    IDog testDog;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testAlsation() throws Exception {
        testDog = new Alsation();
        assertTrue(testDog.bark("woof").contains("Alsation"));
    }
    @Test
    public void testPitbull() throws Exception {
        testDog = new Pitbull();
        assertTrue(testDog.bark("woof").contains("Pitbull"));

    }
}