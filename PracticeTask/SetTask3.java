import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VehicleSetManager {
    public static void main(String[] args) {
        Set<String> vehicleTypes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        vehicleTypes.add("Car");
        vehicleTypes.add("Bike");
        vehicleTypes.add("Truck");
        vehicleTypes.add("Bus");

        do {
            System.out.println("\nVehicle Set Operations:");
            System.out.println("1. Add a Vehicle Type");
            System.out.println("2. Remove a Vehicle Type");
            System.out.println("3. Check if a Vehicle Type Exists");
            System.out.println("4. Display All Vehicle Types");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type to add: ");
                    String newVehicle = scanner.nextLine();
                    if (vehicleTypes.add(newVehicle)) {
                        System.out.println(newVehicle + " added successfully.");
                    } else {
                        System.out.println(newVehicle + " already exists in the set.");
                    }
                    break;

                case 2:
                    System.out.print("Enter vehicle type to remove: ");
                    String removeVehicle = scanner.nextLine();
                    if (vehicleTypes.remove(removeVehicle)) {
                        System.out.println(removeVehicle + " removed successfully.");
                    } else {
                        System.out.println(removeVehicle + " not found in the set.");
                    }
                    break;

                case 3:
                    System.out.print("Enter vehicle type to check: ");
                    String checkVehicle = scanner.nextLine();
                    if (vehicleTypes.contains(checkVehicle)) {
                        System.out.println(checkVehicle + " exists in the set.");
                    } else {
                        System.out.println(checkVehicle + " is not in the set.");
                    }
                    break;

                case 4:
                    System.out.println("Available Vehicle Types: " + vehicleTypes);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
