package digitalwallet;

public class DigitalWallet {
     private String walletId;
     private String ownerName;
     private double balance;
     private double[] transactions;
     private  int transactionCount;

    public DigitalWallet(String walletId, String ownerName, double balance) {
        this.walletId = walletId;
        this.ownerName = ownerName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid starting balance!");
        }

        transactions = new double[5];
        transactionCount = 0;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }


    public double[] getTransactions() {
        return transactions;
    }

    public void setTransactions(double[] transactions) {
        this.transactions = transactions;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else if (transactionCount >= transactions.length) {
            System.out.println("Transaction history is full!");
        } else {
            balance += amount;
            transactions[transactionCount] = amount;
            transactionCount++;

            System.out.println("Deposit successful: " + amount);
        }
    }

    public void spendMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (transactionCount >= transactions.length) {
            System.out.println("Transaction history is full!");
        } else {
            balance -= amount;
            transactions[transactionCount] = -amount;
            transactionCount++;

            System.out.println("Payment successful: " + amount);
        }
    }

    public void displayTransactions() {
        System.out.println("\nTransaction History:");

        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }

    public void displayWalletDetails() {
        System.out.println("Wallet ID: " + walletId);
        System.out.println("Owner: " + ownerName);
        System.out.println("Current Balance: " + balance);
    }


}
