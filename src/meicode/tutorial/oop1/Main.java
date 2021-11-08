package meicode.tutorial.oop1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Eye leftEye = new Eye("Left Eye", "Short Sight", "Brown", true);
        Eye rightEye = new Eye("Right Eye", "Normal Sight", "Blue", false);
        Heart heart = new Heart("Heart", "Normal", 70);
        Stomach stomach = new Stomach("Stomach", "PUD", false);
        Skin skin = new Skin ("Skin", "Minor Burns", "Yellow", 40);
        Patient patient = new Patient("Michael Myers", 13, leftEye, rightEye, heart, stomach, skin);

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while (!shouldFinish){
            System.out.println("Choose an Organ: \n\t1. Left Eye\n\t2. Right Eye\n\t3. Heart\n\t4. Stomach\n\t5. Skin\n\t6. Quit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened()){
                        System.out.println("\t\t1. Close the left eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().closed();
                        } else{
                            continue;
                        }
                    } else{
                        System.out.println("\t\t1. Open the left eye");
                        if (scanner.nextInt() == 1){
                            patient.getLeftEye().open();
                        } else continue;
                    }
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened()){
                        System.out.println("\t\t1. Close the right eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().closed();
                        } else{
                            continue;
                        }
                    } else{
                        System.out.println("\t\t1. Open the right eye");
                        if (scanner.nextInt() == 1){
                            patient.getRightEye().open();
                        } else continue;
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the new heart rate");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setHeartRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getHeartRate());
                    } else continue;
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) patient.getStomach().digest();
                    else continue;
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
