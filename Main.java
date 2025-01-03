import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String [] args) {

        ArrayList<Item> itemList = new ArrayList<Item>();
        System.out.println("Hello. I am the Mikail Syed Trademarked Financial Planner. Tell me an item you want to save up for.");

        Scanner scan = new Scanner(System.in);

        String itemName = scan.nextLine();

        System.out.println("How much does this item cost???");

        int itemCost = scan.nextInt();

        // System.out.println(itemName);
        //itemList.add(itemName);
        // Make an Item class that gets the expenses lol
        Item item = new Item(itemName, itemCost);
        itemList.add(item);
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Cost: ");
        System.out.print(itemCost);
        System.out.println("");
        scan.close();
        
    }

    public void hub() {
        System.out.println("What would you like to do?");
        System.out.println("1. Enter a new item");
        System.out.println("2. List current items");
    }

    public void listItems(ArrayList<Item> itemList) {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("Item: " + itemList.get(i).getName());
            System.out.println("Cost: ");
            System.out.print(itemList.get(i).getCost());
            System.out.println("");
        }
    }
}