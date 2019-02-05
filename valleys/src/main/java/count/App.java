package count;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("no of vallyes = " + countingValleys(8,"UDDDUDUU"));

    }

    static int countingValleys(int n, String s) {
        int counter = 0;
        int valleyCount = 0;
        char c = 0;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if ('U' == c) {
                counter++;
            } else if ('D' == c) {
                if (0 == counter) {
                    valleyCount++;
                }
                counter--;
            }

        }
        return valleyCount;
    }
}

