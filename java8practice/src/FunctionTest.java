
//interface Function<T,R>{
//    R apply(T t );
//}

import java.util.function.Function;

public class FunctionTest {

//    Function<String,Integer> f = new Function<String, Integer>() {
//        @Override
//        public Integer apply(String s) {
//            return s.length();
//        }
//    };

    public static void main(String[] args) {

        Function<String,Integer> fl = String::length; //s -> s.length();

        System.out.println(fl.apply("Rakesh"));
        System.out.println(fl.apply("Money"));

    }


}
