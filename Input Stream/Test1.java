import java.util.Scanner;

class Test1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int s = new Scanner("10").nextInt();
        int t = new Scanner("20").nextInt();

        System.out.println("s = " + s + t); // Concatenation
        System.out.println("s = " + (s + t)); // Addition

    }
}