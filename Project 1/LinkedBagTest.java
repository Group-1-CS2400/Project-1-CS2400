import java.util.Arrays;

public class LinkedBagTest
{

	public static void main(String[] args) 
	{	
		ResizeableArrayBag<String> bag1 = new ResizeableArrayBag<String>(3);
		bag1.add("apples");
		bag1.add("bananas");
		bag1.add("cream");
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));

		LinkedBag<String> bag2 = new LinkedBag<String>();
		bag2.add("bananas");
		bag2.add("bananas");
		bag2.add("doom");
		bag2.add("extra cheese");

		System.out.print("\nUnion is: " + Arrays.toString(bag1.union(bag2).toArray()) + " ");
		System.out.print("\nIntersection is: " + Arrays.toString(bag1.intersection(bag2).toArray()) + " ");
		System.out.print("\nDifference is: " + Arrays.toString(bag1.difference(bag2).toArray()) + " ");
	}

}
