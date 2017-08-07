package core;

import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.*;
import java.util.*;
//import org.testng.*;


/**
 * Created by Yutaka on 6/6/17.
 */
public class CollectionMapTest {

    /**
     * create instance of the class MapHashMap
     */
    MapHashMap mapHashMap = new MapHashMap();

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

    /**
     * qqq temporary
     */
    @Test
    public void qqqEmptyTest() {
        int i = 10;
    }

}
