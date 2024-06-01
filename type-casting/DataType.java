public class DataType {

    int x = (Integer) 10;
    // Integer y = (int) 10;
    public static void main(String[] args) {
        DataType obj = new DataType();

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getSimpleName());
        
        // System.out.println(x.getClass());
        // System.out.println(y.getClass());

        System.out.println(int.class.getName());
        System.out.println(Integer.class.getName());
        System.out.println(Double.class.getName());
        System.out.println(char.class.getName());
        System.out.println(String.class.getName());
        System.out.println(boolean.class.getName());
        // System.out.println(x.class.getName());
        System.out.println(DataType.class.getName());

    }
}
