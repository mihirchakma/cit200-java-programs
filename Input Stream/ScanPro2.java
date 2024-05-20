// Pay Slip 
import java.util.Scanner;

public class ScanPro2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter basic salary Rs: ");
        int basic = scan.nextInt();

        System.out.print("Enter allowance Rs: ");
        float allowance = scan.nextFloat();

        float netSalary = basic + allowance;
        System.out.printf("The net salary is %.2f Rupees", netSalary);

        scan.close();
    }
}
