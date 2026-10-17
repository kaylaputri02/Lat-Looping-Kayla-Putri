import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = inputan.nextInt();

        System.out.println("Output:");

        for (int i = 0; i < N; i++) {
            int angka = 1;
            for (int j = 0; j<= i; j++) {
                System.out.print(angka + " ");

                angka = angka * (i - j) / (j + 1);
            }

            System.out.println();
        }
        inputan.close();
    }
}
