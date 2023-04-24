package org.example.algorothm;

public class KekeEetBanana {
    public static void main(String[] args) {
        int[] a = {1,3,6,5,4,9,3};
        minEatingSpeed(a,7);
    }

    /**
     *
     * @param piles 香蕉的堆数和每堆个数
     * @param h 管理员离开几个小时
     * @return 最合适堆时间
     */
    public  static int minEatingSpeed(int[] piles,int h){
        int L = 1;
        int R =0;
        for (int pile : piles) {
            R = Math.max(R,pile);
        }
        int hour = -1;
        int M= 0;
        while (L<= R){
            M = L + ((R-L)>>1);
            if(hours(piles,M)<= h){
                hour = M;
                R = M -1;
            }else{
                L = M +1;
            }
        }
        System.out.println(hour);
        return hour;
    }

    /**
     *
     * @param piles :数组里面是香蕉个数
     * @param speed 星星的速度
     * @return 几个小时吃完
     */
    public static int hours(int[] piles,int speed){
        int hour=0;
        int offset = speed-1;
        for (int  pile: piles) {
            hour+= (pile+offset)/speed;//向上取整
        }
        return hour;
    }
}
