// ArrayList

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// public class Collections{
//         public static void main(String args[]){
//         List<Integer> lis = new ArrayList<>();
//         lis.add(10);
//         lis.add(12);
//         lis.get(0);
//         // lis.remove(1);
//         lis.size();
//         lis.contains(10); //true or false
//         for(int i:lis){
//             System.out.print(i+" ");
//         }
//     }
// }





//LinkedList

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.List;
// public class Collections{
//         public static void main(String args[]){
//         LinkedList<Integer> lis = new LinkedList<>();
//         lis.add(10);
//         lis.addFirst(20);
//         lis.addLast(30);
//         lis.contains(20);
//         for(int i:lis){System.err.print(i+" ");}
//         //lis.removeFirst()
//        // lis.removeLast()
//        //lis.remove();
//        lis.get(0);
//        lis.getLast();
//        lis.getFirst();
//     }
// }



//Stack

// import java.util.Stack;
// public class Collections{
//         public static void main(String args[]){
//             Stack<Integer> lis=new Stack();
//             lis.add(1);
//             lis.add(2);
//             lis.add(3);
//             lis.add(4);
//             lis.add(5);
//             lis.pop();
//             System.out.println(lis);
//             lis.size();
//             lis.remove(0);
//             lis.elementAt(1);
//             lis.indexOf(4);
//             System.out.println(lis.contains(3));//return true or false  O(n)
//             System.out.println(lis);
//             System.out.println(lis.search(4));//specificially used on Stack, used to find a elements position
//             //in the above example the 4 number is stored in the position 1 in stack so it returns 1
//     }
// }



//Queue

// import java.util.Queue;
// import java.util.LinkedList;
// public class Collections{
//     public static void main(String args[]){
//         Queue<Integer> q=new LinkedList();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.peek();// gets the 1st value
//         q.poll();//remove the value
//         System.out.println(q);
//         //generic
//         //contains()
//         //size()
//         //indexof()
//         //clear()
//     }
// }



//ArrayDequeue     double ended queue

// import java.util.ArrayDeque;
// import java.util.Queue;
// public class Collections {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> q=new ArrayDeque<>();
//         q.add(1);
//         q.offer(2);
//         System.out.println(q);
//         q.addFirst(20);
//         q.addLast(20);
//         System.out.println(q);
//         q.removeFirst();
//         q.removeLast();
//         System.out.println(q);
//         q.offerFirst(20);
//         q.offerLast(23);
//         System.out.println(q);
//         System.out.println(q.peekFirst());
//         q.peekLast();
//         System.out.println(q);
//         q.pollFirst();
//         q.pollLast();
//         System.out.println(q);
//     }
// }



//PriorityQueue      priority queue uses heap datastructure

// import java.util.PriorityQueue;
// public class Collections {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> q=new PriorityQueue<>();
//         q.offer(19);
//         q.offer(23);
//         q.offer(8);
//         q.offer(2);
//         q.offer(81);
//         System.out.println(q);
//         q.poll();
//         System.out.println(q);
//         q.offer(18);
//         System.out.println(q);
//         q.peek();
//         System.out.println(q);
//         q.poll();
//         System.out.println(q);
//     }
// }



//Dequeue

// import java.util.LinkedList;
// import java.util.Deque;
// public class Collections {
//     public static void main(String[] args) {
//         Deque<Integer> dq=new LinkedList<>();
//         dq.offer(1);
//         dq.offerFirst(12);
//         dq.offerLast(11);
//         System.out.println(dq);
//         dq.pollFirst();
//         dq.pollLast();
//         System.out.println(dq.peekFirst());
//         dq.peekLast();
//         System.out.println(dq);
//     }
// }


//Set          Set is unordered and unique

// import java.util.Set;
// import java.util.HashSet;
// public class Collections {
//     public static void main(String[] args) {
//         Set<Integer> s=new HashSet<>(10);
//         s.add(10);
//         s.add(7);
//         s.add(3);
//         s.add(4);
//         s.add(19);
//         s.add(4);
//         System.out.println(s);
//         s.remove(4);
//         System.out.println(s);
//     }
// }



//LinkedHashSet

// import java.util.LinkedHashSet;
// import java.util.Set;
// public class Collections {
//     public static void main(String[] args) {
//         Set<Integer> s=new LinkedHashSet<>();
//         s.add(10);
//         s.add(20);
//         s.add(20);
//         s.add(30);
//         System.out.println(s);
//         s.remove(20);
//         s.size();
//     }
// }



//SortedSet

// import java.util.SortedSet;
// import java.util.TreeSet;
// public class Collections {
//     public static void main(String[] args) {
//         SortedSet<Integer> st=new TreeSet<>();
//         st.add(10);
//         st.add(15);
//         st.add(25);
//         st.add(19);
//         st.add(10);
//         System.out.println(st);
//         st.remove(10);
//         st.first();
//         System.out.println(st.last());
//         st.size();
//     }
// }



//Map is a collection of key value pair, and the key will be unique

// import java.util.Map;
// import java.util.TreeMap;
// public class Collections {
//     public static void main(String[] args) {
//         Map<Integer,String> m=new TreeMap<>();
//         m.put(101,"Raju");
//         m.put(102,"Rahul");
//         m.put(101,"Ravi");
//         m.put(100, "Hari");
//         System.out.println(m);
//         m.put(102,"Tillu");
//         System.out.println(m);
//         m.remove(101);
//         System.out.println(m);
//         System.out.println(m.get(102));
//         System.out.println(m.keySet());
//         System.out.println(m.values());
//         System.out.println(m.entrySet());
//     }
// }


//HashMap

// import java.util.HashMap;
// import java.util.Map;
// public class Collections {
//     public static void main(String[] args) {
//         Map<Integer,String> m=new HashMap<>();
//         m.put(102, "Ravi");
//         m.put(103,"ram");
//         m.put(101,"raju");
//         m.put(104,"rahul");
//         m.put(105,"mihir");
//         System.out.println(m);
//         System.out.println(m.get(101));
//         System.out.println(m.keySet());
//         System.out.println(m.values());
//         m.remove(102);
//         System.out.println(m);
//     }
// }


//LinkedHashMap

import java.util.LinkedHashMap;
import java.util.Map;
public class Collections {
    public static void main(String[] args) {
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(102, "a");
        m.put(101, "e");
        m.putIfAbsent(101, "b");//if 101 is absent in the hash map them it will execute otherwise not
        System.out.println(m);
        System.out.println(m.get(101));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        m.replace(102,"n");
        System.out.println(m);
    }
}