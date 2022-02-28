import java.util.Arrays;
import javax.swing.JOptionPane;

public class BagDriver 
{
    public static void main(String[] args) 
	{
		ResizeableArrayBag<String> bag1 = new ResizeableArrayBag<String>(3);
		bag1.add(JOptionPane.showInputDialog("please input an item to add to your cart"));
		bag1.add(JOptionPane.showInputDialog("please input another item to add to your cart"));
		bag1.add(JOptionPane.showInputDialog("please input another item to add to your cart"));
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));

		ResizeableArrayBag<String> bag2 = new ResizeableArrayBag<String>(4);
		bag2.add(JOptionPane.showInputDialog("please input an item to add to your 2nd cart"));
		bag2.add(JOptionPane.showInputDialog("please input another item to add to your 2nd cart"));
		bag2.add(JOptionPane.showInputDialog("please input another item to add to your 2nd cart"));
		bag2.add(JOptionPane.showInputDialog("please input another item to add to your 2nd cart"));
		System.out.println("bag2: " + Arrays.toString(bag2.toArray()));
		
		System.out.print("If you combine both shopping carts: " + Arrays.toString(bag1.union(bag2).toArray()) + " ");
		System.out.print("Both shopping carts contain: " + Arrays.toString(bag1.intersection(bag2).toArray()) + " ");
		System.out.print("The difference between shopping carts is: " + Arrays.toString(bag1.difference(bag2).toArray()) + " ");
	}
}
