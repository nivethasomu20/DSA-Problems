package day3;

import java.util.Arrays;

public class CountOverlapIntervals{
    public static int find(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count = 0, cEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<cEnd) count++;
            else cEnd = intervals[i][1];
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] testcase1 = {{1,2},{2,3},{3,4},{1,3}};
        int[][] testcase2 = {{1,2},{1,2},{1,2}};
        System.out.println(find(testcase1));
        System.out.println(find(testcase2));
    }
}