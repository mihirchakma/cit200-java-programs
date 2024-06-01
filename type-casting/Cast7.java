// Casting char to int 

public class Cast7 {
    public static void main(String[] args) {
        char ch = 'A';    // 'char' is 2 bytes
        int inum = 55;    // 'int' is 4 bytes
        ch = (char) inum; // Storing 65 needs 1 byte

        System.out.println(ch);
        System.out.println(inum);
    }
}
