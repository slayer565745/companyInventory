import java.util.Scanner;
public class greetingMenu
	{

		public static void main(String[] args)
			{
				greet();
				//remove main 
			}
		public static void greet()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello. Are you a buyer or an employee? Press 1 for buyer and 2 for employee");
			int selection = userInput.nextInt();
			if(selection == 1)
				{
					buyerMenu.mainBuyer();
				}
			else if (selection == 2)
				{
					employeeMenu.greetEmployee();
				}
			else
				{
					System.out.println("Sorry that was not an option");
					greet();
				}
		}

	}
