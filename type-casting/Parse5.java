// parseInt(String) returns a primitive int, whereas valueOf(String) returns a new Integer() object.

// Converting a non-pure numeric String to an Integer object
// NumberFormatException occur as " 123 " contains leading and trailing spaces

public class Parse5 {
    public static void main(String[] args) {
        String strVal = " 125 "; // " 125 " string contains leading and trailing spaces
        int intVal = Integer.parseInt(strVal);

        System.out.println(intVal);
        System.out.println(intVal * 2);
    }
}
