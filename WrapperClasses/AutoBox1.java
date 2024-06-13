public class AutoBox1 {
    public static void main(String[] args) {

        Integer iObj = 10; // Autoboxing of int to iObj
        int i = iObj;      // Unboxing of Integer to i
        System.out.println("Primitive " + i + ", Object " + iObj);

        Character cObj = 'A'; // Autoboxing of char 'A'
        char ch = cObj;       // Unboxing of Character 'A'
        System.out.println("Primitive " + ch + ", Object " + cObj);
    }
}
