package dogs;

import configuration.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Bloodmonk on 3/12/2016.
 */
public class DogTest {
private IDog testDog;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        testDog = (IDog)ctx.getBean("dog");
    }

    @Test
    public void testBark() throws Exception {
        assertTrue(testDog.bark("woof").contains("Alsation"));
    }
}