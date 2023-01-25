/*
 * Suppose that groceryBag is a bag filled to its capacity with 10 strings 
 * that name various groceries. Write Java statements that remove and count 
 * all occurrences of "soup" in groceryBag. Do not remove any other strings 
 * from the bag. Report the number of times that "soup" occurred in the bag. 
 * Accommodate the possibility that groceryBag does not contain any occurrence
 *  of "soup".
 */
package exercise1;

public class groceryBag {
	public static void main(String[] args) {

	int soupCount = 3;
	while(groceryBag.remove("soup"))
		soupCount++;
	System.out.println("Removed " + soupCount + " cans of soup.");
}

	private static boolean remove(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
