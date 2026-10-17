package TugasSesi4;
import java.util.Scanner;
public class BilPrima {
    public static void main (String[] args) throws Exception {
         Scanner inputan = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = inputan.nextInt();

        System.out.println("Output:");

        for (int i = 2; i <= N; i++) {
            boolean prima = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }

        inputan.close();
    }
}