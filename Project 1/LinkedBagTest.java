import java.util.Arrays;

public class LinkedBagTest 
{

	public static void main(String[] args) 
	{
		LinkedBag<String> bag1 = new LinkedBag<String>();
		bag1.add("a");
		bag1.add("b");
		bag1.add("c");
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));
		
		LinkedBag<String> bag2 = new LinkedBag<String>();
		bag2.add("b");
		bag2.add("b");
		bag2.add("d");
		bag2.add("e");
		System.out.println("bag2: " + Arrays.toString(bag2.toArray()));
		

	}

}