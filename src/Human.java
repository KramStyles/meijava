public class Human extends Mammal {

    boolean run = true;

    public Human(int eyes, String name, String skinColor, int legs, boolean run) {
        super(eyes, name, skinColor, legs);
        this.run = run;
    }
}
