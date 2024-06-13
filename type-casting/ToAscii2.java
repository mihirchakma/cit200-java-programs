public class ToAscii2 {
    public static void main(String[] args) {
        for(int a = 65; a <= 90; a++) {
            System.out.println((char) a + " ");
            System.out.println();

            for(int b = 65; b <= 90; b++) {
                System.out.println((char) b + ' ' + " ");
            }
        }
    }
}
