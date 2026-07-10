package day6;

import java.util.Arrays;

public class CoinChangeViaDP {
    public static int dispense(int[] den,int req){
        int def = req+1;
        int[] dp = new int[def];
        Arrays.fill(dp, def);
        dp[0]=0;
        for(int cur:den){
            for(int i=cur;i<def;i++)
                dp[i] = Math.min(dp[i], 1+dp[i-cur]);
        }
        return (dp[req]<req)?dp[req]:-1;
    }
    public static void main(String[] args) {
        int[] denom = {100,200,500};
        System.out.println(dispense(denom, 300));
        System.out.println(dispense(denom, 600));
        System.out.println(dispense(denom, 1350));
        System.out.println(dispense(denom, 2500));
        System.out.println(dispense(denom, 1));
    }
}