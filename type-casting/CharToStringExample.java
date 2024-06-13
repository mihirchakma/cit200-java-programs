// Converting char to String

public class CharToStringExample {
    public static void main(String[ ] args) {
        char ch = 'U';

        // char to string using Character class
        String charToString = Character.toString(ch);
        System.out.println("Converting Char to String using Character class: " + charToString);

        // char to String using String concatenation
        String str = "" + ch;
        System.out.println("Converting Char to String using String concatenation: " + str);

        // char to String using anonymous array
        String fromChar = new String(new char[] { ch });
        System.out.println("Converting Char to String using anonymous array: " + fromChar);

        // char to String using String valueOf
        String valueOfchar = String.valueOf(ch);
        System.out.println("Converting Char to String using StringvalueOf: " + valueOfchar);
    }
}