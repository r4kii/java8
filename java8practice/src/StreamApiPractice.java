
//Internal iterations using streamApi
//Stream has a lot of useful in-built methods
//Intermediate method and Terminate methods
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamApiPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

       // numbers.stream().forEach(i-> System.out.print(i+" "));
//        Consumer<Integer> c = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.print(integer+" ");
//            }
//        };
//
//        Consumer<Integer> c1 = i -> System.out.println(i);
//        numbers.forEach( i -> System.out.print(i+" "));
//        numbers.forEach(System.out::println);//call by method reference
//        System.out.println();
//        numbers.forEach(c);
        //System.out.println(numbers);


       List<String> words =Arrays.asList("Hello","World");
//        String[] afterSplit = words[0].split("");
//
//
//        String[] arrayOfWords = {"Goodbye", "World"};
//        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);

        List<String> uniqueCharacters =
                words.stream()
                        .map(word -> word.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(toList());

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5);



        List<int[]> ans = l1.stream().flatMap(i->l2.stream().map(j->new int[]{i,j})).collect(toList());

        ans.stream().map(Arrays::toString).forEach(System.out::println);
        //System.out.println();
    }

}
