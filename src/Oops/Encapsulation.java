package Oops;

public class Encapsulation {
    public static void main(String[] args) {
BankAccount account= new BankAccount();
account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
class BankAccount{
    private double balance;

    public void deposit(double ammount){
        if (ammount >0){
            balance+=ammount;
        }else {
            System.out.println("invalid ammount");
        }
    }
    public void withdraw(double ammount){
        if (ammount >0 && ammount<=balance){
            balance-=ammount;
        }else {
            System.out.println("invalid withdraw");
        }
    }
    public double getBalance(){
     return balance;
    }
}
