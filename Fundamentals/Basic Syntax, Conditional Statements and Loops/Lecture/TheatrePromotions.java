import java.util.Scanner;

public class TheatrePromotions {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        String dayType = sc.nextLine ();
        int age = Integer.parseInt ( sc.nextLine () );
        int price = 0;
        if (age >= 0 && age <= 18){
            switch (dayType){
                case "Weekday": price = 12;
                    break;
                case "Weekend": price = 15;
                    break;
                case "Holiday": price = 5;
                    break;
            }
        }else if (age > 18 && age <= 64){
            switch (dayType){
                case "Weekday": price = 18;
                    break;
                case "Weekend": price = 20;
                    break;
                case "Holiday": price = 12;
                    break;
            }
        }else if (age > 64 && age <=122){
            switch (dayType){
                case "Weekday": price = 12;
                    break;
                case "Weekend": price = 15;
                    break;
                case "Holiday": price = 10;
                    break;
            }
        }else{
            System.out.print ("Error!");
            return;
        }
        System.out.printf ("%d$",price );
    }
}
