import java.util.*;
import static java.lang.System.out;


//NOTE: CONSTRUCTOR REFERENCE
//eg 1
class Person {
    String name;

    public Person( String name ) { //constructors dont have a return type lol -> methods have a return type
        this.name = name;
    }
    public String getName( ) {
        return (this.name);
    }
}
interface PersonFactory {
    Person create(String name); //abstract method
}

//eg 2
class Nescafe {
    int caffeineContent ;
    public Nescafe(int caffeineContent ) {
        this.caffeineContent = caffeineContent;
    }
    public String getCoffee() {
        return ("This coffee has caffeine content " + this.caffeineContent + ".");
    }
}
interface Coffee {
    Nescafe create( int caffeine );
}


//method ref: eg 1
class Test1 {
    public static void m1() {
        for( int i = 0; i < 10; i++ ) {
            out.println("Hi");
        }
    }
    public static void main(String[] args ) {
        Runnable r = Test1::m1;
        Thread t = new Thread(r);
        t.start();
        for( int i = 0; i < 10; i++ ) out.println("Hello");

        Interface i = x -> out.println("from lambda exp " + x);
        i.m1(5);

    }
}
interface Interf {
    void m1(int i);
}
//method ref : eg 2
class Test2 {
    public void m2(int i) {
        System.out.println("From Method Reference:" + i);
    }

    public static void main(String[] args) {
        Interf f = i -> System.out.println("From Lambda Expression:" + i);
        f.m1(10);

        Test2 t = new Test2();
        Interf i1 = t::m2; //m1's method signature is same as m2, so we are saying the interface to use the
        //its abstract method m1 as taken from m2
        i1.m1(20);
    }
}

interface  Interface {
    public void m1 (int i );
}

public class methodAndConstructorRef {
    //if the programmer specified method is static -> className::methodName
    //if method is instance, Objref::methodName
    //functional interfaces can refer lambda exp and functional interfaces can rfer method ref
    public static void main(String[] args ) {
        PersonFactory factory = Person::new;

//        PersonFactory factory = name -> new Person(name); //using lambda exp

        Person p1 = factory.create("Suyash");
        out.println(p1.getName());



















        Coffee coffee = Nescafe::new;
        Nescafe nescafeCoffee = coffee.create(53);
        out.println(nescafeCoffee.getCoffee());
    }
}



