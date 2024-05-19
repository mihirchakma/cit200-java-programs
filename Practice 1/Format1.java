/* Number formats with Decimal Format Class in Java */

import java.text.DecimalFormat;

public class Format1 {
    public static void main(String[] args) {
        DecimalFormat dot2 = new DecimalFormat("0.00");

        System.out.println("10/3 = " + dot2.format(10 / 3.0));          // 10/3 = 3.33
        System.out.println("10000/3 = " + dot2.format(10000 / 3.0));    // 10000/3 = 3333.33

        DecimalFormat dot2Com = new DecimalFormat("#,###.00");
        System.out.println("10000/3 = " + dot2Com.format(10000 / 3.0)); // 10000/3 = 3,333.33
    }
}
