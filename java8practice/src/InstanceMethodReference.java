import java.util.ArrayList;

class A{

}
class B extends A{

}
interface Sayable{
     A say();
}
public class InstanceMethodReference {
    public B saySomething(){
        System.out.println("Hello, this is non-static method.");

        return new B();
    }
    public static void main(String[] args) {
//        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object
//        // Referring non-static method using reference
//        Sayable sayable = methodReference::saySomething;
//        // Calling interface method
//        sayable.say();
//         Referring non-static method using anonymous object
        Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also
        // Calling interface method
        System.out.println(sayable2.say());
    }
}  