package ex1;

public class Fridge extends Electronics {
    public int temperature;

    public Fridge(double price, String name, String description, int quantity, String type,
                  double length, double width, double height, double weight, int temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }
}
