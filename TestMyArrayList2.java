/*
 *   Do not remove any code from this file
 *   
 *   Replace Step 1, Step 2, etc with the code described in the comments.
 */


public class TestMyArrayList2 {

	public static void display(MyCollection<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {

		MyCollection<String> arrS = new MyArrayList<>();

		System.out.println("Original list:");
		arrS.add(new String("cat house"));
		arrS.add(new String("dog"));
		arrS.add(new String("wxyz"));
		arrS.add(new String("hello"));
		arrS.add(new String("television"));
		arrS.add(new String("eleven"));

		for (String s : arrS) {
			System.out.println(s);
		}
		System.out.println();
		MyCollection<String> tmp = new MyArrayList<>();
		tmp.add(new String("one"));
		tmp.add(new String("two"));
		System.out.println();
		System.out.println("Results from removeAll: " + arrS.removeAll(tmp)); // false
		for (String s : arrS) {
			System.out.println(s);
		}

		tmp.add(new String("eleven"));
		tmp.add(new String("dog"));
		System.out.println();
		System.out.println("Results from retainAll: " + arrS.retainAll(tmp)); // true
		for (String s : arrS) {
			System.out.println(s);
		}
		System.out.println();
		arrS.add(new String("ay"));
		arrS.add(new String("restaurant"));
		arrS.add(new String("string"));
		arrS.add(new String("zoology"));
		arrS.add(new String("tune"));
		System.out.println("Display new contents of the arraylist");
		for (String s : arrS) {
			System.out.println(s);
		}
		System.out.println();
		
		/**  STEP 1 
		 *   Use the sort method and a lambda expression to sort by
		 *   length in ascending order.
		 */
		
		System.out.println("Sort by ascending length");
		for (String s : arrS) {
			System.out.println(s);
		}

		System.out.println();
		/**  STEP 2 
		 *   Use the sort method and a lambda expression to sort in
		 *   reverse lexigraphical ordering
		 */
		
		System.out.println("Sort by reverse lexigraphical ordering");
		for (String s : arrS) {
			System.out.println(s);
		}
		
		System.out.println();
		
		
		System.out.println("\nUse forEach to display in upper-case");
		/**  STEP 3 
		 *   Use the forEach method and a lambda expression to display
		 *   contents of the Strings in upper-case characters.
		 */
		System.out.println("\nUse forEach to display length of each String");
		/**  STEP 4 
		 *   Use the forEach method and a lambda expression to display
		 *   the length of each String
		 */
		
		System.out.println();
		try {
			MyCollection<String> tmp2 = arrS.subList(-1, 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds");
		}
		
		try {
			MyCollection<String> tmp2 = arrS.subList(1, 100);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds");
		}
		
		try {
			MyCollection<String> tmp2 = arrS.subList(2, 1);
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument Exception");
		}
		
		MyCollection<String> tmp2 = arrS.subList(1, 4);
		System.out.println("\nDisplay Contents of sublist");
		for (String s : tmp2) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Results from removeAll: " + arrS.removeAll(tmp2)); // true
		for (String s : arrS) {
			System.out.println(s);
		}
		System.out.println("\nExample of using the replaceAll method: ");
		// Add an 's' to each String
		arrS.replaceAll(s -> new String(s + "s"));
		System.out.println();
		for (String s : arrS) {
			System.out.println(s);
		}
		
		MyCollection<Person> arrP = new MyArrayList<>();
		
		arrP.add(new Person("Pilar", "Ess", 33));
		arrP.add(new Person("Max", "Smith", 50));
		arrP.add(new Person("Max", "Smith", 50));
		arrP.add(new Person("Max", "Smith", 50));
		arrP.add(new Person("Graham", "Monday", 16));
		arrP.add(new Person("Diane", "Jones", 40));
		arrP.add(new Person("Diane", "Jones", 40));
		arrP.add(new Person("Cindy", "R", 22));
		System.out.println("\nUse forEach to display the Person list: ");
		/**  STEP 5
		 *   Use the forEach method and a lambda expression to display
		 *   the toString method in the Person class.
		 */
		arrP.forEach(p -> System.out.println(p));
		System.out.println();
		/**  STEP 6
		 *   Use the replaceAll method and a lambda expression to increment age by 1
		 */
		
		System.out.println("\nDisplay Person list after incrementing age by 1: ");
		for (Person p : arrP) {
			System.out.println(p);
		}
		/**  STEP 7
		 *   Use the removeIf method and a lambda expression to remove Person
		 *   objects whos age is less than 30
		 */
		
		System.out.println("\nDisplay Person list after remove age < 30: ");
		for (Person p : arrP) {
			System.out.println(p);
		}
		MyCollection<Person> tmpP = new MyArrayList<>();
		tmpP.add(new Person("Pilar", "Ess", 34));
		tmpP.add(new Person("Jill", "Z", 30));
		arrP.retainAll(tmpP);
		System.out.println("\nDisplay Person list after retainAll: ");
		for (Person p : arrP) {
			System.out.println(p);
		}
		
		
		

	}
}
