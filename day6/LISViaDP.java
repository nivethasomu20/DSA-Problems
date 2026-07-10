package day6;

import java.util.Arrays;

public class LISViaDP {
    public static int findLength(int[] arr){
        int size= arr.length, mLen=1;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        for(int i=1;i<size;i++){
            for(int j=0;j<i;j++)
                if(arr[i]>arr[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            mLen=Math.max(mLen,dp[i]);
        }
        return mLen;
    }
    public static void main(String[] args) {
        System.out.println(findLength(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(findLength(new int[]{0,1,0,3,2,3}));
        System.out.println(findLength(new int[]{7,7,7,7,7,7,7}));
    }
} 