package core;

//import org.testng.*;
import java.util.HashMap;

import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;


/**
 * Created by Yutaka on 6/6/17.
 */
public class CollectionMapTest {

    /**
     * create instance of the class MapHashMap
     */
    MapHashMap mapHashMap = new MapHashMap();
    AllDataStructures allDataStructures = new AllDataStructures();

    /**
     * create instance of HashMap
     */
    static HashMap hashMap = new HashMap();

    /**
     * populate HashMap
     */
    @Test(enabled = true, groups = {"HashMap", "Map", "All"})
    public void populateHashMapTest() {

        String element = "element";

        for (int i = 0; i < 10; i++) {
            element = "element" + i;
            mapHashMap.hashMapPutElementIndexIntValueString(hashMap, i, element);
        }

        mapHashMap.printHashMap(hashMap);
        System.out.println("hashMap size: " + hashMap.size());
        Assert.assertEquals(1,1);
    }

    @Test(enabled = true, groups = {"HashMap", "Map", "All"})
    public void printHashMap() {

        mapHashMap.printHashMap(hashMap);
        System.out.println("hashMap size: " + hashMap.size());
    }

    @Test(enabled = true, groups = {"qqq", "HashMap", "Map", "All"})
    public void qqqPrintWord() {
        System.out.println("============= word ============ ");
    }

    @Test(enabled = true, groups = {"All" }, priority = 0)
    public void testMainMethod() {
    	String expected = null;
    	AllDataStructures.main(null);
    }
    
    @Test(enabled = true, groups = {"Vector", "List", "All"}, priority = 1)
    public void testVector01List() {
    	int expected = 4;
    	Assert.assertEquals(allDataStructures.vector01List().size(), expected, "Size HashMap doesn't match to expected");
    }  
    
    @Test(enabled = true, groups = {"ArrayList", "List", "All"}, priority = 1)
    public void testArrayList01List() {
    	int expected = 9;
    	Assert.assertEquals(allDataStructures.arrayList01List().size(), expected, "Size HashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"LinkedList", "List", "All"}, priority = 1)
    public void testLinkedList01List() {
    	int expected = 5;
    	Assert.assertEquals(allDataStructures.linkedList01List().size(), expected, "Size HashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"HashSet", "Set", "All"}, priority = 2)
    public void testHashSet01Set() {
    	int expected = 3;
    	Assert.assertEquals(allDataStructures.hashSet01Set().size(), expected, "Size HashHashSet doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"LinkedHashSet", "Set", "All"},  dependsOnGroups = {"HashSet"}, priority = 2)
    public void testLinkedHashSet01Set() {
    	int expected = 3;
    	Assert.assertEquals(allDataStructures.linkedHashSet01Set().size(), expected, "Size LinkedHashSet doesn't match to expected");
    }

    @Test(enabled = true, groups = {"TreeSet", "Set", "All"},  dependsOnGroups = {"HashSet"}, priority = 2)
    public void testTreeSet01Set() {
    	int expected = 15;
    	Assert.assertEquals(allDataStructures.treeSet01Set().size(), expected, "Size TreeSet doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"Stack", "Queue", "All"}, priority = 3)
    public void testStack01Queue() {
    	int expected = 10;
    	Assert.assertEquals(allDataStructures.stack01Queue().size(), expected, "Size Stack doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"PriorityQueue", "Queue", "All"}, dependsOnGroups = {"Stack"}, priority = 3)
    public void testPriorityQueue01Queue() {
    	int expected = 10;
    	Assert.assertEquals(allDataStructures.priorityQueue01Queue().size(), expected, "Size PriorityQueue doesn't match to expected");
    }
    
    @Test(enabled = true, groups ={"ArrayDeque", "Queue", "All"}, dependsOnGroups = {"Stack"}, priority = 3)
    public void testArrayDeque01Queue() {
    	int expected = 10;
    	Assert.assertEquals(allDataStructures.arrayDeque01Queue().size(), expected, "Size ArrayDeque doesn't match to expected");
    }
    
    
    
    @Test(enabled = true, groups = {"HashMap", "Map", "All" }, priority = 4)
    public void testHashMap01Map() {
    	int expected = 8;
    	Assert.assertEquals(allDataStructures.hashMap01Map().size(), expected, "Size HashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"HashMap", "Map", "All" }, dependsOnMethods = {"testHashMap01Map"}, priority = 4)
    public void testHashMap02Map() {
    	int expected = 8;
    	Assert.assertEquals(allDataStructures.hashMap02Map().size(), expected, "Size HashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"HashTable", "Map", "All" }, dependsOnMethods = {"testHashMap01Map"}, priority = 4)
    public void testHashtable01Map() {
    	int expected = 3;
    	Assert.assertEquals(allDataStructures.hashtable01Map().size(), expected, "Size HashTable doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"LinkedHashMap", "Map", "All" }, dependsOnMethods = {"testHashMap01Map"}, priority = 4)
    public void testLinkedHashMap01Map() {
    	int expected = 2;
    	Assert.assertEquals(allDataStructures.linkedHashMap01Map().size(), expected, "Size LinkedHashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"TreeMap", "Map", "All" }, dependsOnMethods = {"testHashMap01Map"}, priority = 4)
    public void testTreeMap01Map() {
    	int expected = 4;
    	Assert.assertEquals(allDataStructures.treeMap01Map().size(), expected, "Size TreeMap doesn't match to expected");
    }
    

}
