// Read a name
import java.util.Scanner;

public class ScanPro4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name here: ");
        String name = scan.next();

        System.out.println("My name is " + name);

        scan.close();
    }
}
