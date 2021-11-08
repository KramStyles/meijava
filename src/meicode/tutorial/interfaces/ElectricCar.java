package meicode.tutorial.interfaces;

public class ElectricCar implements Car{
    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Electric car is started");
    }

    @Override
    public void move(int Speed) {
        System.out.println(this.getName() + " is moving at " + Speed + "mph");
    }
}
