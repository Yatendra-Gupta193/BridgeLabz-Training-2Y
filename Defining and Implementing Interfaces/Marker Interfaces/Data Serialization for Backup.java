import java.io.*;

class UserData implements Serializable {
    String name = "Krishna";
    int age = 20;
}

public class BackupDemo {
    public static void main(String[] args) {
        try {
            UserData u = new UserData();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.ser"));
            out.writeObject(u);
            out.close();
            System.out.println("Data saved for backup!");
        } catch (Exception e) { e.printStackTrace(); }
    }
}
