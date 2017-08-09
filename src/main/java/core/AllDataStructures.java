/**
 *   File Name: AllDataStructures.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 6, 2017
 *   
 */

package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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
		//allDataStructures.hashMap01Map();
		//allDataStructures.hashMap02Map();
		
		// work with ArrayList
		allDataStructures.arrayList01List();
		

		
	} // end main	
	
	/*=============================================================================================*/
	/*=============================================================================================*/

	
	/*========================= HashMap ============================== */
	public HashMap hashMap01Map() {
		// create an object of class HashMap
		HashMap hashMap01 = new HashMap();
	
		// populate HashMap
		String valueOfElement;
		for (int i = 0; i < 10; i++) {
			valueOfElement = "valueOfElement" + i;
			hashMap01.put("key" + i, valueOfElement);
			}
		
		// print HashMap size
		System.out.println("hashMap size: " + hashMap01.size());
	    
		// print index & value of all elements in hashMap
		System.out.println("index & value of all elements in hashMap:");
		printHashMap(hashMap01);
	    
		// remove element #5 from hashMap
		hashMap01.remove("key5");
	
		// print index & value of all elements in hashMap after remove element #5
		System.out.println("index & value of all elements in hashMap after remove element #5:");
		printHashMap(hashMap01);

		// add element #3 into hashMap -- replace of old value with index key3
		hashMap01.put("key3", "value 3");
	
		// print index & value of all elements in hashMap after add element #3
		System.out.println("index & value of all elements in hashMap after add element #3 (replace of old value with index #3)");
		printHashMap(hashMap01);

		// remove element with value valueOfElement1 from hashMap
		hashMap01.values().remove("valueOfElement1");
		
		// print index & value of all elements in hashMap after remove element with value valueOfElement1
		System.out.println("index & value of all elements in hashMap after remove element with value valueOfElement1:");
		printHashMap(hashMap01);

		return hashMap01;
		
		} // end hashMap01Map()
	
	/*=============================================================================================*/

	public void printHashMap(HashMap hm) {
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + hm.get(key));
		}
		System.out.print("\n");
	}
	
	/*===================================================================================*/
	public HashMap hashMap02Map() {
		
		// create an object of class HashMap
		HashMap<String, Integer> hashMap02 = new HashMap<>();

		// populate HashMap
		for (int i = 0; i < 10; i++) {
			hashMap02.put("key" + i, 10 + i);
		}

		// print HashMap size
		System.out.println("hashMap02.size() = " + hashMap02.size() + "\n");
		
		// print index & value of all elements in hashMap
		System.out.println("print index & value of all elements in hashMap");
		printHashMap(hashMap02);
		
		// remove element with index key5 from hashMap
		hashMap02.remove("key5");
		
		// print index & value of all elements in hashMap after remove element with index key5
		System.out.println("index & value of all elements in hashMap after remove element with index key5");
		printHashMap(hashMap02);
		
		// change value of element 333 into hashMap -- replace of old value with index key3
		hashMap02.put("key3", 333);

		// print index & value of all elements in hashMap after replace element with index key3
		System.out.println("index & value of all elements in hashMap after replace element with index key3");
		printHashMap(hashMap02);

		// remove element with value 6 from hashMap
		hashMap02.remove("key6");

		// print index & value of all elements in hashMap after remove element with value 6
		System.out.println("index & value of all elements in hashMap after remove element with value 6");
		printHashMap(hashMap02);
		
		return hashMap02;
		
	} // end hashMap02Map()
	
	/*=============================================================================================*/
	/*=============================================================================================*/
	
	/*=============================== ArrayList ===================================================*/
		public ArrayList arrayList01List() {
			
			// create an object
			ArrayList arrayList01 = new ArrayList();
			
			// print out init size
			System.out.println("arrayList01.size() : " + arrayList01.size());
			
			// populate ArrayList
			for(int i = 0; i < 10; i++) {
				arrayList01.add("fruit" + i);
			}
			
			// print out current size
			System.out.println("arrayList01.size() : " + arrayList01.size());
			
			//  clear(): It is used for removing all the elements of the array list in one go. 

			
			// populate ArrayList
			arrayList01.add("apple");
			arrayList01.add("banana");
			arrayList01.add("pear");
			arrayList01.add("strawberry");
			arrayList01.add("blueberry");
			arrayList01.add("plum");
			arrayList01.add("peach");
			arrayList01.add("grape");
			
			// add(int index, Object o) - add between existing elements
			arrayList01.add(5, "raspberry");
			
			// print out current size
			System.out.println("arrayList01.size() : " + arrayList01.size());
			
			// print out ArrayList
			System.out.println("arrayList01 : " + arrayList01 + "\n");
			
			// print out ArrayList
			printArrayList(arrayList01);
			
			// Object get(int index)
			System.out.println("arrayList01.get(2) : " + arrayList01.get(2));
			
			// 9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.
			System.out.println("arrayList01.contains(\"raspberry\") " + arrayList01.contains("raspberry"));
			
			// print out current size
			System.out.println("arrayList01.size() : " + arrayList01.size());
			

			
			return arrayList01;
		}

		// print out ArrayList in format index & value
		public void printArrayList(ArrayList al) {
	
			for (int i = 0; i < al.size(); i++) {
				System.out.println(i + " : " + al.get(i));
				}
		}

} // class AllDataStructures 
