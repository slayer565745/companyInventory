import java.util.ArrayList;
import java.util.Scanner;

public class searching
	{
		public searching(String ui)
			{
				ArrayList <Item> catagory = new ArrayList <Item>();
				for(int n = 0; n < ArrayList.size(); n++)
					{
						if(ArrayList.get(n).getName().indexOf(ui) >= 0)
							{
								catagory.add(ArrayList.get(n));
							}
					}
				System.out.println("Do you mean?");
				for(int a = 1; a < catagory.size()+1; a++)
					{
						System.out.println(a + ")  " + catagory.get(a-1));
					}
				
			}

	}
