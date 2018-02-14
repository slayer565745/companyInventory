import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class employeeMenu
	{
		static int employeeMenuChoice;
		
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
			Scanner userInput = new Scanner(System.in);
			if(passwordTry.equals(password))
				{
					System.out.println("Would you like to    1) Show expenses");
					System.out.println("                     2) Show order history");
					System.out.println("                     3) Change password");
					employeeMenuChoice = userInput.nextInt();
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
			 String fileName = ".txt";

		        // This will reference one line at a time
		        String line = null;

		        try {
		            // FileReader reads text files in the default encoding.
		            FileReader fileReader = 
		                new FileReader(fileName);

		            // Always wrap FileReader in BufferedReader.
		            BufferedReader bufferedReader = 
		                new BufferedReader(fileReader);

		            while((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		            }	

		            // Always close files.
		            bufferedReader.close();			
		        }
		        catch(FileNotFoundException ex) {
		            System.out.println(
		                "Unable to open file '" + 
		                fileName + "'");				
		        }
		        catch(IOException ex) 
		        {
		            System.out.println(
		                "Error reading file '" 
		                + fileName + "'");	
		        }
		            // Or we could just do this: 
		            // ex.printStackTrace();
		        if(employeeMenuChoice == 1)
		        	{
		        		showExpenses();
		        	}
		}
		public static void showOrderHistory()
		{
			
		}
		public static void changePassword()
		{
			
		}
}