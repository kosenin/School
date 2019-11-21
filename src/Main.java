import java.math.BigInteger;

public class Main {
    
    public static BigInteger SquirrelFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
        }
        char[] smaragd = String.valueOf(fact).toCharArray();

        return BigInteger.valueOf(Long.parseLong(String.valueOf(smaragd[0])));

    }

}


