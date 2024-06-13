// Simply casting int to char

public class CastingIntToChar {
    public static void main(String[] args) {
        System.out.println((char) 65); // A
        System.out.println((char) ('A' + 1)); // B
        System.out.println((char) ('A' + 2)); // C
        System.out.println((int) 'A'); // 65

        /*The char in Java is really an integer type, 
        so you can use char literals with operators like + or even % */
        System.out.println((char) ('Z' + 5));
        System.out.println((char) ('Z' / 2));
        System.out.println((char) ('Z' % 31));
    }
}
