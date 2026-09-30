//3. Constructor Without Parameters
public class WithoutParameters {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
    }
}
class BankAccount{
    int  accountNumber;
    int  balance;
    BankAccount(){
        accountNumber = 1001;
        balance = 5000;
        System.out.println("accountNumber :"+accountNumber);
        System.out.println("balance :"+balance);
    }

}
