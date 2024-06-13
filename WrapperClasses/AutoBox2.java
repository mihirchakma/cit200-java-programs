public class AutoBox2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        System.out.println("i = j gives " + (i == j));

        Integer x = 1;
        int y = 1;
        System.out.println("x = y gives " + (x == y));

        Integer obj1 = 1; // autoboxing 
        obj1 = 127;
        Integer obj2 = 127;
        System.out.println("obj1 = obj2 gives: " + (obj1 == obj2));

        Integer obj3 = 150; // Create a pure object obj3 - no autoboxing
        Integer obj4 = 150; // Create a pure object obj4 - no autoboxing
        System.out.println("obj3 = obj4 gives: " + (obj3 == obj4));
    }
}
