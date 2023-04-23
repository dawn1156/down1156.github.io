package org.example.algorothm;

public class CommonBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,11};
        int key = 9;
        int isExist = commonBinarySearch(arr,key);
        System.out.println(isExist);
    }
    public static  int commonBinarySearch(int[] arr,int key){
        /**
         * 1、出错的情况排除
         * 2、二分，如果大
         * 3、如果找到返回，
         */
        int high = arr[arr.length-1];
        int middle = 0;
        int low = arr[0];
        if(high<low||key>high||low>key){
            return -1;
        }
        while (low<high){
            middle=(low+high)/2;
            if(arr[middle]>key){
                high=middle-1;
            }else if (arr[middle]<key){
                low= middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
