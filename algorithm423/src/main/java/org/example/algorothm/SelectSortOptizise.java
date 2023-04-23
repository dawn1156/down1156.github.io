package org.example.algorothm;

public class SelectSortOptizise {
    public static void main(String[] args) {
        int[] arr = {33,22,11,4,5,6,77,8};
        /**
         * 选择出最小的和最大的，
         *
         */
        for (int i = 0; i < arr.length; i++) {
            int minPos= i,maxPos=arr.length-i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[minPos]){
                    minPos= j;
                }
                if (arr[j]<arr[maxPos]){
                    maxPos= j;
                }
            }
            System.out.println(arr[minPos]);
            System.out.println(arr[maxPos]);

        }
    }
}
