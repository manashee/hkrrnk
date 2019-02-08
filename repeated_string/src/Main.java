public class Main {

    public static void main(String[] args) {
        System.out.println(repeatedString("a", 1000000000000L));
    }


    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        int countInOriginal = countChar ( s, 'a');
        long timesRepeated = n / s.length();
        long rem = n % s.length();

        if ( rem == 0 )
            return countInOriginal * timesRepeated;
        else {
            String sub = s.substring ( 0,(int) rem );
            int count  = countChar ( sub, 'a');
            return countInOriginal * timesRepeated + count;
        }
    }


    static int countChar ( String s , char c ) {
        int counter = 0 ;
        for ( int i = 0 ; i< s.length() ; i++ )
        {
            if ( s.charAt(i) == c )
                counter ++ ;
        }
        return counter;
    }

}
