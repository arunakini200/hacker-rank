import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();

        BigInteger number = new BigInteger(n);

        if (number.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
