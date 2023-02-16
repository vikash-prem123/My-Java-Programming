import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Demo
{
    public static void main(String[] args) {
        
        //Arraylist implementation in java
        
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(0,2);
        System.out.println(a);
        
        //Linked List implementation in java

        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.addFirst(0);
        l.addLast(4);
        System.out.println(l);

        //Queue implementation in java
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<5;i++)
        q.add(i);
        q.remove();
        q.add(8);
        System.out.println(q.peek());
        System.out.println(q.element());
        q.offer(9);
        q.poll();
        System.out.println(q);

        //Stack implementation in java

        Stack<Integer> s=new Stack<>();
        for(int i=0;i<5;i++)
        s.push(i);
        s.pop();
        System.out.println(s.search(7));
        System.out.println(s);

        //List implementation in java

        List <String> li=new ArrayList<>();

        

    }
        

}
