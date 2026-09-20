package encapsulation.class_problems;

// Runs the locker code sample from the practice sheet.
public class P4_LockerDemo {
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.println("changeCode(\"1234\", \"5678\") -> " + result(l.changeCode("1234", "5678")));
        System.out.println("changeCode(\"0000\", \"9999\") -> " + result(l.changeCode("0000", "9999")));
        System.out.println("Locker " + l.getLockerNumber() + " opens with 5678? " + l.unlock("5678"));
    }

    private static String result(boolean ok) {
        return ok ? "success" : "rejected";
    }
}
