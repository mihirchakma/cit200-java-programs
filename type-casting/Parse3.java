// Converting a String with leading and trailing spaces to an int
// Handling NumberFormatException

public class Parse3 {
    public static void main(String[] args) {
        String sVal = " 125"; // " 123 " string contains leading and trailing spaces
        try {
            System.out.println(sVal); // 123 - String
            int iVal = Integer.parseInt(sVal.trim()); // Use trim() method to remove spaces
            System.out.println(iVal); // 123 (Primitive 'int' value) 
            System.out.println(iVal * 2);
        } catch (NumberFormatException exc) {
            System.out.println("NumberFormatException " + exc.getMessage());
        }
    }
}
