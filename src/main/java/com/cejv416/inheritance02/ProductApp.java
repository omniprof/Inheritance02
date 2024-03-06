package com.cejv416.inheritance02;

import java.util.Scanner;

/**
 * Class that works with data classes that are inherited from a common class
 *
 * @author Ken Fogel
 */
public class ProductApp {

    private final Scanner sc;
    private final ProductDAO productDAO;

    /**
     * Default Constructor
     */
    public ProductApp() {
        //super();
        sc = new Scanner(System.in);
        productDAO = new ProductDAO();
    }

    /**
     *
     * @return
     */
    private char menu() {
        // display a welcome message
        System.out.println("Welcome to the Product Selector");
        System.out.println();
        System.out.println("A: Enter a product code");
        System.out.println("B: Exit");
        char ch;
        do { 
            System.out.println("Enter a char: ");
            if (sc.hasNext("[a-bA-B]")) {
                ch = sc.next().toUpperCase().charAt(0);
            } else {
                ch = 'z';
                System.out.println("Invalid. Please enter A or B: ");
            }
            sc.nextLine();
        } while (ch == 'z');
        return ch;
    }

    /**
     * Retrieve the product code from the user
     *
     * @return productCode The string with the code.
     */
    private String getProductCode() {
        System.out.println("Enter product code: ");
        String productCode = sc.next();  // read the product code
        sc.nextLine();  // discard any other data entered on the line
        return productCode;
    }

    /**
     * Display the contents of a Product object
     *
     * @param p The Product object
     */
    private void displayProduct(Product p) {
        System.out.println();
        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("No product matches this product code.\n");
        }

        System.out.println("Product count: " + Product.getCount() + "\n");
    }

    /**
     * Determine what step is next based on the menu.
     */
    public void perform() {
        while (menu() != 'B') {
            Product p = productDAO.getProduct(getProductCode());
            // display the output
            displayProduct(p);

        }
        System.out.print("Press ENTER to continue");
        sc.nextLine();
    }

    /**
     * Where it all starts
     *
     * @param args
     */
    public static void main(String... args) {

        new ProductApp().perform();
    }
}
