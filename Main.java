import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String [] args) {

        ArrayList<String> itemList = new ArrayList<String>();
        System.out.println("Hello. I am the Mikail Syed Trademarked Financial Planner. Tell me an item you want to save up for.");

        Scanner scan = new Scanner(System.in);

        String itemName = scan.nextLine();

        System.out.println("How much does this item cost???");

        int itemCost = scan.nextInt();

        // System.out.println(itemName);
        itemList.add(itemName);
        // Make an Item class that gets the expenses lol
        Item item = new Item(itemName, itemCost);
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Cost: ");
        System.out.print(itemCost);
        System.out.println("");
        scan.close();
        
    }
}