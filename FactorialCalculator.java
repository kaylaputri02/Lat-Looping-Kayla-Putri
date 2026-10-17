package TugasSesi4;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main (String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = inputan.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }

        System.out.println("Output: " + N + "! = " + hasil);

        inputan.close();
    }
}
