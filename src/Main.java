
import java.util.*;

public class Main {


    public static Long SquirrelFactorial(int n) {

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        char[] smaragd = String.valueOf(fact).toCharArray();

        return Long.parseLong(String.valueOf(smaragd[0]));

    }

}

