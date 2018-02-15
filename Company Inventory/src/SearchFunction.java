import java.io.IOException;
import java.util.Scanner;

public class SearchFunction
	{
		public static void main(String[] args) throws IOException
			{
				
				System.out.println("Please input the name you want");
				Scanner userinput = new Scanner(System.in);
				String ui = userinput.nextLine();
				String userChoice = Searching.searching(ui);
				System.out.println(Searching.searching(ui));
					
			}
	}