// Casting float to int 

public class Cast4 {
    public static void main(String[] args) {
        float fnum = 10.56F;
        int inum = (int) fnum;     // Loss of precision 

        System.out.println(fnum);
        System.out.println(inum);
    }
}
