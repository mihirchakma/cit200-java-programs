// Converting a non-pure numeric String to an Integer object
// Handling NumberFormatException

public class Parse6 {
    public static void main(String[] args) {
        String strVal = " 125 ";

        try {
            System.out.println(strVal);
            int intVal = Integer.parseInt(strVal.trim());
            System.out.println(intVal);
            System.out.println(intVal * 2);
        } catch (NumberFormatException numberEx) {
            System.out.println("NumberFormatException " + numberEx.getMessage());
        }
    }
}
