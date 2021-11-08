package meicode.tutorial.oop1;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Skin extends Organ {
    private String color;
    private int softness;

    public String getColor() {
        return color;
    }

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color: " + this.getColor());
    }
}
