package org.example.algorothm;

public class Code02_EvenTimesOddTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,5,6,5,6,7,8,9,8};
        printOddTimesNumber(arr);
    }
    //arr中，有两种数，出现奇数次，其他的数都是偶数次

    /**
    区分a^b

     */
    public static void printOddTimesNumber(int[] arr){
        int eor  =0;
        for (int a :arr) {
            eor ^= a;//两个奇数次的异或a^b;
        }
        int rightOne = eor&(-eor);
        int zuo = 0;
        for (int num:arr) {
            if((num&rightOne)==0){
                zuo^=num;
            }

        }
        System.out.println(zuo);
        System.out.println(eor^zuo);
    }
}












