import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("M E N U");
        System.out.println("============");
        System.out.println("1. Americano");
        System.out.println("2. Latte");
        System.out.println("3. Espresso");
        System.out.println("4. Exit");
        System.out.println("============");
        System.out.println("Enter choice: ");

        // Get choice from user
        choice = sc.nextInt();

        // Check choice value
        // while loop, so that loop doesn't end everytime until user presses exit.
        while (choice != 4) {
            if (choice == 1) {
                System.out.println("Americano Coffee!");
            } else if (choice == 2) {
                System.out.println("Latte Coffee!");
            } else if (choice == 3) {
                System.out.println("Espresso Coffee!");
            }

            // Print menu again
            System.out.println();
            System.out.println("M E N U");
            System.out.println("============");
            System.out.println("1. Americano");
            System.out.println("2. Latte");
            System.out.println("3. Espresso");
            System.out.println("4. Exit");
            System.out.println("============");
            System.out.println("Enter choice: ");

            // Get input from user again
            choice = sc.nextInt();
        }
        System.out.println("Good Bye, Visit Again!");
        System.out.println();
    }
}