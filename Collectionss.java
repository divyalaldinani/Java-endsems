import java.util.*;

public class Collectionss {
    public static void main( String[] args ) {
        Vector v = new Vector();
        for( int i = 0; i < 10; i++ ) v.addElement(i);
        System.out.println(v);
        Enumeration e = v.elements();
        while( e.hasMoreElements()) {
            int a = (int)e.nextElement();
            if( a % 2 == 0 ) System.out.println(a);
        }

        Iterator i = v.iterator();
        while( i.hasNext()) {
            int a = (int)i.next();
            if( a % 2 == 0) System.out.println(a);
            else i.remove();
        }

        ListIterator itr = v.listIterator();
        while( itr.hasNext()) {
            int a = (int)itr.next();
            if( a % 2 == 0 ) {
                itr.set(5);
            } else itr.add(10);
        }

        System.out.println(v);

    }

//    public static void sort(ArrayList<Integer> list, MyComparator myComparator) {
//    }
}
