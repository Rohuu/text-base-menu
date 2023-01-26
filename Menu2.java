import java.util.Scanner;

public class Menu2 {

    static void displayMenu(int[] options, String[] items, double[] prices) {
        System.out.println("M E N U");
        System.out.println("====================");
        for (int i = 0; i < options.length - 1; i++) {
            System.out.println(options[i] + ". " + items[i] + "    " + prices[i]);
        }
        System.out.println(options[options.length - 1] + ". " + items[items.length - 1]);
        System.out.println("====================");
        System.out.println("Enter choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int[] options = { 1, 2, 3, 4, 5 };
        String[] items = { "Americano", "Cappuccino", "Espresso", "Latte", "Exit" };
        double[] prices = { 180, 210, 230, 195 };
        displayMenu(options, items, prices);

        // Get choice from user
        choice = sc.nextInt();

        // Exit option
        int exitOption = options[options.length - 1];

        // Check choice value
        // while loop, so that loop doesn't end everytime until user presses exit.
        while (choice != exitOption) {
            if (choice == options[0]) {
                System.out.println(items[0] + " Coffee!    " + prices[0]);
            } else if (choice == options[1]) {
                System.out.println(items[1] + " Coffee!    " + prices[1]);
            } else if (choice == options[2]) {
                System.out.println(items[2] + " Coffee!    " + prices[2]);
            } else if (choice == options[3]) {
                System.out.println(items[3] + " Coffee!    " + prices[3]);
            }
            System.out.println();
            // Print menu again
            displayMenu(options, items, prices);

            // Get input from user again
            choice = sc.nextInt();
        }
        System.out.println("Good Bye, Visit Again!");
        System.out.println();
    }
}