import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
//        String receipt = simple_interest(45000, 15, 45, "Jerry");
        Scanner buyer = new Scanner(System.in);

        while (true) {
            System.out.println("Enter amount of money: ");
            String buyerMoney = buyer.nextLine();
            fuelPump(Double.parseDouble(buyerMoney));
        }
    }

    static void john() {
        System.out.println("My name is John");
        int a = 20;
        int b = 40;
        System.out.println(Math.abs(a - b));
    }

    static String simple_interest(double principal, double rate, int time, String name) {
        double interest, fullpayment;
        String sentence;

        interest = (principal * rate * time) / 100;
        fullpayment = interest + principal;

        sentence = name + " borrowed: " + principal + " and the interest is: " + interest + ". We expect a fullpayment of " + fullpayment + " soon. Thank you!";
        return sentence;
    }

    static void simple_interest(double principal, double rate, int time) {
        double interest, fullpayment;
        interest = (principal * rate * time) / 100;
        fullpayment = interest + principal;

        System.out.println("John borrowed: " + principal + " and the interest is: " + interest + ". We expect a fullpayment of " + fullpayment + " soon. Thank you!");
    }

    static int adder(int a, int b) {
        int result = a + b;
//        System.out.println(result);
        return result;
    }

    static double adder(double a, double b) {
        double result = a + b;
//        System.out.println(result);
        return result;
    }

    static void fuelPump(double money) {
        double fuel_price = 160;
        double litres = money / fuel_price;
        String receipt = money + " is equivalent to " + litres + " litres at N160 per litre";
        System.out.println(receipt);
    }

}
