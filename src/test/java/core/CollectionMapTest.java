package core;

//import org.testng.annotations.Test;
//import java.util.*;

/**
 * Created by Yutaka on 6/6/17.
 */
public class CollectionMapTest {

    MapHashMap mapHashMap = new MapHashMap();
    static HashMap hashMap = new HashMap();

    @Test
    public void populateHashMap() {
        String element = "element";
        for (int i = 0; i < 10; i++) {
            element = "element" + i;
            //mapHashMap.hashMapPutElement(hashMap, i, element);
            mapHashMap.hashMapPutElement(hashMap, i, element);
        }
        mapHashMap.hashMapPutElementsIndexString(hashMap);
        mapHashMap.printHashMap(hashMap);
        System.out.println("hashMap size: " + hashMap.size());
    }

    @Test
    public void printHashMap() {
        mapHashMap.printHashMap(hashMap);
        System.out.println("hashMap size: " + hashMap.size());

    }

    @Test(enabled = true, groups = {"add","all"}, priority=0)
    public void hashMapPutElementsIndexStringTest() {
        mapHashMap.hashMapPutElementsIndexString(hashMap);
    }
}
