package ua.epam.javacore.adapter;

public class DatabaseClient {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
