import java.lang.reflect.Array;

public class main {

    public static void main(String[] args) {
//        for(int i = 58; i >= 18; i--){
////            System.out.println(Math.round(Math.random() * 200));
//            System.out.println(i + " is a number");
//        }
        int i = 58;
        while (i >= 18){
            System.out.println(i + " is our new number");
            i--;
            System.out.println();
        }

        int start = 200;
        int stop = 300;
        String even = "";
        String mutiples_of_3 = "";
        String odd = "";
        for (i = start; i <= stop; i++){
            if (i % 2 == 0){
                even = even + i + ", ";
            }else{
                odd = odd + i + ", ";
            }
            if (i % 3 == 0){
                mutiples_of_3 = mutiples_of_3 + i + ", ";
            }
        }
        System.out.println("even numbers: " + even);
        System.out.println("odd numbers: " + odd);
        System.out.println("Mutiples of 3: " + mutiples_of_3);


    }
}


