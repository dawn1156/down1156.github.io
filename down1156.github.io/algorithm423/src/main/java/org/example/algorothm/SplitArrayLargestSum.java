package org.example.algorothm;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] n={1,3,5,2,6,9,10};
        System.out.println(splitArrays(n,2));

    }
    public  static  long splitArrays(int[] nums,int M){
        long sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        long l = 0;
        long r = sum;
        long ans = 0;
        while (l<r){
            long mid = l+((r-l)>>1);
            long cur = getNeedParts(nums,mid);
            if(cur<=M){
                ans = mid;
                r= mid-1;
            }else{
                l = mid+1;
            }
        }

        return ans;
    }
    public  static int getNeedParts(int[] n ,long aim){
        for (int i = 0; i < n.length; i++) {
            if (n[i]>aim) {
                return Integer.MAX_VALUE;
            }
        }
        int part = 1;
        int sum =0;
        for (int i = 0; i < n.length; i++) {
            if (sum+n[i]>aim){
                sum =n[i];
                part++;
            }else {
                sum+=n[i];
            }
        }
        return part;
    }
}
