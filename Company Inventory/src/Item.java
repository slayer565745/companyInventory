
public class Item
	{
		String SKU;
		String name;
		int amount;
		int wholeSaleCost;
		
		
		public Item(String s, String n, int a, int w)
		{
			SKU = s;
			name = n;
			amount = a;
			wholeSaleCost = w;
		}


		public String getSKU()
			{
				return SKU;
			}


		public void setSKU(String sKU)
			{
				SKU = sKU;
			}


		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public int getAmount()
			{
				return amount;
			}


		public void setAmount(int amount)
			{
				this.amount = amount;
			}


		public int getWholeSaleCost()
			{
				return wholeSaleCost;
			}


		public void setWholeSaleCost(int wholeSaleCost)
			{
				this.wholeSaleCost = wholeSaleCost;
			}
		

	}
