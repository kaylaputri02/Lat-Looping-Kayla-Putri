package TugasSesi4;
import java.util.Scanner;
public class CountingSequence {
    public static void main (String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = inputan.nextInt();

        System.out.println("Output: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        inputan.close();
    }
}