import java.util.*;

public class Trial {

    class Student{
        int rollNo;
    }

    public static void main(String[] args) {

//        List<Integer> al =  Arrays.asList(1,2,3,4,5,6,7,8);//new ArrayList((Arrays.asList(new int[]{12, 21, 11})));
//
//        System.out.println(al);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(8);
        al.add(6);
        al.add(4);
        al.addAll(Arrays.asList(1,2,3,4));
        //System.out.println(al);

//        Spliterator<Integer> secondHalf = al.spliterator();
//
//        Spliterator<Integer> firstHalf = secondHalf.trySplit();
//
//        firstHalf.forEachRemaining(System.out::println);
//        System.out.println("-------------");
//        secondHalf.forEachRemaining(System.out::println);

//        Spliterator<Integer> spI  = al.spliterator();
//
//        while (spI.tryAdvance(System.out::println));



//        HashMap<Integer,Integer> hm = new HashMap<>();
//
//        hm.put(1,2);
//        hm.put(3,4);
//        hm.put(5,6);
//
//        Iterator ihm = hm.keySet().iterator();
//
//        ArrayList<Integer> al2 = new ArrayList(hm.values());
//
//        Collection c =  hm.values();

//        LinkedList<Integer> l = new LinkedList<>();
//        l.add(4);
//        l.add(0);
//        l.add(9);
//        System.out.println(l);
//        System.out.println(hm);
//        System.out.println(al);
//        System.out.println(c);

//        Object o = new Object();
//
//        Student s = (Student)o;

        Iterator i = al.iterator();

        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        //i = al.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }

    }
}
