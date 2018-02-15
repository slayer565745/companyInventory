import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class searching
	{
		public String searching(String ui)
			{
				int userChoice = 0;
				ArrayList <Item> catagory = new ArrayList <Item>();
				for(int n = 0; n < buyerMenu.stock.size(); n++)
					{
						if(buyerMenu.stock.get(n).getName().indexOf(ui) >= 0)
							{
								catagory.add(buyerMenu.stock.get(n));
							}
					}
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
				String itemName = catagory.get(userChoice - 1).getName();
				return itemName;
				
				
			}

	}
