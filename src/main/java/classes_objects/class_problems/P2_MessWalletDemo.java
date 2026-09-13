package classes_objects.class_problems;

// Walks the mess wallet through a top-up, an over-limit deduction and a negative opening balance.
public class P2_MessWalletDemo {

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        System.out.println("Balance after top-up: " + wallet.getBalance());
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());

        MessWallet broken = new MessWallet(-50);
        broken.topUp(0);
        System.out.println("Broken wallet balance: " + broken.getBalance());
    }
}
