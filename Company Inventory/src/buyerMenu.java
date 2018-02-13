import java.util.*;
import java.io.*;
public class buyerMenu
	{

		public static void main(String[] args)
			{
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
					// Search function input
				}
			else if(specific == 2)
				{
					listInventory();
				}
		}
		public static void listInventory()
		{
			String fileName = "StockIndex.txt";
			String line = null;
			FileReader fileReader;
			try
				{
					fileReader = new FileReader(fileName);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					while((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
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
	}
