import java.util.*;


public class employeeMenu
	{
		public static void main(String[] args)
			{
				//if selection == 2
				ArrayList<String> cmds = new ArrayList<String>();
			}
		public static void greetEmployee()
		{
			String password = "superhardpassword";
			Scanner c = new Scanner(System.in);
			System.out.println("Please enter your password");
			String passwordTry = c.nextLine();
			if(passwordTry.equals(password))
				{
					//nextMethod();
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
			//
		}
		public static void showOrderHistory()
		{
			
		}
		public static void changePassword()
		{
			
		}
}