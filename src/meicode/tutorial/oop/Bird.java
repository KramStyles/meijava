package meicode.tutorial.oop;

public class Bird extends Dog {
    public int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("A bird love worms");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
