//  Area of a rectangular room
import java.util.Scanner;

public class ScanPro1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of the room: ");
        int length = scan.nextInt();

        System.out.print("Enter the breadth of the room: ");
        int breadth = scan.nextInt();

        int area = length * breadth;

        System.out.println("The area of room = " + area + " Sq.Units");

        scan.close();
    }
}
