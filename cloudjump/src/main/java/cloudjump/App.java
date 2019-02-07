package cloudjump;

/**
 * Hello world!
 *
 */
public class App 
{

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int [] result = new int [100];
        int j = 0;

        for (int i = 0; i < c.length; ) {
            //System.out.println ( "i + 2 =  " + (i + 2) + "  c.len= " + c.length );
            if ( ( i + 2 ) < c.length && c[i+2] == 0 ) {
                //System.out.println ( "i+2 < c.length and c[i+2] ==0 ");

                result[j] = i+1;
                //System.out.println ( "j = " + j + " result [j] = " + result[j]);
                i+=2;
                j++;
            }
            else if ( ( i + 1 ) < c.length && c[i+1] == 0 ) {
                //System.out.println ( "i+2 < c.length and c[i+2] ==0 ");
                result[j] = i+1;
                //System.out.println ( "j = " + j + " result [j] = " + result[j]);
                i++;
                j++;
            } else
            {
                i++;
                //System.out.println ("Either we are at the last element or Neither next or next to next is not 0");
            }
        }

    return j;
    }

    public static void main( String[] args )
    {
        int [] c = new int []  {0,0,0,0,1,0};

        System.out.println( jumpingOnClouds(c) );
    }
}
