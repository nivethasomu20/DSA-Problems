package day3;

public class GasStation {
    public static int circle(int[] gas, int[] cost){
        int totTank = 0, carTank = 0, iSta=0;
        for(int i=0;i<gas.length;i++){
            totTank += gas[i]-cost[i];
            carTank += gas[i]-cost[i];
            if(carTank<0) {
                carTank=0;
                iSta=i+1;
            }
        }
        return totTank>=0?iSta:-1;
    }
    public static void main(String[] args) {
        System.out.println(circle(new int[]{1,2,3,4,5}, 
            new int[]{3,4,5,1,2}));
    }
}