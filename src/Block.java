public class Block
{

	static
	{
		System.out.println("static block " + Block.name);
	}
	static String name = "joshi";

	Block()
	{
		System.out.println("Constroctor");
	}

	{
		System.out.println("non static block");
	}

	public static void main(String[] args)
	{
		new Block();
	}

}
