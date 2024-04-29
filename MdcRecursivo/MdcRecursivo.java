package MdcRecursivo;

public class MdcRecursivo {
    public static void main(String[] args) {
        int m = 36;
        int n = 24;
        System.out.println("MDC de " + m + " e " + n + " é: " + mdc(m, n));
    }

    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }
}

