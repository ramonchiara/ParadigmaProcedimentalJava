package br.pro.ramon.procedimental.pascal;

public class Program {

    public static void main(String[] args) {
        for (int n = 0; n <= 9; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.printf("%5d", c(n, k));
            }
            System.out.println();
        }
    }

    public static int c(int n, int k) {
        return fatorial(n) / (fatorial(k) * fatorial(n - k));
    }

    public static int fatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

}
