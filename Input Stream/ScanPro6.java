import java.util.Scanner;

public class ScanPro6 {
    public static void main(String[] args) {
        
        String gen = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scan.nextLine();

        System.out.print("Enter Employee ID: ");
        int employeeID = scan.nextInt();

        System.out.print("Gender M/F: ");
        char gender = scan.next().charAt(0);

        if ((gender == 'm') || (gender == 'M')) {
            gen = "Male";
        } else if ((gender == 'f') || (gender == 'F')) {
            gen = "Female";
        } else {
            System.out.println("Error - Quitting...");
            System.exit(0);
        }

        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Gender : " + gen);

        scan.close();

    }
}
