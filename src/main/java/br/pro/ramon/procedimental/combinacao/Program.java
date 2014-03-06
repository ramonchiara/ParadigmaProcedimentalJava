package br.pro.ramon.procedimental.combinacao;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("n: ");
        int n = Integer.parseInt(console.nextLine());

        System.out.print("k: ");
        int k = Integer.parseInt(console.nextLine());

        int fatorialN = 1;
        for (int i = 1; i <= n; i++) {
            fatorialN = fatorialN * i;
        }

        int fatorialK = 1;
        for (int i = 1; i <= k; i++) {
            fatorialK = fatorialK * i;
        }

        int fatorialNK = 1;
        for (int i = 1; i <= (n - k); i++) {
            fatorialNK = fatorialNK * i;
        }

        int c = fatorialN / (fatorialK * fatorialNK);

        System.out.printf("C(%d, %d) = %d\n", n, k, c);
    }

}
