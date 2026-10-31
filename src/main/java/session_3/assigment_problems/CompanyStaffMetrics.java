package session_3.assigment_problems;

class CorporateEmployee {
    private String empName;
    private double salary;
    
    public static String companyName = "Bright Horizon Technologies";
    public static int employeeCount = 0;

    public CorporateEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class CompanyStaffMetrics {
    public static void executeCorporateMetricsRun() {
        CorporateEmployee emp1 = new CorporateEmployee("Amit", 45000);
        CorporateEmployee emp2 = new CorporateEmployee("Bhavna", 55000);
        CorporateEmployee emp3 = new CorporateEmployee("Chirag", 60000);

        CorporateEmployee.printCompanyInfo();
    }

    public static void main(String[] args) {
        executeCorporateMetricsRun();
    }
}
