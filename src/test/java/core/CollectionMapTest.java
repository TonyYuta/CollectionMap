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

    @Test(enabled = true, groups = {"HashMap", "Map", "All" }, priority = 0)
    public void testHashMap01Map() {
    	int expected = 8;
    	Assert.assertEquals(allDataStructures.hashMap01Map().size(), expected, "Size HashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"HashMap", "Map", "All" }, priority = 0)
    public void testHashMap02Map() {
    	int expected = 8;
    	Assert.assertEquals(allDataStructures.hashMap02Map().size(), expected, "Size HashMap doesn't match to expected");
    }
    
    @Test(enabled = true, groups = {"All" }, priority = 1)
    public void testMainMethod() {
    	String expected = null;
    	AllDataStructures.main(null);
    }
    
    
}
