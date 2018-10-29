import java.util.ArrayList;

public class BabyRunner
	{

		public static void main(String[] args)
			{
				ArrayList <Baby> nursery = new ArrayList <Baby> ();
				
				nursery.add (new Baby ("Liam", 2.5, "makes rice"));
				nursery.add (new Baby ("Daniel", 20, "surf"));
				nursery.add(new Baby ("Water", 10, "flow"));
				
//				System.out.println(nursery.get(0).getName() + " has the power to " + nursery.get(0).getPower());
				
				
				for (int i = 0; i<nursery.size(); i++)
					{
						System.out.println(nursery.get(i).getWeight());
						System.out.println(nursery.get(i).getName() + " has the power to " + nursery.get(i).getPower());
						nursery.get(i).setWeight(nursery.get(i).getWeight()-1);					}
				
				nursery.remove(0);
				
				for (int i = 0; i<nursery.size(); i++)
					{
						System.out.println(nursery.get(i).getWeight());
						System.out.println(nursery.get(i).getName() + " has the power to " + nursery.get(i).getPower());
					}
				

			}

	}
