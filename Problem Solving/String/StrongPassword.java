import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    
        
        int count=0;
        // Return the minimum number of characters to make the password strong
//        String strRegEx = "((?=.*[a-z])(?=.*d)(?=.*[!@#$%^&*()-+])(?=.*[A-Z]).{6,16})";
//        (?=.*[a-z])     : This matches the presence of at least one lowercase letter.
//        (?=.*d)         : This matches the presence of at least one digit i.e. 0-9.
//        (?=.*[@#$%])    : This matches the presence of at least one special character.
//        ((?=.*[A-Z])    : This matches the presence of at least one capital letter.
//        {6,16}          : This limits the length of password from minimum 6 letters to maximum 16 letters.
        
        String checkAtLeastOneDigit = ".*[0-9].*";
        String checkLowerCase = ".*[a-z].*";
        String checkUpperCase = ".*[A-Z].*";
        String checkSpecialChar = ".*[!@#$%^&*()+-].*";
        
        if(!password.matches(checkSpecialChar))
        {
            count++;
            System.out.println("no Special Character");
        }
        if(!password.matches(checkLowerCase))
        {
            count++;
            System.out.println("No Small Letter");
        }
        if(!password.matches(checkUpperCase))
        {
            count++;
            System.out.println("No Capital Letter");
        }
        if(!password.matches(checkAtLeastOneDigit))
        {
            count++;
            System.out.println("No Digial Number");
        }
        if(n<6)
        {
            if(6-n>count)
            {
                count +=(6-n-count);
            }
        }
        return count;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
