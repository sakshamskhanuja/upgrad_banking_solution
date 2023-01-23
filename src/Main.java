import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();

        if (amount <= 0 || time <= 0) {
            System.out.println("invalid input");
            return;
        }

        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }
}

abstract class Homeloan {
    double amount;
    int time;

    //Write your code here
    public Homeloan(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    public abstract double getRateOfInterest();
    public abstract double simpleInterest();
}

class Bank1 extends Homeloan {

    //Write your code here
    public Bank1(double amount, int time) {
        super(amount, time);
    }

    @Override
    public double simpleInterest() {
        if (amount <= 0 || time <= 0) {
            return 0;
        }
        return ((amount * getRateOfInterest() * time) / 100) + amount;
    }

    @Override
    public double getRateOfInterest() {
        return 7.2;
    }

}

class Bank2 extends Homeloan {

    //Write your code here
    public Bank2(double amount, int time) {
        super(amount, time);
    }

    @Override
    public double simpleInterest() {
        if (amount < 0 || time < 0) {
            return 0;
        }
        return ((amount * getRateOfInterest() * time) / 100) + amount;
    }

    @Override
    public double getRateOfInterest() {
        return 8.1;
    }
}