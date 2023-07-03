

class BankAccount {
    private int balance;

    BankAccount(int bal) {
        balance = bal;
    }

    synchronized public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " +amount+ ". Amount left: " +balance);
    }

    synchronized public void withdraw(int amount) throws InterruptedException {
        if( balance - amount < 0 ){
            throw new InterruptedException();
        }
        else {
            balance -= amount;
            System.out.println("Withdrew " +amount+ ". Amount left: " +balance);
        }
    }
}

class User extends Thread {
    public int userId;
    public int amount;
    public int funcId;
    public BankAccount account;

    User(int id, int amt, int fid, BankAccount acc){
        userId = id;
        amount = amt;
        funcId = fid;
        account = acc;
    }

    public void run() {
        for(int i=0; i<10; i++) {

            if( funcId == 1 ) {
                try {
                    account.withdraw(amount);
                } catch (InterruptedException e) {
                    System.out.println("Withdrawl failed due to insuffecient balance");
                }
            }
            else {
                account.deposit(amount);
            }

            try {
                Thread.sleep(100);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}

public class Ground {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(30);

        User userThread1 = new User(1, 10, 1, account);
        User userThread2 = new User(2, 5, 2, account);

        userThread1.start();
        userThread2.start();

        try {
            userThread1.join();
            userThread2.join();
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
    }
}