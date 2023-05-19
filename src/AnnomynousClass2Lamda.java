public class AnnomynousClass2Lamda
{

	public static void main(String[] args)
	{
		AnInterface1 cls = () -> System.out.println("Lamda m1 method");

		cls.m1();
	}

}

interface AnInterface1
{
	void m1();
}
