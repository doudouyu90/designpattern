package com.design.pattern.behavior.strategy;

import java.io.File;

public class Sort2 {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length() ;
        SortAlg sortAlg=null;
        if(fileSize<1*GB) {
            sortAlg = SortAlgFactory.getSortAlg("QuickSort");
        }else if(fileSize<10*GB){
            sortAlg = SortAlgFactory.getSortAlg("Externalsort");
        }else if(fileSize<100*GB){
            sortAlg = SortAlgFactory.getSortAlg("Concurrentexternalsort");
        }else {
            sortAlg = SortAlgFactory.getSortAlg("Mapreducesort");
        }
        sortAlg.sort(filePath);
    }
}
