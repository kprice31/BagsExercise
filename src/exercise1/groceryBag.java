package exercise1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class groceryBag {

	public static void main(String[] args) {
		
		List<String> Item = new ArrayList<>();
			Item.add("soup");
			Item.add("Bacon");
			Item.add("Cheddar cheese");
			Item.add("soup");
			Item.add("Milk");
			Item.add("Chocolate bar");
			Item.add("Strawberries");
			Item.add("Bananas");
			Item.add("Coffee creamer");
			Item.add("soup");
			
		Iterator<String> it = Item.iterator();
		int count = 0;
		System.out.println("Grocery Bag Items:");
		for(String s:Item) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		while(it.hasNext()) {
			String item = it.next();
			if(item.equals("soup")) {
				it.remove();
				count++;
			}
		}
		
		System.out.println("\n" +"Grocery bag items after removing soup: ");
		for(String s: Item) {
			System.out.print(s + ", ");
		}
		
		System.out.println();
		
		if(count > 0)
			System.out.println("\n" + "Soup occured in the grocery list " +
		count + " times");
		else
			System.out.println("\n" + "Grocery bag does not contain any "
					+ "occurance of soup");
		

	}

}
