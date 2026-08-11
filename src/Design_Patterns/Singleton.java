package Design_Patterns;

public class Singleton {
public static void main(String[] args) {
    DatabaseConnection ds =DatabaseConnection.getInstance();
    DatabaseConnection ds2 =DatabaseConnection.getInstance();
    System.out.println(ds == ds2 );
}


}
class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database connected");
    }
}

