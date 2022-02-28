import java.util.Arrays;

public class ArrayBagTest 
{

	public static void main(String[] args) 
	{
		ResizeableArrayBag<String> bag1 = new ResizeableArrayBag<String>(3);
		bag1.add("apples");
		bag1.add("bananas");
		bag1.add("cream");
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));

		ResizeableArrayBag<String> bag2 = new ResizeableArrayBag<String>(4);
		bag2.add("bananas");
		bag2.add("bananas");
		bag2.add("doom");
		bag2.add("extra cheese");
		System.out.println("bag2: " + Arrays.toString(bag2.toArray()));
		
		System.out.print("Union is: " + Arrays.toString(bag1.union(bag2).toArray()) + " ");
		System.out.print("Intersection is: " + Arrays.toString(bag1.intersection(bag2).toArray()) + " ");
		System.out.print("Difference is: " + Arrays.toString(bag1.difference(bag2).toArray()) + " ");
	}

}
