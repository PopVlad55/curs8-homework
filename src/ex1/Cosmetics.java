package ex1;

class Cosmetics extends Product {
   public String color;
   public double weight;

    public Cosmetics(double price, String name, String description, int quantity, String color, double weight){
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

}
