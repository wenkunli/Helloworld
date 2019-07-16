package july12;

public class Account {
    private int number;
    private int balance;
    private Employee owner;

    public Account(int number, int balance, Employee owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }
    public void transaction(int amount) throws Exception {
        int result = balance + amount;
        if (result >= 0) {
            balance = result;
        } else {
            throw new Exception("Cannot withdraw below 0");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
}
