// Converting a non-pure String to an int

public class Parse2 {
    public static void main(String[] args) {
        String sVal = " 125"; // " 123" is not a pure numeric string because of the space
        int iVal = Integer.parseInt(sVal); // This cannot be done – you get NumberFormatException

        System.out.println(sVal);
        System.out.println(iVal * 2);
    }
}
