package encapsulation.class_problems;

// Runs the piggy bank sample from the practice sheet.
public class P1_PiggyBankDemo {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        System.out.println(pb.getId() + " starts at " + pb.getSavings());

        pb.deposit(100);
        System.out.println("deposit(100) -> savings = " + pb.getSavings());

        pb.withdraw(30);
        System.out.println("withdraw(30) -> savings = " + pb.getSavings());

        boolean ok = pb.withdraw(500);
        System.out.println("withdraw(500) -> " + (ok ? "applied" : "rejected") + ", savings stays " + pb.getSavings());
    }
}
