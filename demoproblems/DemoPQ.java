package demoproblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
    public static void main(String[] args) {
        Queue<String> q2=new PriorityQueue<>((a, b) -> b.compareTo(a));
        q2.offer("Sabari");
        q2.offer("Balaji");
        q2.offer("Richard");
        q2.offer("Anbu");
        q2.offer("Prakash");
        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll());
    }
}