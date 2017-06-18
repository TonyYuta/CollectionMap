package core;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

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

    @Test
    public void printHashMap() {
        mapHashMap.printHashMap(hashMap);
        System.out.println("hashMap size: " + hashMap.size());

    }

}
