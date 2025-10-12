import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("john", "jane", "bob", "alice");
        
        List<String> upperCaseNames = employeeNames.stream()
                                                  .map(String::toUpperCase)
                                                  .collect(Collectors.toList());
        
        upperCaseNames.forEach(System.out::println);
    }
}
