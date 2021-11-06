import java.util.Random;

public class third {

    public static void main(String[] args) {
        multiplyUp();
    }

    static void randomWithClass() {
        for (int x = 58; x >= 18; x--) {
            Random random = new Random();
            int guess = random.nextInt(100) + 100;
            System.out.println(guess);

        }
    }

    static void randomWithWhile(){
        for(int i = 58; i >= 18; i--){
            float guess = Math.round(Math.random()*200);
            while(guess < 100){
                guess = Math.round(Math.random()*200);
            }
            System.out.println(guess);
        }
    }

    static void whileExamp(){
        int i = 10;
        while(i > 8){
            System.out.println(i++);
        }
    }

    static void multiplyUp(){
        int stopper = 50;
        long result = 1;
        for(int i = 1; i <= stopper; i++){
            result *= i;
            System.out.println(result);
        }
    }

    static void conditions(){
        String d_day = "Weekend";
        if(d_day == "Weekend")
        {
            int time = 12;
            if (time >= 12){
                System.out.println("Let's go to club");
            } else
            {
                System.out.println("Go back to Sleep");
            }
        }
        else if(d_day == "Wednesday") {
            System.out.println("Go to CDS");
        }
        else{
            System.out.println("Go to Work");
        }
    }

}
