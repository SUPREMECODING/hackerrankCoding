import java.util.*;
public class PowerSet {

    static <T> Set<Set<T>> powerSet( Set<T> set ) {
        T[] element = (T[]) set.toArray();
        final int SET_LENGTH = 1 << element.length;
        Set<Set<T>> powerSet = new HashSet<>();
        for( int binarySet = 0; binarySet < SET_LENGTH; binarySet++ ) {
            Set<T> subset = new HashSet<>();
            for( int bit = 0; bit < element.length; bit++ ) {
                int mask = 1 << bit;
                if( (binarySet & mask) != 0 ) {
                    subset.add( element[bit] );
                }
            }
            powerSet.add( subset );
        }
        return powerSet;
    }

    public static void main(String[] args) {
        Set<Character> test = new HashSet<>();
        test.add( '2' );
        test.add( '5' );
        test.add( '3' );
        test.add( '6' );
        System.out.println("test = " + test);
        Set<Set<Character>> result = powerSet( test );
        System.out.println( result );
    }
}