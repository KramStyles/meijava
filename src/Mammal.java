public class Mammal {
    public int eyes;
    public String name;
    public String skinColor;
    public int legs;

    public Mammal(int eyes, String name, String skinColor, int legs) {
        this.eyes = eyes;
        this.name = name;
        this.skinColor = skinColor;
        this.legs = legs;
    }

    public void eating(){
        System.out.println("I am eating");
    }

    public void print(){
        System.out.println("I am hungry");
    }

}
