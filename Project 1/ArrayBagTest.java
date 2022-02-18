import java.util.Arrays;

public class ArrayBagTest 
{

	public static void main(String[] args) 
	{
		ResizableArrayBag<String> bag1 = new ResizableArrayBag<String>(3);
		bag1.add("a");
		bag1.add("b");
		bag1.add("c");
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));

		ResizableArrayBag<String> bag2 = new ResizableArrayBag<String>(4);
		bag2.add("b");
		bag2.add("b");
		bag2.add("d");
		bag2.add("e");
		System.out.println("bag2: " + Arrays.toString(bag2.toArray()));
		
	}

	System.out.print(bag1.union(bag2));

	
}
