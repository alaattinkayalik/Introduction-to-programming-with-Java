public class Main {
    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();
        accountManager.deposit(500);
        System.out.println("Hesap Bakiyesi = " + accountManager.getBalance());
        try {
            accountManager.withdraw(500);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hesap Bakiyesi = "+ accountManager.getBalance());
    }
}