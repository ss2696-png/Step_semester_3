package fundamentals.class_problems;

// Reverses a customer name without touching the original string.
public class CustomerNameReverser {

    public String reverseCustomerName(String customerName) {
        if (customerName == null) {
            throw new IllegalArgumentException("Customer name cannot be null");
        }
        char[] letters = customerName.toCharArray();
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            left++;
            right--;
        }
        return new String(letters);
    }
}
