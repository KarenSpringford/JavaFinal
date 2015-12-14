package products;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karen Springford
 * @date 10/08/15
 * @version 1.5
 */
public class ProductHelper {

    private static Scanner keyboard = new Scanner(System.in);

    public static void addProduct(ArrayList<Product> prod) {
        prod.add(new Product());

    }

    public static Product findProduct(ArrayList<Product> prod) {
        int productID;
        try {
            System.out.println("Please enter the product id you're looking for: ");
            productID = keyboard.nextInt();
            for (Product p : prod) {
                if (p.getProductID() == productID) {
                    System.out.println(prod.get(productID).toString());
                    return p; 
                }   
            }  System.out.println("There is no such product ID in use");
        } catch (Exception g) {
        }
        return null;
    }

    public static void completeProduct(ArrayList<Product> prod, int e) {

        boolean testAnswer = false;
        do{
            System.out.print("Enter product name: ");
            prod.get(e).setProductName(keyboard.nextLine());
        }while(prod.get(e).getProductName().isEmpty());

        System.out.print("Enter a product description: ");
        prod.get(e).setDescription(keyboard.nextLine());
        do {
            try {
                System.out.print("Enter price for sale: ");
                prod.get(e).setPrice(Double.parseDouble(keyboard.nextLine()));
                testAnswer = true;
            } catch (Exception f) {
                System.out.println("Not an acceptable price");
            }
        } while (!testAnswer);
        testAnswer = false;

    }
}
