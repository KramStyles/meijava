public class app {

    public static void main(String[] args) {
        String firstname = "Michael", lastname = "Jamie";
        char Male = 'm', Female = 'f';
        System.out.print("Hello Fuck You Java");
        System.out.println(" How are you doing");
        System.out.println(firstname + " " + lastname + " Gender: " + Male);

        String sentence = firstname + " " + lastname + " Gender: " + Male;
        System.out.println(sentence.length());
        System.out.println(sentence.toUpperCase());

        // Finds where the first occurance of a word or char is located
        System.out.println(sentence.indexOf('M'));

        // Use concat for joining strings

        System.out.println(firstname.concat(lastname));
        int cash = 300000000;
        int multi = cash * 288300000;
        print();

    }

    public static void print(){
        double msg = 10e2d;
        int msg1 = (int) msg;
        System.out.println(msg1);

    }
}
