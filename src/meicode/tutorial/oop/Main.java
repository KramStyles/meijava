package meicode.tutorial.oop;

import meicode.tutorial.oop2.Cars;
import meicode.tutorial.oop2.Engine;

public class Main {
    public static void main(String[] args) {
        car();
    }

    static void phone(){
        Phone iPhone = new Phone("Iphone 7 Pro");
        Phone android = new Phone("Phantom 6", 800, 4, 4);

        iPhone.setName("iPhone 6s");
        android.setName("Camon 12 Air");

        System.out.println(iPhone.getName());
        iPhone.playMusic("21 Pilots Heathens");
    }

    static void animal(){
        Bird phoenix = new Bird("Pipi", "Purple & Grey", 3, true, 2);
        phoenix.eat("Rice");
        System.out.println(phoenix.wings);
        System.out.println(phoenix.getWings());
    }

    static void car(){
        Engine engine = new Engine("Renault", 10000);
        Cars mercedes = new Cars("Mercedes ARM", 2, "Black", engine);

        System.out.println(mercedes.getName());
        System.out.println("Engine Model: " + mercedes.getEngine().getModel());
    }

}
