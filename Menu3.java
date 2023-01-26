import java.util.ArrayList;
import java.util.Scanner;

public class Menu3 {

    // static void displayMenu(int[] options, String[] items, double[] prices) {
    static void displayMenu(ArrayList<MenuItem> menuItems) {

        System.out.println("M E N U");
        System.out.println("====================");
        for (int i = 0; i <= menuItems.size() - 1; i++) {
            MenuItem item = menuItems.get(i);
            System.out.println(i + 1 + ". " + item.getName() + "    " + item.getPrice());
        }
        System.out.println(menuItems.size() + 1 + ". Exit");
        System.out.println("====================");
        System.out.println("Enter choice: ");
    }

    public static void completeTransaction(int choice, ArrayList<MenuItem> menuItems) {
        MenuItem item = menuItems.get(choice - 1);
        System.out.println("Here is your " + item.getName() + " coffee worth " + item.getPrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Americano", 180));
        menuItems.add(new MenuItem("Cappuccino", 210));
        menuItems.add(new MenuItem("Espresso", 230));
        menuItems.add(new MenuItem("Latte", 195));
        menuItems.add(new MenuItem("Home Made", 10));

        displayMenu(menuItems);

        // Get choice from user
        choice = sc.nextInt();

        // Exit option
        int exitOption = menuItems.size() + 1;

        // Check choice value
        // while loop, so that loop doesn't end everytime until user presses exit.
        while (choice != exitOption) {
            completeTransaction(choice, menuItems);
            System.out.println();
            // Print menu again
            displayMenu(menuItems);

            // Get input from user again
            choice = sc.nextInt();
        }
        System.out.println("Good Bye, Visit Again!");
        System.out.println();
    }
}
