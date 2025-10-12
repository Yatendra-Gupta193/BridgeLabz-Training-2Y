import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeLighting {
    private Map<String, Consumer<String>> handlers = new HashMap<>();
    
    public SmartHomeLighting() {
        handlers.put("motion", location -> System.out.println("Lights ON in " + location));
        handlers.put("voice_on", location -> System.out.println("Voice activated lights in " + location));
        handlers.put("evening", location -> System.out.println("Evening mode in " + location));
        handlers.put("night", location -> System.out.println("Night mode in " + location));
    }  
    public void handleTrigger(String trigger, String location) {
        Consumer<String> handler = handlers.get(trigger);
        if (handler != null) handler.accept(location);
    }    
    public static void main(String[] args) {
        SmartHomeLighting home = new SmartHomeLighting();
        home.handleTrigger("motion", "Kitchen");
        home.handleTrigger("evening", "Living Room");
    }
}
