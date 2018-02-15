import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Searching
	{
		static String itemName;
		public static String searching(String ui) throws IOException
			{
				
				int userChoice = 0;
				ArrayList <Item> stock = new ArrayList <Item>();
				Scanner file = new Scanner(new File("StockIndex.txt"));
				while(file.hasNextLine())
					{
						String line = file.nextLine();
						String [] catcher = line.split(" ");
						stock.add(new Item(catcher[0], catcher[1], Integer.valueOf(catcher[2]),  Integer.valueOf(catcher[3])));
					}
				ArrayList <Item> catagory = new ArrayList <Item>();
				for(int n = 0; n < stock.size(); n++)
					{
						
						
						if(stock.get(n).getName().indexOf(ui) >= 0)
							{
								catagory.add(stock.get(n));
							}
					}
				if(catagory.size()==0)
					{
						System.out.println("sorry, we don't have what you want");
					}
				else
					{
						System.out.println("Do you mean?");
						for(int a = 1; a < catagory.size()+1; a++)
							{
								
								System.out.println(a + ")  " + catagory.get(a-1).getName());
							}
						Scanner userinput = new Scanner(System.in);
						try
							{
								userChoice = userinput.nextInt();
								
							}
						catch(InputMismatchException e)
							{
								System.out.println("that is not an option");
							}
						itemName = catagory.get(userChoice - 1).getName();
						
					}
				return itemName;
				
				
				
			}

	}
