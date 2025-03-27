package PracticeTask;
import java.util.*;


class Member {
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}


public class Task7 {
    private static final List<Member> members = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nClub Membership Management");
            System.out.println("1. Add Member");
            System.out.println("2. Delete Member");
            System.out.println("3. List Members");
            System.out.println("4. Search Member");
            System.out.println("5. Update Member");
            System.out.println("6. Sort Members");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1 -> addMember();
                case 2 -> deleteMember();
                case 3 -> listMembers();
                case 4 -> searchMember();
                case 5 -> updateMember();
                case 6 -> sortMembers();
                case 7 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addMember() {
        System.out.print("Enter Member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        members.add(new Member(id, name));
        System.out.println("Member added successfully!");
    }

    private static void deleteMember() {
        System.out.print("Enter Member ID to delete: ");
        int id = scanner.nextInt();
        members.removeIf(member -> member.getId() == id);
        System.out.println("Member deleted successfully!");
    }

    private static void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        System.out.println("Registered Members:");
        members.forEach(System.out::println);
    }

    private static void searchMember() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        members.stream()
               .filter(member -> member.getName().equalsIgnoreCase(name))
               .forEach(System.out::println);
    }

    private static void updateMember() {
        System.out.print("Enter Member ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        for (Member member : members) {
            if (member.getId() == id) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                member.setName(newName);
                System.out.println("Member updated successfully!");
                return;
            }
        }
        System.out.println("Member not found!");
    }

    private static void sortMembers() {
        members.sort(Comparator.comparing(Member::getName));
        System.out.println("Members sorted alphabetically!");
    }
}