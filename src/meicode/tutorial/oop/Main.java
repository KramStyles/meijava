package meicode.tutorial.oop;

public class Main {
    public static void main(String[] args) {
        animal();
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

}
