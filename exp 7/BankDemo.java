

interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
}
class account implements Bank{
    private double balance;
    public account(double intialbalance){
        this.balance=intialbalance;
    }
    @Override
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: $"+amount);
        }else{
            System.out.println("invalid amount");
        }
    }
    @Override
    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Withdrwan: $"+amount);
        }else{
            System.out.println("invalid amount");
        }
    }
    public void displayDetails(){
        System.out.println("Current Balance: $"+balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        
        account myAccount = new account(1000);
       myAccount.displayDetails();
       myAccount.deposit(1000);
       myAccount.displayDetails();
       myAccount.withdraw(400);
       myAccount.displayDetails();
        
}
}

