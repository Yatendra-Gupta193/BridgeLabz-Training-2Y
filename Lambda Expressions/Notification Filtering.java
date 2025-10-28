import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class HospitalNotificationFiltering {
    static class Alert {
        String type;
        int priority;
        String department;
        
        Alert(String type, int priority, String department) {
            this.type = type;
            this.priority = priority;
            this.department = department;
        }     
        public String toString() {
            return type + " (Priority: " + priority + ", Dept: " + department + ")";
        }
    }   
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", 1, "ICU"),
            new Alert("Warning", 2, "Emergency"),
            new Alert("Info", 3, "General"),
            new Alert("Critical", 1, "Surgery")
        );        
        Predicate<Alert> highPriority = alert -> alert.priority <= 2;
        Predicate<Alert> criticalOnly = alert -> alert.priority == 1;
        Predicate<Alert> emergencyDept = alert -> alert.department.equals("Emergency");
        
        List<Alert> highPriorityAlerts = alerts.stream().filter(highPriority).collect(Collectors.toList());
        System.out.println("High Priority Alerts:");
        highPriorityAlerts.forEach(System.out::println);
        
        List<Alert> criticalAlerts = alerts.stream().filter(criticalOnly).collect(Collectors.toList());
        System.out.println("\nCritical Alerts:");
        criticalAlerts.forEach(System.out::println);
        
        List<Alert> emergencyAlerts = alerts.stream().filter(emergencyDept).collect(Collectors.toList());
        System.out.println("\nEmergency Dept Alerts:");
        emergencyAlerts.forEach(System.out::println);
    }
}
