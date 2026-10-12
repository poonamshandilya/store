package Oops;

public class Abstraction {
    public static void main(String[] args) {

Payment payment = new UpiPayment();
payment.pay(300);
 payment = new CardPayment();
payment.pay(500);
    }
}
interface Payment{
    void pay(double ammont);
}
class UpiPayment implements Payment{

    @Override
    public void pay(double ammont) {
        System.out.println(ammont + " upipayment");
    }
}
class CardPayment implements Payment{
    public void pay(double ammount){
        System.out.println(ammount + " cardpayment");
    }
}
