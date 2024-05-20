// Read Boolean
import java.util.Scanner;

public class ScanPro5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Are you above 17? (tur or false): ");
        boolean tof = scan.nextBoolean();

        if(tof)
            System.out.println("You are eligible to Vote.");
        else
            System.out.println("You are ineligible to Vote!");

        scan.close();
    }
}
