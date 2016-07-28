/**
 * 
 */
package sdh.java.session8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Sudhish
 * 
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements you wish to enter in the ArrayList: ");
		int arrayListSize = Integer.parseInt(in.nextLine());
		HashSet<String> elements = new HashSet<String>();
		System.out.println("Enter all the elements: ");
		for (int i = 0; i < arrayListSize; i++) {
			elements.add(in.next());
		}
		System.out.println("Elements entered are :using next method of Iterator");
		Iterator iterator = elements.iterator();
		while(iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}
}
