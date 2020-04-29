package com.design.pattern.behavior.strategy;

import java.io.File;

public class Sort1 {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length() ;
        SortAlg sortAlg=null;
        if(fileSize<1*GB) {
            sortAlg = new QuickSort();
        }else if(fileSize<10*GB){
            sortAlg = new ExternalSort();
        }else if(fileSize<100*GB){
            sortAlg = new ConcurrentExternalSort();
        }else {
            sortAlg = new MapReduceSort();
        }
        sortAlg.sort(filePath);
    }
}
