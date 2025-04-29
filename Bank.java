// Banking Sysytem
//Base class 
public class Bank {

    double rate;

    Bank(double rate) {
        this.rate = rate;
    }

    double getRateOfInterest() {
        return rate;
    }
}

// Subclass
class SBI extends Bank {
    SBI(double rate) {
        super(rate);
    }

    double getRateOfInterest() {
        return rate;
    }
}

// SubClass
class ICICI extends Bank {
    ICICI(double rate) {
        super(rate);
    }

    double getRateOfInterest() {
        return rate;
    }
}

class Demo {
    public static void main(String[] args) {

        Bank b = new SBI(3.5);
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

        b = new ICICI(4.6);
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());

        b = new Bank(2.9);
        System.out.println("BANK Rate of Interest: " + b.getRateOfInterest());
    }
}