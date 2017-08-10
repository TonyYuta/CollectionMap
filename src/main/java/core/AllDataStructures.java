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
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

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
		allDataStructures.hashMap02Map();
		
		// work with ArrayList
		allDataStructures.arrayList01List();
		
		// work with Vector
		allDataStructures.vector01List();
		
		// work with LinkedList
		allDataStructures.linkedList01List();
		

		
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
	
						
			// print out ArrayList
			System.out.println("arrayList01 : " + arrayList01 + "\n");
						
			//  clear(): It is used for removing all the elements of the array list in one go. 
			arrayList01.clear();
			
			// print out current size
			System.out.println("arrayList01.size() : " + arrayList01.size());
			
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
		
		//=============================================================================================

		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			Vector vector01 = new Vector();
			
			// print out init size	
			System.out.println("vector01.size() : " + vector01.size());
			
			// populate Vector	
			vector01.addElement("cucumber");
			vector01.addElement("onion");
			vector01.addElement("carrot");
			vector01.addElement("squash");
			
			// print out current size	
			System.out.println("vector01.size() : " + vector01.size());

			// print out Vector		
			printVector(vector01);
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			vector01.clear();
			
			// print out current size
			System.out.println("vector01.size() : " + vector01.size());
			
			// populate Vector	
			vector01.addElement("table");
			vector01.addElement("chair");
			vector01.addElement("bookshelf");
			vector01.addElement("cupboard");
			
			// add between existing elements	
			// ??
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			vector01.set(1, "armchair");
			
			// print out current size	
			System.out.println("vector01.size() : " + vector01.size());
			
			// print out Vector	
			printVector(vector01);

			// Object get(int index)
			System.out.println("vector01.get(3) : " + vector01.get(3));
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			System.out.println("vector01.contains(\"table\") : " + vector01.contains("table"));
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================

		
		//=============================== List ========= LinkedList ==========================================
		public LinkedList linkedList01List() {
			
			// create an object
			//LinkedList linkedList01 = new LinkedList();
			LinkedList<String> linkedList01 = new LinkedList<>();
			
			// print out init size	
			System.out.println("linkedList01.size() : " + linkedList01.size());
			
			// populate LinkedList	
			linkedList01.add("Azimov");
			linkedList01.add("Bradbery");
			linkedList01.add("Hainlain");
			
			linkedList01.add(2, "Clark");
			
			linkedList01.addFirst("Strugackie");
			linkedList01.addLast("Gudkain");
			
			// print out current size	
			System.out.println("linkedList01.size() : " + linkedList01.size());

			// print out LinkedList	
			printLinkedList(linkedList01);
			
			// clear(): It is used for removing all the elements of the LinkedList in one go. 
			linkedList01.clear();
			
			// print out current size
			System.out.println("linkedList01.size() : " + linkedList01.size());

			// populate LinkedList	
			linkedList01.add("pen");
			linkedList01.add("pencil");
			linkedList01.add("eraser");

			// add between existing elements	
			linkedList01.add(1, "ink");
			
			// first & last
			linkedList01.addFirst("notebook");
			linkedList01.addLast("gradebook");
			
			// Object set(int index, Object element) Replaces the element at the specified position in this LinkedList with the specified element.
			linkedList01.set(1, "brush");
			
			// print out current size	
			System.out.println("linkedList01.size() : " + linkedList01.size());
			
			// print out LinkedList	
			printLinkedList(linkedList01);

			// Object get(int index)
			System.out.println("First element: " + linkedList01.getFirst());
			System.out.println("5-th element: " + linkedList01.get(4));
			System.out.println("Last element: " + linkedList01.getLast());
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			System.out.println("Is element 'eraser' present: " + linkedList01.contains("eraser"));
			
			// clone
			LinkedList linkedList02 = new LinkedList();
			System.out.println("linkedList01 = (LinkedList)linkedList01.clone() : ");
			printLinkedList(linkedList02 = (LinkedList)linkedList01.clone());
			
			return linkedList01;
		}
		
		// print out LinkedList 
		public void printLinkedList(LinkedList ll) {
	        System.out.println("\nLinked list: \n" + ll.toString().replaceAll("[,\\[\\]]", "").replaceAll(" ", "\n"));
		}
		
		//====================================================================================================
		/*
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		public Vector vector01List() {
			
			// create an object
			
			// print out init size	
			
			// populate Vector	
			
			// print out current size	

			// print out Vector		
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			
			// print out current size
			
			// populate Vector	
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			
			// print out Vector	

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			Vector vector02 = new Vector();
			System.out.println("vector02 = (Vector)vector01.clone() : ");
			printVector(vector02 = (Vector)vector01.clone());
			
			return vector01;
		}
		
		// print out Vector in format index & value
		public void printVector(Vector v) {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(i + " : " + v.get(i));
			}
		}
		
		//====================================================================================================
		
		
	
		
	*/
		


} // class AllDataStructures 
