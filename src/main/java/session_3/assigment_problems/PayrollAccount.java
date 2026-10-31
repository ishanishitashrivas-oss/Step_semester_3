package session_3.assigment_problems;

public class PayrollAccount {
    private double basicSalary;
    private double bonus;

    public PayrollAccount(double openingBasicSalary) {
        if (openingBasicSalary < 0) {
            System.out.println("Warning: Basic salary cannot be negative. Initializing to 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = openingBasicSalary;
        }
        this.bonus = 0;
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus credit rejected: Amount must be positive.");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax deduction rejected: Invalid percentage range.");
        } else {
            this.basicSalary -= (this.basicSalary * (percent / 100.0));
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    public double getNetSalary() {
        return this.basicSalary + this.bonus;
    }

    public static void executePayrollRun() {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }

    public static void main(String[] args) {
        executePayrollRun();
    }
}
