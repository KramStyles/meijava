package meicode.tutorial.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public void arrays(){
        ArrayList<String> names = new ArrayList<>();
        List<String> listNames = new ArrayList<>();

        names.add("Iron");
        names.add("Mecury");

        System.out.println(names.get(1));
        System.out.println(names.contains("Iron"));
        System.out.println(names.isEmpty());
    }

    public void maps(){
        HashMap<String, String> emailList = new HashMap<>();
        emailList.put("mick", "michael@gmail.com");
        emailList.put("rick", "rick&morty@movie.com");

        System.out.println(emailList.get("rick"));

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Maureen", 23));
    }

}
