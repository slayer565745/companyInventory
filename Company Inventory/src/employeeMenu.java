import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class employeeMenu
	{
		static int employeeMenuChoice;
		static String newPassword;
		static String password = "superhardpassword";
	
		
		public static void greetEmployee()
		{
			
			Scanner c = new Scanner(System.in);
			System.out.println("Please enter your password");
			String passwordTry = c.nextLine();
			Scanner userInput = new Scanner(System.in);
			if(passwordTry.equals(password))
				{
					System.out.println("Would you like to    1) Show expenses");
					System.out.println("                     2) Show order history");
					System.out.println("                     3) Change password");
					employeeMenuChoice = userInput.nextInt();
					if(employeeMenuChoice == 1)
						showExpenses();
					else if(employeeMenuChoice == 2)
						showOrderHistory();
					else
						changePassword();
				}
			else
				{
					System.out.println("Incorrect password, try again");
					greetEmployee();
				}
			//change password
			//access accounting details and expenses
			//show order history 
		}
		public static void showExpenses()
		{
					System.out.println("Here are all of your expenses   ");
		        		
		        		//get method name from accounting module
		        	
        		
		}
		public static void showOrderHistory()
		{
			System.out.println("Here is your employee order history");
			//get method name from accounting module
		}
		public static void changePassword()
		{
			Scanner userInput = new Scanner(System.in);
			if(employeeMenuChoice ==3)
				{
			
			System.out.println("What would you like to change your password to?");
			newPassword = userInput.nextLine();
			password = newPassword;
			System.out.println("Your password has been changed");
				}
		}
}