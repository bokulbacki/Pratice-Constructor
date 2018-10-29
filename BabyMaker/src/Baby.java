
public class Baby
	{
		private String name;
		private double weight;
		private String power;
		
		public Baby (String n, double w, String p)
		{
			name=n;
			weight=w;
			power=p;
		}
		
		public static void walk()
		{
			System.out.println("Run brotha.");
		}
		
		public static void eat()
		{
			System.out.println("Feasting season.");
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				this.weight = weight;
			}

		public String getPower()
			{
				return power;
			}

		public void setPower(String power)
			{
				this.power = power;
			}
		
		
		
	}
