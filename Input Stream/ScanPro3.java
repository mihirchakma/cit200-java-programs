// Read a sentence
import java.util.Scanner;

public class ScanPro3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = scan.nextLine();

        System.out.println("The entered sentence is \"" + line + "\"");

        scan.close();
    }
}
