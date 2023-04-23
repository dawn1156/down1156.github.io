package org.example.algorothm;

import java.util.Arrays;

public class SelectSort {
    /**
     * 选择排序
     *
     * @param args
     */

    public static void main(String[] args) {
        int arr[] ={11,3,38,4,5,6,0,2};
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length; j++) {
             minPos=arr[j]<arr[minPos]?j:minPos;
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
            System.out.println("经过第n次循环之后，数组的内容，");

        }
        print(arr);
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
static  void print(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
    }
}
}












