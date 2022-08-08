

import static java.util.Comparator.*;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
//import java.util.Comparator;
//import  java.util.Comparator.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
//import java.util.function.Supplier;
//import java.util.stream.Collectors;


class Apple{
    private int weight ;
    private String color;

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
public class Check{

    static ArrayList<Apple> inventory = new ArrayList<>();

    public static void main(String[] args) {

        inventory.add(new Apple(111,"red"));
        inventory.add(new Apple(25,"red"));
        inventory.add(new Apple(28,"green"));
        inventory.add(new Apple(37,"green"));
        inventory.add(new Apple(55,"green"));

        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));


        Predicate<Apple> redApple = a ->  a.getColor().equals("red");
        Predicate<Apple> notRedApple = redApple.negate();

        Predicate<Apple> redAndHeavyApple = redApple.and(a-> a.getWeight()>=25);

        inventory.stream().filter(redApple);

        List<Integer> l = inventory.stream().filter(apple -> {
            System.out.println("Filtering:" +apple.getWeight());
            return apple.getWeight()>25;

        }).map(apple -> {
            System.out.println("Mapping:" +apple.getWeight());
            return apple.getWeight();
        }).limit(2).collect(toList());

        System.out.println(l);

//        for (Apple a : inventory){
//
//            if(redAndHeavyApple.test(a))
//            System.out.println(a.getWeight()+" "+a.getColor());
//        }


        Function<Integer,Integer> f = x->x+10;
        Function<Integer,Integer> g = x->x*2;
        Function<Integer,Integer> h = f.andThen(g);//g(f(x))
        Function<Integer,Integer> i = f.compose(g);//f(g(x))
    }
}
