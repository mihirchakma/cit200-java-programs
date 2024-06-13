// Converting String to a value

public class StringToValue1 {
    public static void main(String[] args) {
        String str = "25";
        int i = Integer.valueOf(str).intValue();

        System.out.println("String 25 = " + "Numeric " + i);
        System.out.println("25 x 4 = " + i * 4);
    }
}
