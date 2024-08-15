
//predicate - function with single argument and returns boolean
//predicate in java.util.function
//functional interface (can refer lambda exp) -> method test()
import java.util.function.Predicate;
import static java.lang.System.out;
public class predicates {
    public static void main(String[] args ) {
        //function with single argument and returns a boolean value

        Predicate<Integer> p = x -> (x >= 0 );
        out.println(p.test(-1));
        out.println(p.test(0));
        out.println(p.test(1));


        Predicate<String> p1 = x -> ( x.length() >= 5 );
        out.println(p1.test("Hello"));
        out.println(p1.test("Hey"));
        out.println(p1.test("Hello, World!"));
    }
}
//interface Predicate<Integer> {
//    public boolean test(Integer t) ; //by default
//}