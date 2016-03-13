package main;

import dogs.Alsation;
import dogs.Pitbull;

/**
 * Created by Bloodmonk on 3/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        Alsation bobby = new Alsation();
        Pitbull rex = new Pitbull();
        bobby.bark("My name is bobby woof woof");
        rex.bark("My name is rex woof woof");
    }
}
