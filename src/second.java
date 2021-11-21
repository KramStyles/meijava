public class second{
    public static void main(String[] args) {
        Mammal bingo = new Mammal(2, "Bingo Z. Dante", "Black and White", 3);
        Mammal mario = new Mammal(1, "Mario Johez", "Brown", 4);
        bingo.eating();

        mario.print();

        Human john = new Human(2, "John Business man", "Black", 2, true);
        john.print();



        System.out.println("The name of my dog is " + mario.name);
    }


}