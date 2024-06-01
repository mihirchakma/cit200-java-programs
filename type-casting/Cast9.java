// Casting - Up casting (Always Legal)

public class Cast9 {
    public static void main(String[] args) {
        String strObject = "This is a String";
        System.out.println(strObject);
        System.out.println(strObject.getClass()); // class java.lang.String

        Object objObj = (Object) strObject;
        System.out.println(objObj);
        System.out.println(objObj.getClass());

        Object dnum = 10.56;
        System.out.println("d = " + dnum);
        System.out.println(dnum.getClass()); // class java.lang.Double
    }
}
