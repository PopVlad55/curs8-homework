package ex1;

import ex1.Cosmetics;
import ex1.Electronics;
import ex1.Fridge;
import ex1.Product;

public class Main {
    public static void main(String[] args) {
        Cosmetics eyeliner = new Cosmetics(5, "Eyeliner", "Black eyeliner", 5, "Black", 0.1);
        Electronics laptop = new Electronics(899.99, "Laptop", "Gaming laptop", 2, "PC", 20, 8.9, 7.7, 2.7);
        Fridge refrigerator = new Fridge(1299.80, "Fridge", "Portable fridge", 1, "Fridge", 30.0, 28.0, 70.0, 150.0, 4);

        displayProductInfo(eyeliner);
        displayProductInfo(laptop);
        displayProductInfo(refrigerator);
    }
    private static void displayProductInfo(Product product) {
        System.out.println("Product: " + product.name);
        System.out.println("Description: " + product.description);
        System.out.println("Price: $" + product.price);
        System.out.println("Quantity: " + product.quantity);

        if (product instanceof Cosmetics) {
            Cosmetics cosmetics = (Cosmetics) product;
            System.out.println("Color: " + cosmetics.color);
            System.out.println("Weight: " + cosmetics.weight + " kg");
        } else if (product instanceof Electronics) {
            Electronics electronics = (Electronics) product;
            System.out.println("Type: " + electronics.type);
            System.out.println("Dimensions: " + electronics.length + " x " + electronics.width + " x " + electronics.height);
            System.out.println("Weight: " + electronics.weight + " kg");
        } else if (product instanceof Fridge) {
            Fridge fridge = (Fridge) product;
            System.out.println("Temperature: " + fridge.temperature + " °C");
        }

    }

}
