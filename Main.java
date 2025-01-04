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
            System.out.println("3. Edit an Item");
            System.out.println("4. Exit app");
            int option = scan.nextInt();
            scan.nextLine();
            if (option > 4 || option < 1) {
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
                editItem(itemList, scan);
                break;
            }
            if (option == 4) {
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
            hub(itemList);
            return;
        }
        System.out.println("=============");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("");
            System.out.println("#" + (i + 1) + ": ");
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

    public static void editItem(ArrayList<Item> itemList, Scanner scan) {

        if (itemList.isEmpty()) {
            System.out.println("No items here.");
            hub(itemList);
            return;
        }
        System.out.println("=============");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("");
            System.out.println("#" + (i + 1) + ": ");
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

        System.out.println("Which item would you like to edit??? Input a number here:");
        int option = scan.nextInt();
        scan.nextLine();
        if (option < 1 || option > itemList.size()) {
            System.out.println("Invalid choice.");
            hub(itemList);
            return;
        }
        Item selectedItem = itemList.get(option - 1);
        System.out.println("You have chosen to modify your goal for your " + selectedItem.getName() + ". What would you like to do???");
        System.out.println("1. Confirm this month's savings.");
        System.out.println("2. Edit Item information.");
        System.out.println("3. I've saved money for this item.");
        System.out.println("4. Delete item");
        int option2 = scan.nextInt();
        scan.nextLine();

        if (option2 > 4 || option2 < 1) {
            System.out.println("Invalid choice.");
            hub(itemList);
            return;
        }
        if (option2 == 1) {
            System.out.println("Do you want to use your Amount Saved or subtract your Monthly Saving goal???");
            System.out.println("1. Amount Saved");
            System.out.println("2. Monthly Saving Goal");
            int choice = scan.nextInt();
            scan.nextLine();

            if (choice < 1 || choice > 2) {
                System.out.println("Invalid choice.");
                hub(itemList);
                return;
            }
            if (choice == 1) {
                selectedItem.setCost(selectedItem.getCost() - selectedItem.getAmountSaved());
            }
            if (choice == 2) {
                selectedItem.setCost(selectedItem.getCost() - selectedItem.getSavingGoal());
            }
            
            System.out.println("We've updated the cost!");
        }
        if (option2 == 2) {
            // create function for editing item
        }
        if (option2 == 3) {
            System.out.println("Do you want to enter your monthly saving goal or a manual amount???");
            System.out.println("1. Monthly Saving Goal");
            System.out.println("2. Manual Amount");
            int choice = scan.nextInt();
            scan.nextLine();
            if (choice < 1 || choice > 2) {
                System.out.println("Invalid choice.");
                hub(itemList);
                return;
            }
            if (choice == 1) {
                selectedItem.setAmountSaved(selectedItem.getAmountSaved() + selectedItem.getSavingGoal());
            }
            if (choice == 2) {
                System.out.println("How much have you saved now???");
                int amount = scan.nextInt();
                scan.nextLine();
                selectedItem.setAmountSaved(selectedItem.getAmountSaved() + amount);
            }
        }
        if (option2 == 4) {
            String oldItem = selectedItem.getName();
            itemList.remove(selectedItem);
            System.out.println("You have removed " + oldItem + ".");
        }

        hub(itemList);

    }

    public static void editItem(Item selectedItem, Scanner scan, ArrayList<Item> itemList) {
        System.out.println("What would you like to do???:");
        System.out.println("1. Change Item Name");
        System.out.println("2. Change Item Cost");
        System.out.println("3. Change Saving Goal");
        System.out.println("4. Change Amount Saved");

        int choice = scan.nextInt();
        scan.nextLine();
        if (choice < 1 || choice > 4) {
            hub(itemList);
            return;
        }
        if (choice == 1) {
            System.out.println("Please enter a new name: ");
            String newName = scan.nextLine();
            scan.nextLine();
            selectedItem.setName(newName);
        }
        if (choice == 2) {
            System.out.println("Please enter a new cost: ");
            int newCost = scan.nextInt();
            scan.nextLine();
            selectedItem.setCost(newCost);
        }
        if (choice == 3) {
            System.out.println("Please enter a saving goal: ");
            int newGoal = scan.nextInt();
            scan.nextLine();
            selectedItem.setSavingGoal(newGoal);
        }
        if (choice == 4) {
            System.out.println("Please enter an amount saved: ");
            int newAmount = scan.nextInt();
            scan.nextLine();
            selectedItem.setAmountSaved(newAmount);
        }
        hub(itemList);
    }
}