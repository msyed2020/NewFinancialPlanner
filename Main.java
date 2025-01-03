import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String [] args) {

        ArrayList<Item> itemList = new ArrayList<Item>();
        System.out.println("Hello. I am the Mikail Syed Trademarked Financial Planner.");

        hub(itemList);
        
    }

    public static void hub(ArrayList<Item> itemList) {
        Scanner scan = new Scanner(System.in);

        
        while (true) {

            System.out.println("What would you like to do?");
            System.out.println("1. Enter a new item");
            System.out.println("2. List current items");
            System.out.println("3. Exit app");
            int option = scan.nextInt();
            scan.nextLine();
            if (option > 3 || option < 1) {
                System.out.println("Invalid choice. Try again.");
                
            }
            if (option == 1) {
                enterItem(itemList, scan);
                break;
            }
            if (option == 2) {
                listItems(itemList);
                break;
            }
            if (option == 3) {
                System.out.println("Thanks for using us today!");
                scan.close();
                return;
            }
        }
        
    }

    public static void enterItem(ArrayList<Item> itemList, Scanner scan) {

        System.out.println("Tell me an item you want to save up for.");

        String itemName = scan.nextLine();

        System.out.println("How much does this item cost???");

        int itemCost = scan.nextInt();
        scan.nextLine();

        System.out.println("How much would you like to save per month???");

        int saving = scan.nextInt();
        scan.nextLine();

        // System.out.println(itemName);
        //itemList.add(itemName);
        // Make an Item class that gets the expenses lol
        Item item = new Item(itemName, itemCost, saving, 0);
        itemList.add(item);
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Cost: ");
        System.out.print(itemCost);
        System.out.println("");

        hub(itemList);
    }

    public static void listItems(ArrayList<Item> itemList) {
        if (itemList.isEmpty()) {
            System.out.println("No items here.");
        }
        System.out.println("=============");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("");
            System.out.println("Item: " + itemList.get(i).getName());
            System.out.println("Cost: $");
            System.out.print(itemList.get(i).getCost());
            System.out.println("");
            System.out.println("Cost per Month: $");
            System.out.print(itemList.get(i).costPerMonth());
            System.out.println("");
            System.out.println("");
            System.out.println("=============");
        }
        hub(itemList);
    }
}