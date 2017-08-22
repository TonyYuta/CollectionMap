/**
 *   File Name: AllDataStructures.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 6, 2017
 *   
 */

package core;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.apache.commons.lang3.ArrayUtils;

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
		
		// work with Array
		allDataStructures.array01Array();
		
		// work with ArrayList
	//	allDataStructures.arrayList01List();
		
		// work with Vector
		//allDataStructures.vector01List();
		
		// work with LinkedList
		//allDataStructures.linkedList01List();
		
		// work with HashSet
		//allDataStructures.hashSet01Set();
		
		// work with LinkedHashSet
		//allDataStructures.linkedHashSet01Set();
		
		// work with TreeSet
		//allDataStructures.treeSet01Set();
		
		// work with Stack
		//allDataStructures.stack01Queue();
		
		// work with PriorityQueue
		//allDataStructures.priorityQueue01Queue();
		
		// work with ArrayDeque
		//allDataStructures.arrayDeque01Queue();
				
		// work with HashMap
		//allDataStructures.hashMap01Map();
		//allDataStructures.hashMap02Map();
		
		// work with Hashtable
		//allDataStructures.hashtable01Map();

		// work with LinkedHashMap
		//allDataStructures.linkedHashMap01Map();

		// work with TreeMap
		//allDataStructures.treeMap01Map();
		
	} // end main	
	
	/*=============================================================================================*/
	/*=============================================================================================*/

	
	/*=============================== Array ===================================================*/
	public int[] array01Array() {
		
		// create an object
		int[] arr01 = new int[10];
		
		// print out init size
		System.out.println("arr01.length : " + arr01.length);

		// populate Array
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = 10 + i;
		}
		
		// print out current length
		System.out.println("arr01.length : " + arr01.length);
					
		// print out Array
		printArray(arr01);
					
		// remove element
		arr01 = ArrayUtils.removeElement(arr01, 11);
		
		// print out current length
		System.out.println("arr01.length : " + arr01.length);

		// print out Array
		printArray(arr01);
		
		// populate Array
		arr01[0] = 21;
		arr01[1] = 24;
		arr01[2] = 2;
		arr01[3] = -6;
		arr01[4] = 34;
		arr01[5] = 5;
		arr01[6] = -88;
		arr01[7] = 7;
		arr01[8] = 45;

		// print out current length
		System.out.println("arr01.length : " + arr01.length);
					
		// print out Array
		printArray(arr01);
		
		// find min
		int min = arr01[0];
		for (int i : arr01) {
			if (i < min) 
				min = i;
		}
		System.out.println("min = " + min);
		
		// find max
		int max = arr01[0];
		for (int i : arr01) {
			if(i > max)
				max = i;
		}
		System.out.println("max = " + max);
		
		// build-in sort
		java.util.Arrays.sort(arr01);		
		
		// Searching Arrays with Arrays.binarySearch()
		// The array must first be sorted.
		int searchNum = 5;
		int index = Arrays.binarySearch(arr01, searchNum);
		System.out.println(index >= 0 ? searchNum + " is present" : searchNum + " is not present");
						
		// copy array
		int[] arr02 = new int[9];
		for(int i = 0; i < arr01.length; i++) {
			arr02[i] = arr01[i];
		}
		
		// print out current length
		System.out.println("arr02 : ");
		printArray(arr02);
		
		return arr02;
	}

	// print out Array in format index & value
	public void printArray(int[] arr) {	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
			}
	}
	
	//=============================================================================================
	
	
	
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
			Vector<String> vector01 = new Vector<>();
			
			
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
			
			// delete element
			linkedList01.remove("pencil");
			
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
		
		
		//=============================== HashSet ===================================================
		public HashSet hashSet01Set() {
			
			// create an object
			HashSet<String> hashSet01 = new HashSet<>();
			
			// print out init size	
			hashSet01.size();
			
			// populate HashSet	
			hashSet01.add("binoculars");
			hashSet01.add("microscope");
			hashSet01.add("microscope");
			hashSet01.add("microscope");
			hashSet01.add("magnifier glass");
			
			// print out current size	
			System.out.println("hashSet01.size() : " + hashSet01.size());

			// print out HashSet
			printHashSet(hashSet01);
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			hashSet01.clear();
			
			// print out current size
			System.out.println("hashSet01.clear(); hashSet01.size() : " + hashSet01.size());
			
			// populate HashSet	
			hashSet01.add("binoculars");
			hashSet01.add("magnifying glass");
			hashSet01.add("microscope");
			hashSet01.add("microscope");
			hashSet01.add("microscope");
			hashSet01.add("teodolit");
			
			// add between existing elements
			
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			System.out.println("hashSet01.clear(); hashSet01.size() : " + hashSet01.size());

			// print out HashSet	
			
			// Delete element
			hashSet01.remove("magnifying glass");
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			System.out.println("hhashSet01.contains(\"microscope\") : " + hashSet01.contains("microscope"));

			// clone
			HashSet<String> hashSet02 = new HashSet<>();
			hashSet02 = (HashSet)hashSet01.clone();

			// print out HashSet
			printHashSet(hashSet02);
			
			return hashSet01;
		}
		
		// print out HashSet using iterator
		public void printHashSet(HashSet hs) {
			Iterator<String> it = hs.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
 		}	
		//====================================================================================================
		
		
		//=============================== LinkedHashSet ===================================================
		public LinkedHashSet linkedHashSet01Set() {
			
			// create an object
			LinkedHashSet<String> linkedHashSet01 = new LinkedHashSet<>();
			
			// print out init size	
			System.out.println("linkedHashSet01.size() : " + linkedHashSet01.size());
			
			// populate LinkedHashSet	
			for (int i = 0; i < 10; i++) {
				linkedHashSet01.add("elemValue" + i);
			}
			
			linkedHashSet01.add("floor");
			linkedHashSet01.add("wall");
			linkedHashSet01.add("wall");
			linkedHashSet01.add("wall");
			linkedHashSet01.add("wall");
			linkedHashSet01.add("cealing");
			linkedHashSet01.add("door");
			
			// print out current size	
			System.out.println("linkedHashSet01.size() : " + linkedHashSet01.size());

			// print out LinkedHashSet		
			printLinkedHashSet(linkedHashSet01);
			
			// clear(): It is used for removing all the elements of the LinkedHashSet in one go. 
			linkedHashSet01.clear();
			
			// print out current size
			System.out.println("linkedHashSet01.size() : " + linkedHashSet01.size());

			// populate LinkedHashSet	
			linkedHashSet01.add("star");
			linkedHashSet01.add("meteoroid");
			linkedHashSet01.add("meteor");
			linkedHashSet01.add("planet");
			linkedHashSet01.add("planet");
			linkedHashSet01.add("planet");
			linkedHashSet01.add("planet");
			
			// remove
			linkedHashSet01.remove("planet");
			
			// add between existing elements	
						
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			System.out.println("linkedHashSet01.size() : " + linkedHashSet01.size());

			// print out LinkedHashSet	
			printLinkedHashSet(linkedHashSet01);
						
			// boolean contains(Object o): It checks whether the given object o is present in the LinkedHashSet if its there then it returns true else it returns false.		
			System.out.println("linkedHashSet01.contains(\"meteor\") : " + linkedHashSet01.contains("meteor"));
			System.out.println("linkedHashSet01.contains(\"planet\") : " + linkedHashSet01.contains("planet"));

			// clone
			//LinkedHashSet<String> linkedHashSet02 = new LinkedHashSet<>();
			LinkedHashSet linkedHashSet02 = new LinkedHashSet<String>();
			System.out.println("linkedHashSet02 = (LinkedHashSet)linkedHashSet01.clone() : ");
			printLinkedHashSet(linkedHashSet02 = (LinkedHashSet)linkedHashSet01.clone());
			
			return linkedHashSet02;
		}
		
		// print out LinkedHashSet in format index & value
		public void printLinkedHashSet(LinkedHashSet lhs) {
			Iterator<String> it = lhs.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}		
		}
		//====================================================================================================
		
		
		
		//=============================== TreeSet ===================================================
		public TreeSet treeSet01Set() {
			
			// create an object
			TreeSet<Character> treeSet01 = new TreeSet<>();
			
			// print out init size	
			System.out.println("treeSet.size() : " + treeSet01.size());
			
			// populate TreeSet
			treeSet01.add('s');
			treeSet01.add('f');
			treeSet01.add('w');
			treeSet01.add('d');
			treeSet01.add('f');
			treeSet01.add('w');
			
			// print out current size
			System.out.println("treeSet.size() : " + treeSet01.size());

			// print out TreeSet	
			printTreeSet(treeSet01);
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			treeSet01.clear();
			
			// print out current size
			System.out.println("treeSet.size() : " + treeSet01.size());
			
			// populate TreeSet	
			String str = " freG IIY aewahtrh H JHRs";
			char[] chars = str.toCharArray();
			
			for (char c : chars) {
				treeSet01.add(c);
			}
			
			// add between existing elements	
			
			// Object set(int index, Object element)  Replaces the element at the specified position in this vector with the specified element.
			
			// print out current size	
			System.out.println("treeSet01.size() : " + treeSet01.size());
			
			// print out TreeSet
			printTreeSet(treeSet01);

			// Object get(int index)
			
			// boolean contains(Object o): It checks whether the given object o is present in the vector if its there then it returns true else it returns false.		
			
			// clone
			TreeSet<String> treeSet02 = new TreeSet<>();
			System.out.println("treeSet02 = (TreeSet)treeSet01.clone() : ");
			printTreeSet(treeSet02 = (TreeSet)treeSet01.clone());
			
			return treeSet02;
		}
		
		// print out TreeSet in format 
		public void printTreeSet(TreeSet ts) {
			Iterator<Character> it = ts.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//====================================================================================================
		
		//=============================== Vector ===================================================
		 	/* 
		 	Stack class is the child class of Vector.
 			- It follows LIFO (Last in first out) mechanism.
 			- It is the stack implementation in java
 			*/
		public Stack stack01Queue() {
			
			// create an object
			Stack<Double> stack01 = new Stack<>();
			
			// print out init size	
			System.out.println("stack01.size() : " + stack01.size());
			
			// populate Stack	
			stack01.add(1.11D);
			stack01.add(7.77D);
			stack01.add(-2.22D);
			stack01.add(-9.99);
			stack01.add(null);
			stack01.add(4.44);
			
			// print out current size	
			System.out.println("stack01.size() : " + stack01.size());
			
			// print out Stack		
			printStack(stack01);
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			stack01.clear();
			
			// print out current size
			System.out.println("stack01.size() : " + stack01.size());
			
			// populate Stack	
			for (int i = 0; i < 10; i++) {
				stack01.add(1.11 * i);
			}
			
			// Object push(Object item)
		    // Pushes the element into Stack and returns the same element
			stack01.push(1.01D);
			
			// print out Stack	
			printStack(stack01);
			
			// Object pop()
		    // Removes the element from Stack and returns the element			
			stack01.pop();
			
			// print out current size	
			System.out.println("stack01.size() : " + stack01.size());

			// print out Stack	
			printStack(stack01);

			// Object get(int index)
			System.out.println("stack01.get(2) : " + stack01.get(2));
			
			// Object peek()
			// Returns the top element from Stack.
			System.out.println("stack01.peek() : " + stack01.peek());
			
			// Object empty()
		    // Returns true when the Stack is empty.
			System.out.println("stack01.empty() : " + stack01.empty());
						
			// clone
			Stack<Double> stack02 = new Stack<>();
			System.out.println("stack02 = (Stack)stack01.clone() : ");
			printStack(stack02 = (Stack)stack01.clone());
			
			return stack02;
		}
		
		// print out Stack in format index & value
		public void printStack(Stack st) {
			for (int i = 0; i < st.size(); i++) {
				Double n = (Double) st.get(i);
				System.out.printf(i + " : " + "\t" + "%.3f%n", n);
			}
		}
		
		//====================================================================================================
		
		//=============================== PriorityQueue ===================================================
	 	// To process the objects in the queue based on the priority, we tend to use PriorityQueue.

		public PriorityQueue priorityQueue01Queue() {
			
			// create an object
			PriorityQueue<String> priorityQueue01 = new PriorityQueue<>();
			
			// print out init size	
			System.out.println("priorityQueue01.size() : " + priorityQueue01.size());
			
			// populate Stack	
			priorityQueue01.add("romance");
			priorityQueue01.add("drama");
			priorityQueue01.add("history");
			priorityQueue01.add("anime");
		
			// print out current size	
			System.out.println("priorityQueue01.size() : " + priorityQueue01.size());
			
			// print out PriorityQueue		
			printPriorityQueue(priorityQueue01);
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			priorityQueue01.clear();
			
			// print out current size
			System.out.println("priorityQueue01.size() : " + priorityQueue01.size());
			
			// populate priorityQueue01	
			for (int i = 0; i < 10; i++) {
				priorityQueue01.add("genre" + i);
			}
			
			// print out Stack	
			printPriorityQueue(priorityQueue01);
			
			// print out current size	
			System.out.println("stack01.size() : " + priorityQueue01.size());
	
			// print out PriorityQueue	
			printPriorityQueue(priorityQueue01);
			
			// Object peek()
			// Returns the top element from PriorityQueue.
			System.out.println("priorityQueue01.peek() : " + priorityQueue01.peek());
			
			return priorityQueue01;
		}
		
		// print out PriorityQueue 
		public void printPriorityQueue(PriorityQueue pq) {
			Iterator it = pq.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			}
		}
	
		//====================================================================================================
		
		
		//=============================== ArrayDeque ===================================================
		public ArrayDeque arrayDeque01Queue() {
			
			// create an object
			ArrayDeque<Integer> arrayDeque01 = new ArrayDeque<>();
			
			// print out init size	
			System.out.println("arrayDeque01.size() : " + arrayDeque01.size());
			
			// populate ArrayDeque	
			arrayDeque01.add(234);
			arrayDeque01.add(34);
			arrayDeque01.add(567);
			arrayDeque01.add(21);
			
			// print out current size	
			System.out.println("arrayDeque01.size() : " + arrayDeque01.size());

			// print out ArrayDeque		
			printArrayDeque(arrayDeque01);
			
			// getFirst
			System.out.println("arrayDeque01.getFirst() : " + arrayDeque01.getFirst());
			
			// getLast
			System.out.println("arrayDeque01.getLast() : " + arrayDeque01.getLast());			
			
			// clear(): It is used for removing all the elements of the Vector in one go. 
			arrayDeque01.clear();
			
			// print out current size
			System.out.println("arrayDeque01.size() : " + arrayDeque01.size());
			
			// populate ArrayDeque	
			for (int i = 0; i < 10; i++) {
				arrayDeque01.add(i * 2);
			}
			
			// boolean contains(Object o): It checks whether the given object o is present in the ArrayDeque if its there then it returns true else it returns false.		
			System.out.println("arrayDeque01.contains(10) : " + arrayDeque01.contains(10));
			
			// clone
			ArrayDeque<Integer> arrayDeque02 = new ArrayDeque<>();
			System.out.println("arrayDeque02 = (ArrayDeque)arrayDeque01.clone() : ");
			printArrayDeque(arrayDeque02 = arrayDeque01.clone());
			
			return arrayDeque02;
		}
		
		// print out ArrayDeque 
		public void printArrayDeque(ArrayDeque ad) {
			Iterator it = ad.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//====================================================================================================
		
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

		//=============================== Hashtable ===================================================
		public Hashtable hashtable01Map() {
			
			// create an object
			Hashtable<String, String> hashtable01 = new Hashtable<>();
			
			// print out init size	
			System.out.println("hashtable01.size() : " + hashtable01.size());
			
			// populate Hashtable	
			hashtable01.put("loginBtn", "id=login");
			hashtable01.put("fNameField", "fname");
			hashtable01.put("lNameField", "lname");
						
			// print out current size	
			System.out.println("hashtable01.size() : " + hashtable01.size());

			// get value
			System.out.println("hashtable01.get(\"fNameField\") : " + hashtable01.get("fNameField"));
					
			// clone
			Hashtable<String, String> hashtable02 = new Hashtable<>();
			System.out.println("hashtable02 = (Hashtable)hashtable01.clone() : ");
			printHashtable(hashtable02 = (Hashtable)hashtable01.clone());
			
			return hashtable02;
		}
		
		// print out Hashtable in format index & value
		public void printHashtable(Hashtable ht) {
			Set<String> keys = ht.keySet();
			for(String key : keys) {
				System.out.println(key + " : " + ht.get(key));
			}
		}
		
		//====================================================================================================
		
		//=============================== LinkedHashMap ===================================================
		public LinkedHashMap linkedHashMap01Map() {
			
			// create an object
			LinkedHashMap<String, String> linkedHashMap01 = new LinkedHashMap<>();
			
			// print out init size	
			System.out.println("hashtable01.size() : " + linkedHashMap01.size());
			
			// populate LinkedHashMap	
			linkedHashMap01.put("loginBtn", "id=login");
			linkedHashMap01.put("fNameField", "fname");
			linkedHashMap01.put("lNameField", "lname");
						
			// print out current size	
			System.out.println("linkedHashMap01.size() : " + linkedHashMap01.size());

			// get value
			System.out.println("linkedHashMap01.get(\"fNameField\") : " + linkedHashMap01.get("fNameField"));
					
			// remove
			System.out.println("linkedHashMap01.remove(\"lNameField\") : " + linkedHashMap01.remove("lNameField"));
						
			
			// clone
			LinkedHashMap<String, String> linkedHashMap02 = new LinkedHashMap<>();
			System.out.println("hashtable02 = (Hashtable)hashtable01.clone() : ");
			printHashtable(linkedHashMap02 = (LinkedHashMap)linkedHashMap01.clone());
			
			return linkedHashMap02;
		}
		
		// print out LinkedHashMap in format key & value
		public void printHashtable(LinkedHashMap lhm) {
			Set<String> keys = lhm.keySet();
			for(String key : keys) {
				System.out.println(key + " : " + lhm.get(key));
			}
		}
		
		//====================================================================================================
		
		//=============================== TreeMap ===================================================
		public TreeMap treeMap01Map() {
			
			// create an object
			TreeMap<String, String> treeMap01 = new TreeMap<>();
			
			// print out init size	
			System.out.println("treeMap01.size() : " + treeMap01.size());
			
			// populate TreeMap	
			treeMap01.put("loginBtn", "id=login");
			treeMap01.put("fNameField", "fname");
			treeMap01.put("lNameField", "lname");
			treeMap01.put("homeTab", "navHome");
			treeMap01.put("recoveryPwLink", "recovPas");

						
			// print out current size	
			System.out.println("treeMap01.size() : " + treeMap01.size());

			// get value
			System.out.println("treeMap01.get(\"fNameField\") : " + treeMap01.get("fNameField"));
					
			// remove
			System.out.println("treeMap01.remove(\"lNameField\") : " + treeMap01.remove("lNameField"));
						
			
			// clone
			TreeMap<String, String> treeMap02 = new TreeMap<>();
			System.out.println("treeMap02 = (Hashtable)treeMap01.clone() : ");
			printTreeMap(treeMap02 = (TreeMap)treeMap01.clone());
			
			return treeMap02;
		}
		
		// print out TreeMap in format key & value
		public void printTreeMap(TreeMap lhm) {
			Set<String> keys = lhm.keySet();
			for(String key : keys) {
				System.out.println(key + " : " + lhm.get(key));
			}
		}
		
		//====================================================================================================
		

} // class AllDataStructures 
