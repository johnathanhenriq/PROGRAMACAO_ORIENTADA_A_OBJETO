package Q30_MaiorValor;

public class MaiorValor {
    public static int maior(int a, int b) {
        return Math.max(a, b);
    }

    public static int maior(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int maior(int a, int b, int c, int d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static int maior(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }

    public static double maior(double a, double b) {
        return Math.max(a, b);
    }

    public static double maior(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static double maior(double a, double b, double c, double d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static double maior(double a, double b, double c, double d, double e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }

   
}

