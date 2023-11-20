package ex1;

public class Electronics extends Product {
    public String type;
    public double length;
    public double width;
    public double height;
    public double weight;

    public Electronics(double price, String name, String description, int quantity, String type, double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
