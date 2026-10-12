package Thread.com;
class PrimeThread extends Thread {
    private int limit;

    public PrimeThread(int limit) {
        this.limit = limit;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        System.out.println("Prime Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenOddThread extends Thread {
    private int limit;

    public EvenOddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("\nEven and Odd Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ArmstrongThread extends Thread {
    private int limit;

    public ArmstrongThread(int limit) {
        this.limit = limit;
    }

    private boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int n = String.valueOf(num).length();
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem,n);
            temp /= 10;
        }
        return sum == num;
    }

    public void run() {
        System.out.println("\nArmstrong Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.println("Armstrong: " + i);
            }
            try {
                Thread.sleep(500); // Simulating processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        int primeLimit = 20, evenOddLimit = 20, armstrongLimit = 200;

        PrimeThread th1 = new PrimeThread(primeLimit);
        EvenOddThread th2 = new EvenOddThread(evenOddLimit);
        ArmstrongThread th3 = new ArmstrongThread(armstrongLimit);

       th1.start();
        th2.start();
        th3.start();

        /*try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("\nAll threads finished execution.");
    }
}
