import java.util.Scanner;

public class ForeignLanguages {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        String country = scan.nextLine ( );
        switch (country){
            case "USA":
            case "England":
                System.out.print ( "English" );
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println ( "Spanish");
                break;
            default:
                System.out.println ( "unknown" );
                break;
        }
    }
}
