import java.util.Scanner;

public class PassedOrFailed {
    public static void main (String [] args){
        Scanner scan = new Scanner ( System.in );
        double grade = Double.parseDouble ( scan.nextLine() );
        if (grade >= 3.00){
            System.out.print("Passed!");
        }else {
            System.out.print("Failed!");
        }
    }
}
