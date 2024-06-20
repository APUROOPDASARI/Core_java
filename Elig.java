class Ex5
{
	public static void main(String[] args)
	{
		int age=25,gyear=2020;
		String gr="graduate";
		if(age>18)
		{
			if(age==25)
			{
				if(gyear<=2020)
				{
					System.out.println("Eligible for MLC");
				}
			}
			else if(age>=50)
			{
				if(gr=="graduate")
				{
					System.out.println("Eligible for MLC");
				}
				else
					System.out.println("Not eligible for MLC");
			}
		}
		else
		{
			System.out.println("Minor");
		}
	}
}