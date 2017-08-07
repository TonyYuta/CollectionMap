/**
 *   File Name: AllDataStructures.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 6, 2017
 *   
 */

package core;

import java.util.HashMap;

/**
 * AllDataStructures //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class AllDataStructures {
		
	public static void main (String[] args) {
		
		// instance of a class AllDataStructures
		AllDataStructures allDataStructures = new AllDataStructures();
		
		// work with HashMap
		allDataStructures.hashMap01Map();
		
	} // end main	
	
	/*========================= HashMap ============================== */
	public void hashMap01Map() {
		// create an object of class HashMap
		HashMap hashMap01 = new HashMap();
	
		// populate HashMap
		String valueOfElement;
		for (int i = 0; i < 10; i++) {
			valueOfElement = "valueOfElement" + i;
			hashMap01.put(i, valueOfElement);
			}
		
		// print HashMap size
		System.out.println("hashMap size: " + hashMap01.size());
	    
		// print index & value of all elements in hashMap
		System.out.println("\n index & value of all elements in hashMap:");
		for (int i = 0; i < hashMap01.size(); i++) {
			System.out.println(i + " : " + hashMap01.get(i));
			}
	
		// remove element #5 from hashMap
		hashMap01.remove(5);
	
		// print index & value of all elements in hashMap after remove element #5
		System.out.println("\n index & value of all elements in hashMap after remove element #5:");
		for (int i = 0; i < hashMap01.size(); i++) {
			System.out.println(i + " : " + hashMap01.get(i));
			}
	
		// add element #3 into hashMap -- replace of old value with index #3
		hashMap01.put(3, "value 3");
	
		// print index & value of all elements in hashMap after add element #3
		System.out.println("\n index & value of all elements in hashMap after add element #3 (replace of old value with index #3)");
		for (int i = 0; i < hashMap01.size(); i++) {
			System.out.println(i + " : " + hashMap01.get(i));
			}
		
		// remove element with value valueOfElement1 from hashMap
		hashMap01.values().remove("valueOfElement1");
		
		// print index & value of all elements in hashMap after remove element with value valueOfElement1
		System.out.println("\n index & value of all elements in hashMap after remove element with value valueOfElement1:");
		
		for (int i = 0; i < hashMap01.size(); i++) {
			System.out.println(i + " : " + hashMap01.get(i));
		}

		
		
		} // end hashMap01Map()
	
	public void HashMap02Map() {
		
		// create an object of class HashMap

		// populate HashMap

		// print HashMap size

		// print index & value of all elements in hashMap

		// remove element with index Five from hashMap

		// print index & value of all elements in hashMap after remove element with index Five

		// add element #3 into hashMap -- replace of old value with index Three

		// print index & value of all elements in hashMap after add element Three

		// remove element with value 2.22 from hashMap

		
	}
	
	
	




} // class AllDataStructures 
