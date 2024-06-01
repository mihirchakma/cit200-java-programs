// Casting
// What happens if you try to down-cast

public class Cast2 {
    public static void main(String... args) {
        // byte i = (int) 128;           // -128 <= byte <=127
        byte i = (int) 127;              // -128 <= byte <=127
        System.out.println("i = " + i);  // i = -128
    }
}
