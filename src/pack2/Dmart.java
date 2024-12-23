package pack2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Dmart {
	static Scanner sc=new Scanner(System.in);
	static int totalPrice;
	static int totalItems=0;
	static int items[];
	static int totalQuantity;
	int price;
	void getStart() {
		System.out.println(" ◤–—————————————————————————————————————–———————————◥\r\n"
				+ " ¦▶◀▶▰▱▰▱▰▱▰▱ ▀▄▀▄ 𝕎𝔼𝕃ℂ𝕆𝕄𝔼 𝕋𝕆 𝔻𝔸𝕀𝕃𝕐 𝔽ℝ𝔼𝕊ℍ 𝕄𝔸ℝ𝕋 ▄▀▄▀ ▰▱▰▱▰▱▰▱◀▶▶¦\r\n"
				+ " ◣––—————————————–———————————————————————–———————————◢\n");
		System.out.println("1. Menu\n"+ "2. Exit\n");
		System.out.println("Please Select Your Option:");
		int choice=sc.nextInt();
		
		
		
		
		if(choice==1) {
			getMenu();
		}
		else  {
			System.out.println("Thank you Visit Again");
		}
	}
	void getMenu() {
		while(true) {
			System.out.println("***Main Menu***");
			System.out.println("1. Groceries\r\n"
					+ "2. Fruits & Veggies\r\n"
					+ "3. Beverages\r\n"
					+ "4. Chocolates\r\n"
					+ "5. Snacks\r\n"
					+ "0. Start Menu\r\n"
					+ "100. To Get Bill");
			System.out.print("Please select an option: ");
			int menuChoice=sc.nextInt();
			switch(menuChoice) {
			case 1:
				getGroceries();
				break;
			case 2:
				getFruits();
				break;
			case 3:
				getBeverages();
				break;
			case 4:
				getChocalates();
				break;
			case 5:
				getSnacks();
				break;
			case 100:
				getBill();
				break;
			case 0:
				return;
			default:
				System.out.println("Invalid input Please try again");
			}
		}
	}
	public void getGroceries() {
		while(true) {
			System.out.println("*** GROCERIES ***\n");
			System.out.println("1. Rice - ₹50/kg");
			System.out.println("2. Wheat Flour - ₹40/kg");  
			System.out.println("3. Sugar - ₹45/kg");
			System.out.println("0. Previous Menu");
			System.out.print("Please select an option: ");
			int groceriesChoice = sc.nextInt();
			int name[]=new int[groceriesChoice];
			items[groceriesChoice]=name.length;
			
			switch(groceriesChoice) {
			case 1:
				addItems(50);
				totalItems+=1;
				break;
			case 2:
				addItems(40);
				totalItems+=1;
				break;
			case 3:
				addItems(45);
				totalItems+=1;
				break;
			case 0:
				getMenu();
				break;
			default:
				System.out.println("invalid input");
				continue;
			}
		}
	}
	public void getFruits() {
		while(true) {
			System.out.println("\n*** FRUITS & VEGGIES ***");
			System.out.println("1. Apples - ₹200/kg");
			System.out.println("2. Bananas - ₹40/dozen");
			System.out.println("3. Tomatoes - ₹25/kg");
			System.out.println("0. Previous Menu");
			System.out.print("Please select an option: ");
			int fruitsChoice = sc.nextInt();
			switch(fruitsChoice) {
			case 1:
				addItems(200);
				totalItems+=1;
				break;
			case 2:
				addItems(40);
				totalItems+=1;
				break;
			case 3:
				addItems(25);
				totalItems+=1;
				break;
			case 0:
				getMenu();
				totalItems+=1;
				break;
			default:
				System.out.println("invalid input");
				continue;
			}
		}
	}
	public void getBeverages() {
		while(true) {
			System.out.println("\n*** BEVERAGES ***");
			System.out.println("1. Orange Juice - ₹40/ltr");
			System.out.println("2. Coke - ₹50/ltr");
			System.out.println("3. Coffee - ₹80/kg");
			System.out.println("0. Previous Menu");
			System.out.print("Please select an option: ");
			int berChoice=sc.nextInt();
			switch(berChoice) {
			case 1:
				addItems(40);
				totalItems+=1;
				break;
			case 2:
				addItems(50);
				totalItems+=1;
				break;
			case 3:
				addItems(50);
				totalItems+=1;
				break;
			case 0:
				getMenu();
				break;
			default:
				System.out.println("invalid input");
				continue;
			}
		}
	}
	public void getChocalates() {
		while(true) {
			System.out.println("\n*** CHOCOLATES ***");
			System.out.println("1. Dairy Milk - ₹10/piece");
			System.out.println("2. Kitkat - ₹15/piece");
			System.out.println("3. Ferrero Rocher - ₹60/piece");
			System.out.println("0. Previous Menu");
			System.out.print("Please select an option: ");
			int chocalatesChoice=sc.nextInt();
			switch(chocalatesChoice) {
			case 1:
				addItems(10);
				totalItems+=1;
				break;
			case 2:
				addItems(15);
				totalItems+=1;
				break;
			case 3:
				addItems(60);
				totalItems+=1;
				break;
			case 0:
				getMenu();
				break;
			default:
				System.out.println("invalid input");
				continue;
			}
		}
	}
	public void getSnacks() {
		while(true) {
			System.out.println("\n*** SNACKS ***");
			System.out.println("1. Chips - ₹20/pack");
			System.out.println("2. Biscuits - ₹25/pack");
			System.out.println("3. Namkeen - ₹35/pack");
			System.out.println("0. Previous Menu");
			System.out.print("Please select an option: ");
			int snacksChoice=sc.nextInt();
			switch(snacksChoice) {
			case 1:
				addItems(20);
				totalItems+=1;
				break;
			case 2:
				addItems(25);
				totalItems+=1;
				break;
			case 3:
				addItems(35);
				totalItems+=1;
				break;
			case 0:
				getMenu();
				break;
			default:
				System.out.println("invalid input");
				continue;
			}
		}
	}
	public void addItems(int price) {
		this.price=price;
		System.out.print("Please enter the Qyantity :");
		int quantity=sc.nextInt();
		int subTotal=quantity*price;
		System.out.println(" bill: "+subTotal);
		totalQuantity+=quantity;
		totalPrice+=subTotal;
	}
	public void getBill() {
		System.out.println("Please Enter Your Name:");
		String name=sc.next();
		System.out.println("Please Enter Your Mobile Number:");
		long pNumber=sc.nextLong();
		System.out.println("Please Enter Your Area:");
		String area=sc.next();
		LocalDateTime now= LocalDateTime.now();
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss" );
		System.out.println("\r\n"
				+ " ◤⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔◥\r\n"
				+ " ¦※⁜※⁜※⁜※⁜※⁜※⁜※⁜※ 𝕎𝔼𝕃ℂ𝕆𝕄𝔼 𝕋𝕆 𝔻𝔸𝕀𝕃𝕐 𝔽ℝ𝔼𝕊ℍ 𝕄𝔸ℝ𝕋 ⁜※⁜※⁜※⁜※⁜※⁜※⁜※⁜¦\r\n"
				+ " ◣⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕⏕◢\n");
		System.out.println("Purchase Date & Time:                             "+ dt.format(now));
		System.out.println(" ----------------------------------------------------------------------");
		for(int i=0;i<=items.length-1;i++) {
			System.out.println(items[i]);
		}
		System.out.println("Product Code 	Product Name 	Price/Kg 	Qty 	Price");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("🆃🅾🆃🅰🅻: ₹"+totalPrice+"/-");
		System.out.println("---------------------------------------------------------------------");
		int discount=(totalPrice*5)/100;
		int grandTotal=totalPrice-discount;
		System.out.println("Hey!!! You Saved "+ discount + " on your purchase.");
		System.out.println(" ---------------------------------------------------------------------");
		System.out.println("🅶🆁🅰🅽🅳 🆃🅾🆃🅰🅻:  ₹"+grandTotal+"/- Only.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("𝙔𝙤𝙪 𝙋𝙪𝙧𝙘𝙝𝙖𝙨𝙚𝙙"+totalItems+"𝙄𝙩𝙚𝙢𝙨 & 𝐓𝐨𝐭𝐚𝐥 𝐐𝐮𝐚𝐧𝐭𝐢𝐭𝐲 𝐨𝐟 𝐚𝐥𝐥 𝐏𝐮𝐫𝐜𝐡𝐚𝐬𝐞𝐝 𝐈𝐭𝐞𝐦𝐬 𝐢𝐬"+ totalQuantity);
		System.out.println("Thanks You For Shopping With Us\r\n"
				+ "	Visit Us Again\n");
		System.out.println("Customer Details: \n");
		System.out.println("Customer Name:"+name);
		System.out.println("Mobile Number:"+pNumber);
		System.out.println("Area:"+area);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Thank You");  
		System.out.println("---------------------------------------------------------------------");
		System.exit(0);
	}
	public static void main(String[] args) {
		Dmart d=new Dmart();
		d.getStart();
	}
}