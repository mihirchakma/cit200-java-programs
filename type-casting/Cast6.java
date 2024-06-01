// Casting char to int

public class Cast6 {
    public static void main(String[] args) {
        char ch = 'A'; // char is 2 bytes
        int inum = 0;  // int is 4 bytes
        // ch = inum;     // Narrowing - not possible

        System.out.println(ch); // error
        System.out.println(inum); // error 
    }
}
