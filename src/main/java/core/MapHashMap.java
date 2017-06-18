package core;

import java.util.HashMap;

/**
 * Created by Yutaka on 6/6/17.
 */
public class MapHashMap {

    /**
     * adding === put === element to map HashMap
     * index: int
     * value: String
     * @param hm
     * @param ind
     * @param val
     */
    public void hashMapPutElementIndexIntValueString(HashMap hm, int ind, String val) {
        hm.put(ind, val);
    }

    /**
     * @param hm
     * @return size
     */
    public int hashMapSize(HashMap hm) {
        return hm.size();
    }

    /**
     * print HashMap
     * @param hm
     *
     */
    public void printHashMap(HashMap hm) {
        System.out.println(hm + " : " + hm);
    }

}
