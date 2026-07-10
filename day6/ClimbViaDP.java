package day6;

public class ClimbViaDP {
    public static int climb(int stairs){
        if(stairs<0) return 0;
        else if(stairs==1) return 1;
        else if(stairs==2) return 2;
        else{
            int[] dp=new int[stairs+1];
            dp[0]=0;dp[1]=1;dp[2]=2;
            for(int i=3;i<=stairs;i++)
                dp[i] = dp[i-1]+dp[i-2];
            return dp[stairs];
        }
    }
    public static void main(String[] args) {
        System.out.println(climb(8));
        System.out.println(climb(-4));
    }
}
