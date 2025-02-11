class Worker {
    protected String name;
    protected double rate;

    public Worker(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double computePay(int hours) {
        return hours * rate;
    }

    public void displayPay(int hours) {
        System.out.println(name + " earns: $" + computePay(hours));
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double computePay(int days) {
        return days * 8 * rate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * rate;
    }
}

public class WorkerDemo {
    public static void main(String[] args) {
        new DailyWorker("John", 20).displayPay(5); 
        new SalariedWorker("Alice", 25).displayPay(50);
    }
}
