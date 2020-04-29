package com.design.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

public class SortAlgFactory {
    public final static Map<String,SortAlg> map = new HashMap<String, SortAlg>();

    static {
        map.put("Quicksort",new QuickSort());
        map.put("Externalsort",new ExternalSort());
        map.put("Concurrentexternalsort",new ConcurrentExternalSort());
        map.put("Mapreducesort",new MapReduceSort());
    }

    public  static  SortAlg getSortAlg(String type){
        if (type == null) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return  map.get(type);
    }
}
