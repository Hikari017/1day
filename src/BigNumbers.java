import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("5");

        for(int i = 0; i <= 10000; i++){
            bigInteger = bigInteger.multiply(new BigInteger("5"));
        }

        System.out.println(bigInteger.toString());

        //////////////////////////////////////////////////


        BigDecimal decimal = new BigDecimal("0.33");
        decimal = decimal.multiply(new BigDecimal("0.3"));

        System.out.println(decimal.toString());

    }
}
