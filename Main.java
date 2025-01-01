import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String [] args) {

        ArrayList<String> itemList = new ArrayList<String>();
        System.out.println("Hello. I am the Mikail Syed Trademarked Financial Planner. Tell me an item you want to save up for.");

        Scanner scan = new Scanner(System.in);

        String itemName = scan.nextLine();
        // System.out.println(itemName);
        itemList.add(itemName);
        // Make an Item class that gets the expenses lol
        scan.close();
        
    }
}