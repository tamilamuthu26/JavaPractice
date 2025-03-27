import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityPopulationMap {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        cityPopulation.put("New York", 8419600);
        cityPopulation.put("Los Angeles", 3980400);
        cityPopulation.put("Chicago", 2716000);
        cityPopulation.put("Houston", 2328000);

        do {
            System.out.println("\nCity Population Management:");
            System.out.println("1. Add/Update a City");
            System.out.println("2. Remove a City");
            System.out.println("3. Get Population of a City");
            System.out.println("4. Display All Cities and Populations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter population: ");
                    int population = scanner.nextInt();
                    cityPopulation.put(city, population);
                    System.out.println(city + " updated with population: " + population);
                    break;
                case 2:
                    System.out.print("Enter city name to remove: ");
                    String removeCity = scanner.nextLine();
                    if (cityPopulation.remove(removeCity) != null) {
                        System.out.println(removeCity + " removed successfully.");
                    } else {
                        System.out.println(removeCity + " not found in the map.");
                    }
                    break;
                case 3:
                    System.out.print("Enter city name to check population: ");
                    String checkCity = scanner.nextLine();
                    Integer pop = cityPopulation.get(checkCity);
                    if (pop != null) {
                        System.out.println("Population of " + checkCity + " is " + pop);
                    } else {
                        System.out.println(checkCity + " is not in the map.");
                    }
                    break;
                case 4:
                    System.out.println("City Population Data: ");
                    for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
                        System.out.println(entry.getKey() + " → " + entry.getValue());
                    }
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
