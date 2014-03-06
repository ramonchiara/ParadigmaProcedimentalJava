package br.pro.ramon.procedimental.combinacao2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("n: ");
        int n = Integer.parseInt(console.nextLine());

        System.out.print("k: ");
        int k = Integer.parseInt(console.nextLine());

        int c = fatorial(n) / (fatorial(k) * fatorial(n - k));

        System.out.printf("C(%d, %d) = %d\n", n, k, c);
    }

    public static int fatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

}
