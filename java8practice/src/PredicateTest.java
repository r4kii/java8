import java.util.function.Predicate;

//interface Predicate<T>{
//
//    boolean checkValue(T t );
//}
public class PredicateTest{

    public static void usePredicate(Predicate<Integer> p,int []arr){
        for(int i :arr){
            if(p.test(i)) System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6,76,89,12};

        Predicate<Integer> p1 = a -> (a>10);//(a) ->{ return (a>10);};
        Predicate<Integer> p2 = a -> (a%2==0);

        usePredicate(p1,arr);
        usePredicate(p2,arr);
        usePredicate(p1.negate(),arr);
        usePredicate(p1.and(p2),arr);
        usePredicate(p1.or(p2),arr);

//        System.out.println(p1.test(100));
//        System.out.println(p1.test(1));
//        System.out.println(p.checkValue(1));

    }


}
