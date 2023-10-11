public class admin {
    private String name;
    private double hourlyWage;
    private int hoursWorked;

    public admin (String name, double hourlyWage, int hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculateWeeklyPay() {
        double weeklyPay = hourlyWage * hoursWorked;
        return weeklyPay;
    }

    public void displayPaycheck() {
        double weeklyPay = calculateWeeklyPay();
        System.out.println("Paycheck for " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly wage: $" + hourlyWage);
        System.out.println("Weekly pay: $" + weeklyPay);
    }

    public static void main(String[] args) {
        admin worker1 = new admin ("John", 15.0, 40);
        admin worker2 = new admin ("Jane", 18.0, 35);

        worker1.displayPaycheck();
        worker2.displayPaycheck();
    }
}
