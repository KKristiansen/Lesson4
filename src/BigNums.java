import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNums {
    final static String WI_POP = "5726398";
    final static String CA_POP = "38041430";
    final static String TX_POP = "26059203";

    public static void main(String[] args) {
        BigInteger wiPop = new BigInteger(WI_POP);
        BigInteger caPop = new BigInteger(CA_POP);
        BigInteger txPop = new BigInteger(TX_POP);

        BigInteger letters = wiPop.multiply(caPop);
        System.out.println(letters + " letters written to CA.");

        BigInteger copies = letters.multiply(txPop);
        System.out.println(copies + " copies made to TX.");

        BigDecimal decCopies = new BigDecimal(copies);
        BigDecimal costs = decCopies.multiply(BigDecimal.valueOf(3.23));
        System.out.println("Letters cost: $" + costs);
    }
}
