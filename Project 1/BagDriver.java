public class BagDriver
{

	public static void main(String[] args) 
	{
		ResizableArrayBag<String> bag1 = new ResizableArrayBag<String>(3);
		bag1.add("apple");
		bag1.add("banana");
		bag1.add("cabbage");
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));

		ResizableArrayBag<String> bag2 = new ResizableArrayBag<String>(4);
		bag2.add("banana");
		bag2.add("banana");
		bag2.add("doom");
		bag2.add("extra cheese");
		System.out.println("bag2: " + Arrays.toString(bag2.toArray()));
		
	}

	System.out.print(bag1.union(bag2));
	System.out.print(bag1.intersection(bag2));
	System.out.print(bag1.difference(bag2));
	}
}	
