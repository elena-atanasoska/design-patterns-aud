package singleton.with;

class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton instance;

    private DatabaseConnectionSingleton() {
        System.out.println("Database Connection Created!");
    }

    public static synchronized DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionSingleton();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}

public class MainWithSingleton {
    public static void main(String[] args) {
        DatabaseConnectionSingleton connection1 = DatabaseConnectionSingleton.getInstance();
        connection1.connect();

        DatabaseConnectionSingleton connection2 = DatabaseConnectionSingleton.getInstance();
        connection2.connect();

        System.out.println("\nAre connection1 and connection2 the same instance? " + (connection1 == connection2));
    }
}