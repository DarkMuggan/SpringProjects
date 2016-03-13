package main;

import configuration.AppConfig;
import dogs.Alsation;
import dogs.IDog;
import dogs.Pitbull;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bloodmonk on 3/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        IDog testDog = (IDog) ctx.getBean("dog");
        testDog.bark("woof");
    }
}
