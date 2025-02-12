class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    double computePay(int hours) {
        return 0; // To be overridden by subclasses
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per day
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        return 40 * salaryRate; // Fixed salary for 40 hours per week
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John", 100);
        Worker salariedWorker = new SalariedWorker("Alice", 50);

        System.out.println("Daily Worker Salary (worked 48 hours): $" + dailyWorker.computePay(48));
        System.out.println("Salaried Worker Salary (worked 50 hours): $" + salariedWorker.computePay(50));
    }
}
