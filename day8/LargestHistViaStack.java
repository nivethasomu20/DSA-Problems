package day8;

import java.util.Stack;

public class LargestHistViaStack {
    public static int areaFind(int[] arr){
        int maxArea=0, temp=0;
        Stack<Integer> pos = new Stack<>();
        for(int i=0;i<=arr.length;i++){
            int cValue = (i==arr.length)?0:arr[i];
            while(!pos.isEmpty()&&cValue<arr[pos.peek()]){
                int len = arr[pos.pop()];
                int brd = pos.isEmpty()?
                        i:i-pos.peek()-1;
                temp = len*brd;
                maxArea = Math.max(maxArea, temp);
            }
            pos.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println(areaFind(new int[]{2,1,5,6,2,3}));
    }
}