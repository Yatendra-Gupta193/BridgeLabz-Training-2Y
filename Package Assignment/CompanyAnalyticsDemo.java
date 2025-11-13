class SalesReport {
    public void showSales() {
        System.out.println("Region-wise Sales: North=120k, South=95k, East=80k, West=110k");
    }
}
class EmployeeReport {
    public void showPerformance() {
        System.out.println("Employee Performance: Avg Rating = 4.2/5");
    }
}
public class CompanyAnalyticsDemo {
    public static void main(String[] args) {

        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        System.out.println("=== Company Analytics ===");
        s.showSales();
        e.showPerformance();

        System.out.println("\nWhy sub-packages are independent?");
        System.out.println("- Because com.company.analytics.sales and .hr are separate folders.");
        System.out.println("- Sub-packages do NOT automatically inherit from parent packages.");
    }
}
