class Table {
    private String type;
    private double price;

    Table (String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Type: " + type);
        System.out.printf("Price: %.2f\n", price);
    }
}

class RoundTable extends Table {
    private int diameter;
    private double height;

    RoundTable(int diameter, double height, String type, double price) {
        super(type, price);
        this.diameter = diameter;
        this.height = height;
    }

    public void displayDiameter() {
        System.out.println("Diameter: " + diameter);
    }

    public void displayHeight() {
        System.out.println("Height: " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        RoundTable rt = new RoundTable(6, 5.7, "Tweak", 30_000.00);
        rt.displayDetails();
        rt.displayDiameter();
        rt.displayHeight();
    }
}
