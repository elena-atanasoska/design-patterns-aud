package singleton.without;

class DatabaseConnectionWithoutSingleton {
    public DatabaseConnectionWithoutSingleton() {
        System.out.println("Database Connection Created!");
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}

public class MainWithoutSingleton {
    public static void main(String[] args) {

        DatabaseConnectionWithoutSingleton connection1 = new DatabaseConnectionWithoutSingleton();
        connection1.connect();

        DatabaseConnectionWithoutSingleton connection2 = new DatabaseConnectionWithoutSingleton();
        connection2.connect();

        System.out.println("\nAre connection1 and connection2 the same instance? " + (connection1 == connection2));
    }
}
