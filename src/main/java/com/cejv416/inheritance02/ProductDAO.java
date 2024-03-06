package com.cejv416.inheritance02;

/**
 * This class simulates a persistence that retrieves data from a database or
 * file
 *
 * @author Ken Fogel
 */
public class ProductDAO {

    public Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product product = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsps")
                || productCode.equalsIgnoreCase("webs")) {
            Book book = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                book.setCode(productCode);
                book.setDescription("Java Programming for Beginners");
                book.setPrice(49.50);
                book.setAuthor("Peter Parker");
            } else if (productCode.equalsIgnoreCase("jsps")) {
                book.setCode(productCode);
                book.setDescription("Server Side Programming with JavaServer Faces");
                book.setPrice(49.50);
                book.setAuthor("Tony Stark");
            } else if (productCode.equalsIgnoreCase("webs")) {
                book.setCode(productCode);
                book.setDescription("Web Services in Java");
                book.setPrice(59.50);
                book.setAuthor("Hal Jordan");
            }
            product = book; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("txtp")) {
            Software software = new Software();
            software.setCode("txtp");
            software.setDescription("TextPad");
            software.setPrice(27.00);
            software.setVersion("4.7.3");
            product = software; // set Product object equal to the Software object
        }
        return product;
    }
}
