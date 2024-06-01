// Casting - Downcast 

public class Cast8 {
    public static void main(String[] args) {
        Object senObject = "This is a regular sentence";
        System.out.println(senObject);
        System.out.println(senObject.getClass()); // class java.lang.String

        String aString = (String) senObject;
        System.out.println(aString);
        System.out.println(aString.getClass()); // class java.lang.String

        Object x = 10;
        System.out.println("x = " + x);
        System.out.println(x.getClass()); // class java.lang.Integer
    }
}
