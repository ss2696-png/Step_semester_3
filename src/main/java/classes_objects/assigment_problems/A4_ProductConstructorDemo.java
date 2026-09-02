package classes_objects.assigment_problems;

// Builds a product through its constructor and prints it.
public class A4_ProductConstructorDemo {
    public static void main(String[] args) {
        Product product = new Product("P-1042", "Wireless Mouse");
        System.out.println(product.productId + " - " + product.productName);
    }
}
