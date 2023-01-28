import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        // Read inventory.txt and create menu items
        readInventoryFile("inventory.txt", menuItems);
        int exitOption = menuItems.size() + 1;

        displayMenu(menuItems);

        // Get choice from user
        choice = sc.nextInt();

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

    // Read inventory.txt file...

    private static void readInventoryFile(String fileName, ArrayList<MenuItem> items) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {

                // Cappuccino,250
                String tokens[] = line.split(",");
                String name = tokens[0];
                double price = Double.parseDouble(tokens[1]);
                items.add(new MenuItem(name, price));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error - Cannot read from file " + fileName);
        }
    }
}