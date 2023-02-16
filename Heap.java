// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.LinkedList;
// import java.util.List;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        
        //LinkedList<Integer> l=new LinkedList<>();
        
    
        int[] a={16,14,10,8,7,9,1,2,4,3};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
        pq.add(a[i]);
        //pq.remove();
        System.out.println(pq);
    }
}