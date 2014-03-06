package br.pro.ramon.procedimental.fatorial;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("n: ");
        int n = Integer.parseInt(console.nextLine());

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.printf("n! = %d\n", fatorial);
    }

}
