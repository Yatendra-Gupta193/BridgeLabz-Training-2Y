import java.time.LocalDate;

// Custom Exceptions
class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String m){ super(m); }
}
class InvalidMileageException extends Exception {
    public InvalidMileageException(String m){ super(m); }
}
class Vehicle {
    LocalDate serviceDate;
    int mileage;

    Vehicle(LocalDate date, int mileage) {
        this.serviceDate = date;
        this.mileage = mileage;
    }
    void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (serviceDate.isBefore(LocalDate.now()))
            throw new ServiceOverdueException("Service overdue! Please visit service center.");

        if (mileage < 0)
            throw new InvalidMileageException("Invalid mileage! Mileage cannot be negative.");

        System.out.println("Vehicle is in good condition.");
    }
}
public class VehicleMaintenance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(LocalDate.now().minusDays(2), -100);

        try {
            v.checkMaintenance();
        }
        catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println(e.getMessage());
        }
    }
}
