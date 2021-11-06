package meicode.tutorial.oop;

public class Phone {
    private String name;
    int screenSize;
    int ram;
    int camera;

    public Phone(String name, int screenSize, int ram, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.ram = ram;
        this.camera = camera;
    }

    public Phone(String name) {
        this.name = name;
    }

    public void playMusic(String track){
        System.out.println("Playing song: " + track);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
