public class Account {
    private int accountnumber;
    private int balance;
    private String ownerattributes;

    public Account(int accountnumber, int balance, String ownerattributes) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.ownerattributes = ownerattributes;
    }
    public Account() {

    }
    public void withdrawal(int withdrawalmoney){
         this.balance -= withdrawalmoney;
    }
    public void deposit(int depositmoney){
         this.balance += depositmoney;
    }
    public int transaction(String type,int money){
         if(type.equals("withdrawal")){
             this.withdrawal(money);
         }else {
             this.deposit(money);
         }
        return balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwnerattributes() {
        return ownerattributes;
    }
}
