package encapsulation.assigment_problems;

// Runs the shopping cart sample from the assignment sheet.
public class A5_CartDemo {
    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println(cart.getCartId() + " getTotal() -> " + cart.getTotal());
        System.out.println(cart.getCartId() + " getItemCount() -> " + cart.getItemCount());
    }
}
