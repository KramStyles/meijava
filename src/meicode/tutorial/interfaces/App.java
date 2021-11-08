package meicode.tutorial.interfaces;

public class App {
    public static void main(String[] args) {
        Car carInterface = new ElectricCar("Honda");
        carInterface.move(200);
        carInterface.start();
    }
}
