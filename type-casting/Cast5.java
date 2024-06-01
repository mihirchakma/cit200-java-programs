// Casting double to int

public class Cast5 {
    public static void main(String[] args) {
        double dnum = 10.567;
        int inum = (int) dnum;     // Loss of precision

        System.out.println(dnum);
        System.out.println(inum);
    }
}
