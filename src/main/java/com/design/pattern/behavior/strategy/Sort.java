package com.design.pattern.behavior.strategy;

import java.io.File;

public class Sort {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length() ;
        if(fileSize<1*GB) {
            quickSort(filePath);
        }else if(fileSize<10*GB){
            externalSort(filePath);
        }else if(fileSize<100*GB){
            concurrentExternalSort(filePath);
        }else {
            mapReduceSort(filePath);
        }
    }

    private void quickSort(String filePath){
        //快排
    }

    private void externalSort(String filePath){
        //外部排序
    }

    private void concurrentExternalSort(String filePath) {
        // 多线程外部排序
        }
    private void mapReduceSort(String filePath) {
        // mapReduce排序
    }

}

