package fundamentals.class_problems;

// Prints original and reversed customer names for verification.
public class P5_ReverseCustomerNameDemo {

    public static void main(String[] args) {
        CustomerNameReverser reverser = new CustomerNameReverser();
        String[] names = {"Sunil", "Priya Sharma"};
        for (String name : names) {
            String reversed = reverser.reverseCustomerName(name);
            System.out.println("Original Name: " + name + " Reversed Name: " + reversed);
        }
    }
}
