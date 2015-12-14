package products;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen Springford
 * @date September 30, 2015
 * @version 1.0
 */
public class Product {

    //properties
    private String productName, description, message;
    private int quantity, minQuantity, productID;
    private double price, productCost;
    private boolean reOrder, productAvailable;
    private Manufacturer builtBy;

    //default constructor
    public Product() {
    }

    //constructor
    public Product(String productName, String description, String message,
            double price, double productCost, int quanity, int minQuanity,
            int productID, boolean reOrder, boolean productAvailable) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.productCost = productCost;
        this.quantity = quantity;
        this.minQuantity = minQuantity;
        this.productID = productID;
        reOrder = false;
        productAvailable = false;
    }

    //set methods//
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //setting a condition so the price can NOT equal zero
    public void setPrice(double price) {
        if (price != 0) {
            this.price = productCost * .22;
            return;
        }
        System.out.println("The price is wrong!");
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
        this.price = productCost * 2.5;
    }

    //setting the Quantity so that if the Quantity is reset to 
    //be reOrdered should it go below the MinQuantity
    public void setQuantity(int quantity) {
        if (quantity <= minQuantity) {
            reOrder = true;
            if (quantity > 0) {
                this.quantity = quantity;
                return;
            }
            System.out.println("Needs to be reordered\n");
        }
        return;
    }

    //set the minimum quantity so that it can not equal zero
    public void setMinQuantity(int minQuantity) {
        if (minQuantity > 0) {
            this.minQuantity = minQuantity;
            return;
        }
        System.out.println("This minimum quantity is unacceptable");
    }

    //set the productID to iterate off of the prod arrayList
    public void setProductID(int productID) {
        this.productID = productID;
    }

    // set the boolean reOrder...all sould be false unless quantity
    // is less than the minimum quantity
    public void setReOrder(boolean reOrder) {
        if (minQuantity < quantity) {
            this.reOrder = false;
            return;
        }
        this.reOrder = true;
        System.out.println("You need to place some orders");
    }


    //the folllowing are my GET methods
    public String getProductName() {
        return this.productName;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public double getProductCost() {
        return this.productCost;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getMinQuantity() {
        return this.minQuantity;
    }

    public int getProductID() {
        return this.productID;
    }

    public boolean getReOrder() {
        return this.reOrder;
    }

    //product available - ready for sale or unavailable
    public boolean changeActivationState(int productID) {
        if (this.productCost > 0.0 && this.price > 0.0
                && ((this.price / this.productCost) - 1) >= .22) {
            return this.productAvailable = true;
        } else {
            return this.productAvailable = false;
        }
    }

    @Override
    public String toString() {
        String productInfo = "";

        productInfo += "\nProduct Name:\t\t" + getProductName();
        productInfo += "\nQuantity in Stock:\t" + getQuantity();
        productInfo += "\nMinimum Allowed:\t" + getMinQuantity();
        productInfo += "\nProduct Cost:\t\t" + getProductCost();
        productInfo += "\nSale Price:\t\t" + getPrice();
//        productInfo += "\nProduct ID:\t\t" + getProd.size();

        return productInfo;
    }
}
