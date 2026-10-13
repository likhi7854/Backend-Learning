package digitalwallet;

public class Main {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet("W101", "Likhitha", 1000);

        wallet.addMoney(500);
        wallet.spendMoney(300);
        wallet.spendMoney(2000);
        wallet.addMoney(-100);

        wallet.displayWalletDetails();
        wallet.displayTransactions();
    }
}
