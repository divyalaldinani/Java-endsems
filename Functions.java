import static java.lang.System.out;
//Functions: return any type of result based on requirement
//its a functional interface and has 1 method: apply()
import java.util.function.Function;

public class Functions {
    public static void main(String[] args ) {
        //Function<Input type, return type>
        Function<Integer, String> f = x -> {
            String s = "";
            for( int i = 0; i < x; i++ ) s = s + 'a';
            return s; //return string of given length
        };

        out.println(f.apply(6));



        Function<Double, Boolean> isPositive = x -> ( x > 0 );
        out.println(isPositive.apply(0.));
        out.println(isPositive.apply((double)(1e-9)));
    }
}

//interface Function<T, R> {
//    public R apply( T t);
//}