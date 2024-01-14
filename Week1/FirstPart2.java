//import java.util.Scanner;

import java.util.Scanner;

public class FirstPart2 {
    public static void main(String[] args) {
//        int age = 20;
        int age = getAgeFromUser();
        String rights = "";
        char cma = ',';
        if ( age == 15){
            rights = "You can get a learning permit";
        }
        if (  age >= 16){
            rights += "Can Drive";
        } else {
            rights += "Can Not Drive";
        }
        if (  age >= 18){
            rights += cma + "Can Vote";
        } else {
            rights += cma + "Can Not Vote";
        }
        System.out.printf("Your Rights are: %s", rights);
    }

    public static int getAgeFromUser() {
        int age = 0;
        Scanner s = new Scanner(System.in);
        boolean gotAge = false;
        while ( !gotAge ) {
            System.out.printf("\n Enter your Age(5-130) -> ");
            age = s.nextInt();
            if ( age >= 5 && age <=130 ){
                gotAge = true;
            } else {
                System.out.printf("\n Try again Age from 5-130");
            }
        }
        return age;
    }
}
