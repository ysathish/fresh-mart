package pack1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FreshMart {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_ITEMS = 20; // Maximum number of items a user can purchase

    // Arrays to store item details
    String[] productNames = new String[MAX_ITEMS];
    int[] productPrices = new int[MAX_ITEMS];
    int[] productQuantities = new int[MAX_ITEMS];
    int[] productDiscountedPrices = new int[MAX_ITEMS];
    int totalItems = 0;

    int totalBill = 0;
    int totalSaved = 0;

    public void getCode() {
        while (true) {
        	System.out.println(" ◤–—————————————————————————————————————–———————————◥\r\n"
        			+ " ¦▶◀▶▰▱▰▱▰▱▰▱ ▀▄▀▄ 𝕎𝔼𝕃ℂ𝕆𝕄𝔼 𝕋𝕆 𝔻𝔸𝕀𝕃𝕐 𝔽ℝ𝔼𝕊ℍ 𝕄𝔸ℝ𝕋 ▄▀▄▀ ▰▱▰▱▰▱▰▱◀▶▶¦\r\n"
        			+ " ◣––—————————————–———————————————————————–———————————◢");
            System.out.println("1. Go to Main Menu");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                getMenu();
            } else if (choice == 0) {
                System.out.println("Thank you for shopping!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void getMenu() {
        while (true) {
            System.out.println("\n*** MAIN MENU ***");
            System.out.println("1. Groceries");
            System.out.println("2. Fruits & Veggies");
            System.out.println("3. Beverages");
            System.out.println("4. Chocolates");
            System.out.println("5. Snacks");
            System.out.println("0. Start Menu");
            System.out.println("100. To Get Bill");
            System.out.print("Please select an option: ");
            int menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:
                    getGroceries();
                    break;
                case 2:
                    getFruitsAndVeggies();
                    break;
                case 3:
                    getBeverages();
                    break;
                case 4:
                    getChocolates();
                    break;
                case 5:
                    getSnacks();
                    break;
                case 100:
                    getBill();
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void getGroceries() {
        System.out.println("\n*** GROCERIES ***");
        System.out.println("1. Rice - ₹50/kg");
        System.out.println("2. Wheat Flour - ₹40/kg");
        System.out.println("3. Sugar - ₹45/kg");
        System.out.println("0. Previous Menu");
        System.out.print("Please select an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Rice", 50, 45);
                break;
            case 2:
                addItem("Wheat Flour", 40, 38);
                break;
            case 3:
                addItem("Sugar", 45, 42);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void getFruitsAndVeggies() {
        System.out.println("\n*** FRUITS & VEGGIES ***");
        System.out.println("1. Apples - ₹200/kg");
        System.out.println("2. Bananas - ₹40/dozen");
        System.out.println("3. Tomatoes - ₹25/kg");
        System.out.println("0. Previous Menu");
        System.out.print("Please select an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Apples", 200, 190);
                break;
            case 2:
                addItem("Bananas", 40, 38);
                break;
            case 3:
                addItem("Tomatoes", 25, 22);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void getBeverages() {
        System.out.println("\n*** BEVERAGES ***");
        System.out.println("1. Orange Juice - ₹40/ltr");
        System.out.println("2. Coke - ₹50/ltr");
        System.out.println("3. Coffee - ₹80/kg");
        System.out.println("0. Previous Menu");
        System.out.print("Please select an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Orange Juice", 40, 38);
                break;
            case 2:
                addItem("Coke", 50, 48);
                break;
            case 3:
                addItem("Coffee", 80, 75);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void getChocolates() {
        System.out.println("\n*** CHOCOLATES ***");
        System.out.println("1. Dairy Milk - ₹10/piece");
        System.out.println("2. Kitkat - ₹15/piece");
        System.out.println("3. Ferrero Rocher - ₹60/piece");
        System.out.println("0. Previous Menu");
        System.out.print("Please select an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Dairy Milk", 10, 9);
                break;
            case 2:
                addItem("Kitkat", 15, 14);
                break;
            case 3:
                addItem("Ferrero Rocher", 60, 55);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void getSnacks() {
        System.out.println("\n*** SNACKS ***");
        System.out.println("1. Chips - ₹20/pack");
        System.out.println("2. Biscuits - ₹25/pack");
        System.out.println("3. Namkeen - ₹35/pack");
        System.out.println("0. Previous Menu");
        System.out.print("Please select an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addItem("Chips", 20, 18);
                break;
            case 2:
                addItem("Biscuits", 25, 23);
                break;
            case 3:
                addItem("Namkeen", 35, 32);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void addItem(String itemName, int pricePerUnit, int discountedPrice) {
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Store item details in arrays
        productNames[totalItems] = itemName;
        productPrices[totalItems] = pricePerUnit * quantity;
        productQuantities[totalItems] = quantity;
        productDiscountedPrices[totalItems] = discountedPrice * quantity;

        totalBill += productPrices[totalItems];
        totalSaved += (productPrices[totalItems] - productDiscountedPrices[totalItems]);
        totalItems++;

        System.out.println("Added " + quantity + " units of " + itemName + ". Price: ₹" + (pricePerUnit * quantity));
    }

    public void getBill() {
        sc.nextLine(); // Consume newline

        // Customer Details
        System.out.println("\nPlease Enter Your Details:");
        System.out.print("Please Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Please Enter Your Mobile Number: ");
        String mobile = sc.nextLine();
        System.out.print("Please Enter Your Area: ");
        String area = sc.nextLine();

        // Date and Time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // Print Bill
        System.out.println("◤⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔◥\r\n"
        		+ " ¦※⁜※⁜※⁜※⁜※⁜※⁜※⁜※ 𝕎𝔼𝕃ℂ𝕆𝕄𝔼 𝕋𝕆 𝔻𝔸𝕀𝕃𝕐 𝔽ℝ𝔼𝕊ℍ 𝕄𝔸ℝ𝕋 ⁜※⁜※⁜※⁜※⁜※⁜※⁜※⁜¦\r\n"
        		+ " ◣⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕◢");

        System.out.println("\nPurchase Date & Time: " + dtf.format(now));
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-5s %-10s%n", "Product Code", "Product Name", "Price/Kg", "Qty", "Price");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < totalItems; i++) {
            System.out.printf("%-15d %-15s %-10d %-5d %-10d%n", i + 1, productNames[i], productPrices[i] / productQuantities[i], productQuantities[i], productPrices[i]);
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%56s ₹%d/-\n", "🆃🅾🆃🅰🅻:", totalBill);
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%56s ₹%d/- Only.\n", "🅶🆁🅰🅽🅳 🆃🅾🆃🅰🅻:", totalBill - totalSaved);
        System.out.println("---------------------------------------------------------------------");

        System.out.println("\nCustomer Details:");
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Area: " + area);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Thank You!");
        System.exit(0);
    }

    public static void main(String[] args) {
        FreshMart freshMart = new FreshMart();
        freshMart.getCode();
    }
}
