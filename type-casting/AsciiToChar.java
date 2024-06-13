import javax.swing.*;

public class AsciiToChar {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a String: ");
        int a[] = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            a[i] = (int) c;
        }
        for(int i = 0; i < str.length(); i++) {
            System.out.println(" ASCII OF " + str.charAt(i) + " " + a[i]);
        }
    }
}