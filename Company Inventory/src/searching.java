import java.util.ArrayList;
import java.util.Scanner;

public class searching
	{
		public searching(String ui)
			{
				ArrayList <String> catagory = new ArrayList <String>();
				for(int n = 0; n < ArrayList.size(); n++)
					{
						if(ArrayList.get(n).indexOf(ui) >= 0)
							{
								catagory.add(ArrayList.get(n));
							}
					}
				
			}

	}
