package sock;

import java.util.HashMap;

/**
 * Hello world!
 *
 */

public class App
{
     static int sockMerchant ( int n, int [] ar ) {

         HashMap<Integer,Integer> freqCount = new HashMap<>();


         for ( int i = 0, j = 0; i < ar.length ; i++ ) {
             Integer count = freqCount.get(ar[i]);
             if ( null == count ) {
//                 System.out.println("added " + ar[i] );
                 freqCount.put(ar[i], 1);
//                 System.out.println("count = " + freqCount.get(ar[i]) );
             }
             else {
//                 System.out.println("about to update " + ar[i] + " cur count = " + freqCount.get(ar[i]));
                 freqCount.put(ar[i], freqCount.get(ar[i])  + 1 );
//                 System.out.println("updated " + ar[i] + " with count " + freqCount.get(ar[i]) );
             }
         }

        int sum = 0;
        for ( Integer i : freqCount.keySet() ) {
            sum += freqCount.get(i) / 2;
//            System.out.println("count of = " + i + " is " +  freqCount.get(i) + " sum = " + sum);
        }

        return sum;
    }


    public static void main( String[] args )
    {
        int [] arr = new int [] { 10,20,20,10,10,30,50,10,20} ;
        System.out.println( sockMerchant ( arr.length , arr ) );
    }
}
