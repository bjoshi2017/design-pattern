public class AnnomynousClass
{

	public static void main(String[] args)
	{
		AnInterface cls = new AnInterface()
		{
			@Override
			public void m1()
			{
				System.out.println("m1 method");
			}

		};
		cls.m1();
	}

}

interface AnInterface
{
	void m1();
}
