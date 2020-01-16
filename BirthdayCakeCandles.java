import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

    	List<Integer> test = new ArrayList<Integer>() {{ for (int i : ar) add(i); }};
    	Collections.sort(test);
    	return Collections.frequency(test,test.get(test.size()-1) );
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
// bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int arCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    	int arCount = 4;
    	int[] ar = {3,2,1,3};
//    	int[] ar = new int[arCount];

//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < arCount; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
