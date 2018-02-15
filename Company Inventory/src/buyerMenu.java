import java.util.*;
import java.io.*;
public class buyerMenu
	{
		public static ArrayList<Item> stock = new ArrayList<Item>();
		public static void main(String[] args)
			{
				fillStock();
				mainBuyer();
				
			}
		public static void mainBuyer()
		{
			System.out.println("Welcome! Are you searching for anything specific today?");
			System.out.println("1) yes");
			System.out.println("2) no");
			Scanner response = new Scanner(System.in);
			int specific = response.nextInt();
			if(specific == 1)
				{
					searchSpecific();
				}
			else if(specific == 2)
				{
					listInventory();
				}
		}
		public static void listInventory()
		{
			System.out.println("Currently In Stock:");
			System.out.println("-------------------");
			for(int x=0; x<stock.size(); x++)
				{
					System.out.println((x+1) + ") " + stock.get(x).getName() + " " + stock.get(x).getWholeSaleCost() + "$");
				}
			System.out.println("-------------------");
			Scanner reply = new Scanner(System.in);
			System.out.println("What would you like to buy?");
			int itemNum = reply.nextInt()-1;
			boolean run = true;
			int amount = 0;
			while(run)
				{
					Scanner intrep = new Scanner(System.in);
					System.out.println("How many would you like to buy? Current Stock: " + stock.get(itemNum).getAmount());
					amount = intrep.nextInt();
					if(amount>stock.get(itemNum).getAmount())
						System.out.println("Sorry we only have " + stock.get(itemNum).getAmount());
					else
						run = false;
				}
			System.out.println("Congradulations on your purchase of " + amount + " " + stock.get(itemNum).getName());
		}
		public static void fillStock()
		{
			String fileName = "StockIndex.txt";
			String line = null;
			FileReader fileReader;
			try
				{
					fileReader = new FileReader(fileName);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					while((line = bufferedReader.readLine()) != null) {
						int x1 = 0;
						int x2 = 0;
						int x3 = 0;
						int x4 = 0;
						boolean one = false;
						boolean two = false;
						boolean three = false;
						for(int x=0; x<line.length(); x++)
							{
								if(line.substring(x,x+1).equals(" ") && one == false)
									{
										x1 = x;
										one = true;
									}
								else if(line.substring(x,x+1).equals(" ") && two == false)
									{
										x2 = x;
										two = true;
									}
								else if(line.substring(x,x+1).equals(" ") && three == false)
									{
										x3 = x;
										three = true;
									}
							}
						stock.add(new Item(line.substring(0, x1), line.substring(x1+1, x2), Integer.parseInt(line.substring(x2+1, x3)), Integer.parseInt(line.substring(x3+1))));
					}
		            bufferedReader.close();
				} 
			catch (FileNotFoundException e)
				{
					System.out.println("Can't find the file");
				} catch (IOException e)
				{
					System.out.println("IOException");
					
				}
		}
		public static void searchSpecific()
		{
			int save = -1;
			boolean run = true;
			while(run)
				{
			Scanner reply = new Scanner(System.in);
			System.out.println("What would you like for us to search for?");
			String subName = reply.nextLine();
			for(int x=0; x<stock.size(); x++)
				{
					if(stock.get(x).getName().indexOf(subName)>=0)
						save = x;
				}
			boolean correct = false;
			if(save!=-1)
				{
					System.out.println("Is your item: " + stock.get(save).getName() + "?");
					System.out.println("1) yes");
					System.out.println("2) no");
					Scanner bool = new Scanner(System.in);
					int truth = bool.nextInt();
					if(truth == 1)
						run = false;
					else
						{
							System.out.println("You will need to use different parameters then.");
						}
				}
			else
				{
					System.out.println("Sorry, your item wasn't found...");
				}
				}
			boolean runs = true;
			int amount = 0;
			while(runs)
				{
					Scanner intrep = new Scanner(System.in);
					System.out.println("How many would you like to buy? Current Stock: " + stock.get(save).getAmount());
					amount = intrep.nextInt();
					if(amount>stock.get(save).getAmount())
						System.out.println("Sorry we only have " + stock.get(save).getAmount());
					else
						runs = false;
				}
			System.out.println("Congradulations on your purchase of " + amount + " " + stock.get(save).getName());
		}
	}