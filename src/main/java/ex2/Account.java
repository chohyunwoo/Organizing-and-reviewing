package ex2;

public class Account {
    int balance;


    void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount){
            balance -= amount;
        }else {
            System.out.println("잔액 부족");
        }

    }

    public void print() {
        System.out.println("잔고: " + balance);
    }
}
