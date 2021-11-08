package meicode.tutorial.oop2;

public class Engine {
    /**
     * Returns the engine of our car
     *
     */

    private String model;
    private int rpm;

    public Engine(String model, int rpm) {
        this.model = model;
        this.rpm = rpm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
