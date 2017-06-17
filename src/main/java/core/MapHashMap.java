package core;

import java.util.*;

/**
 * Created by Yutaka on 6/6/17.
 */
public class MapHashMap {

    // adding === put === element to map HashMap
    // index: int
    // value: String
    public void hashMapPutElement(HashMap hm, int ind, String val) {
        hm.put(ind, val);
    }

    // print HashMap
    public void printHashMap(HashMap hm) {
        System.out.println(hm + " : " + hm);
    }

    public void hashMapPutElementsIndexString(HashMap hm) {
        hm.put("eleven", "element11");
    }

}
