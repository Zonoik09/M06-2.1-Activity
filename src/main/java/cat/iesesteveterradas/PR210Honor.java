package cat.iesesteveterradas;

import java.sql.*;
import java.util.Scanner;

import static cat.iesesteveterradas.DatabaseManager.*;

public class PR210Honor {
    private static final String DB_URL = "jdbc:sqlite:data/forhonor.db";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                if (!databaseExists(conn)) {
                    initializeDatabase(conn);
                    insertDatabase(conn);
                }
                runProgram(conn);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    private static void runProgram(Connection conn) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n\nChoose an option:");
            System.out.println("1. Show a table");
            System.out.println("2. Show characters by faction");
            System.out.println("3. Show best attacker by faction");
            System.out.println("4. Show best defender by faction");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    showTable(conn, scanner);
                    break;
                case 2:
                    showCharactersByFaction(conn, scanner);
                    break;
                case 3:
                    showBestAttackerByFaction(conn, scanner);
                    break;
                case 4:
                    showBestDefenderByFaction(conn, scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Application closed.");
    }

}

