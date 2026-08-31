package strings.class_problems;

// Shows masked output for valid and invalid numbers.
public class P4_PhoneMaskDemo {

    public static void main(String[] args) {
        PhoneNumberMasker masker = new PhoneNumberMasker();
        String[] numbers = {"9876543210", "98765", "98765abc10"};
        for (String number : numbers) {
            System.out.println(number + " -> " + masker.maskPhoneNumber(number));
        }
    }
}
