package Interface;

public class Tinhtoan {

    static double a_b[] = new double[]{0, 1, 1.2, 1.4, 1.6, 1.8, 2, 2.4, 2.8, 3.2, 4, 5};
    static double z_b[] = new double[]{0, 0, 0.4, 0.8, 1.2, 1.6, 2, 2.4, 2.6, 3.2, 3.6, 4, 4.4, 4.8, 5.2, 5.6, 6, 6.4, 6.8, 7.2, 7.6, 8, 8.4, 8.8, 9.2, 9.6, 10, 11, 12};
    static double k0[][] = new double[][]{
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0.960, 0.968, 0.972, 0.947, 0.975, 0.976, 0.976, 0.977, 0.977, 0.977, 0.977},
        {0, 0.800, 0.830, 0.848, 0.859, 0.866, 0.870, 0.875, 0.878, 0.879, 0.880, 0.880},
        {0, 0.606, 0.654, 0.682, 0.703, 0.717, 0.727, 0.740, 0.740, 0.749, 0.753, 0.754},
        {0, 0.449, 0.496, 0.532, 0.558, 0.578, 0.593, 0.612, 0.623, 0.630, 0.639, 0.639},
        {0, 0.336, 0.397, 0.414, 0.441, 0.463, 0.481, 0.505, 0.520, 0.529, 0.540, 0.545},
        {0, 0.257, 0.294, 0.325, 0.352, 0.304, 0.395, 0.419, 0.437, 0.449, 0.462, 0.470},
        {0, 0.201, 0.232, 0.260, 0.284, 0.374, 0.321, 0.350, 0.369, 0.386, 0.400, 0.410},
        {0, 0.160, 0.187, 0.210, 0.252, 0.251, 0.267, 0.294, 0.031, 0.329, 0.348, 0.360},
        {0, 0.130, 0.153, 0.173, 0.192, 0.209, 0.224, 0.250, 0.270, 0.285, 0.305, 0.320},
        {0, 0.108, 0.127, 0.145, 0.161, 0.170, 0.190, 0.214, 0.233, 0.248, 0.270, 0.285},
        {0, 0.091, 0.107, 0.122, 0.137, 0.150, 0.163, 0.187, 0.170, 0.218, 0.239, 0.256},
        {0, 0.077, 0.092, 0.105, 0.118, 0.130, 0.141, 0.161, 0.157, 0.192, 0.213, 0.230},
        {0, 0.066, 0.079, 0.091, 0.102, 0.112, 0.123, 0.141, 0.139, 0.170, 0.191, 0.208},
        {0, 0.058, 0.069, 0.079, 0.089, 0.099, 0.108, 0.124, 0.124, 0.152, 0.172, 0.189},
        {0, 0.051, 0.060, 0.070, 0.078, 0.087, 0.095, 0.110, 0.111, 0.136, 0.155, 0.175},
        {0, 0.045, 0.053, 0.062, 0.070, 0.077, 0.085, 0.098, 0.100, 0.122, 0.141, 0.158},
        {0, 0.040, 0.048, 0.055, 0.062, 0.069, 0.076, 0.088, 0.090, 0.110, 0.128, 0.144},
        {0, 0.036, 0.041, 0.049, 0.056, 0.062, 0.068, 0.080, 0.082, 0.100, 0.117, 0.133},
        {0, 0.032, 0.038, 0.044, 0.050, 0.056, 0.062, 0.072, 0.075, 0.091, 0.107, 0.123},
        {0, 0.029, 0.035, 0.040, 0.048, 0.051, 0.056, 0.066, 0.069, 0.084, 0.098, 0.113},
        {0, 0.026, 0.032, 0.037, 0.046, 0.046, 0.051, 0.060, 0.063, 0.077, 0.091, 0.105},
        {0, 0.024, 0.029, 0.034, 0.038, 0.042, 0.047, 0.055, 0.058, 0.070, 0.084, 0.098},
        {0, 0.022, 0.026, 0.031, 0.035, 0.039, 0.043, 0.051, 0.058, 0.065, 0.078, 0.091},
        {0, 0.020, 0.024, 0.028, 0.032, 0.036, 0.040, 0.047, 0.054, 0.060, 0.072, 0.085},
        {0, 0.019, 0.022, 0.025, 0.030, 0.033, 0.037, 0.044, 0.050, 0.056, 0.067, 0.079},
        {0, 0.017, 0.020, 0.023, 0.027, 0.029, 0.033, 0.040, 0.055, 0.050, 0.060, 0.071},
        {0, 0.005, 0.018, 0.020, 0.024, 0.026, 0.028, 0.034, 0.036, 0.044, 0.051, 0.060},};

    static double gocmasat[] = new double[]{0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 45};
    static double B[] = new double[]{1, 1.12, 1.25, 1.39, 1.55, 1.73, 1.94, 2.17, 2.43, 2.72, 3.05, 3.44, 3.87, 4.37, 4.93, 5.59, 6.35, 7.21, 8.25, 9.44, 10.84, 12.5, 14.48, 15.64};
    static double A[] = new double[]{0, 0.03, 0.06, 0.1, 0.14, 0.18, 0.23, 0.29, 0.36, 0.43, 0.51, 0.61, 0.72, 0.84, 0.98, 1.15, 1.34, 1.55, 1.81, 2.11, 2.46, 2.87, 3.37, 3.66};
    static double D[] = new double[]{3.14, 3.32, 3.51, 3.71, 3.93, 4.17, 4.42, 4.69, 5, 5.31, 5.66, 6.04, 6.45, 6.9, 7.4, 7.95, 8.55, 9.21, 9.98, 10.8, 11.73, 12.77, 13.96, 14.64};

    static double fi[][] = new double[][]{
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 35, 23, 15, 12, 8, 4, 4, 3, 2},
        {0, 42, 30, 21, 17, 12, 7, 5, 4, 4},
        {0, 48, 35, 25, 20, 14, 8, 7, 6, 5},
        {0, 53, 38, 27, 22, 16, 9, 8, 7, 5},
        {0, 56, 40, 29, 24, 17, 10, 8, 7, 6},
        {0, 58, 42, 31, 25, 18, 10, 8, 7, 6},
        {0, 62, 44, 33, 26, 19, 10, 8, 7, 6},
        {0, 65, 46, 34, 27, 19, 10, 8, 7, 6},
        {0, 72, 51, 38, 28, 20, 11, 8, 7, 6},
        {0, 79, 56, 41, 30, 20, 12, 8, 7, 6},
        {0, 86, 61, 44, 32, 20, 12, 9, 8, 6},
        {0, 93, 66, 47, 34, 21, 12, 9, 8, 6},
        {0, 100, 70, 50, 36, 22, 13, 9, 8, 6},};

    static double b[] = new double[]{0, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1};
    static double zi[] = new double[]{0, 1, 2, 3, 4, 5, 6, 8, 10, 15, 20, 25, 30, 35};

    public static double noisuy1(double[] x, double[] y, double x0) {
        double y0 = 0;
        for (int i = 1; i <= x.length - 1; i++) {
            if ((x[i - 1] <= x0) && (x0 <= x[i])) {
                y0 = y[i - 1] + (y[i] - y[i - 1]) * (x0 - x[i - 1]) / (x[i] - x[i - 1]);
                break;
            }
        }

        return y0;
    }

    public static double noisuy2(double[] x, double[] y, double[][] z, double a, double b) {
        int n, m;
        double Z1, Z2, Z = 0;
        m = x.length;
        n = y.length;
        for (int i = 1; i <= m; i++) {
            if ((x[i - 1] <= a) && (a <= x[i])) {
                for (int j = 2; j <= n; j++) {
                    if ((y[j - 1] <= b) && (b <= y[j])) {
                        Z1 = z[i - 1][j - 1] + (z[i][j - 1] - z[i - 1][j - 1]) * (a - x[i - 1]) / (x[i] - x[i - 1]);
                        Z2 = z[i - 1][j] + (z[i][j] - z[i - 1][j]) * (a - x[i - 1]) / (x[i] - x[i - 1]);
                        Z = Z1 + (Z2 - Z1) * (b - y[j - 1]) / (y[j] - y[j - 1]);
                        break;
                    }

                }

            }

        }

        return Z;

    }

    public static double chieusau(double[] chieuday, int n) {
        double chieusau = 0;
        for (int i = 0; i <= n; i++) {
            chieusau = chieusau + chieuday[i];
        }
        return chieusau;
    }

    public static double round(double number, int digit) {
        if (digit > 0) {
            int temp = 1, i;
            for (i = 0; i < digit; i++) {
                temp = temp * 10;
            }
            number = number * temp;
            number = Math.round(number);
            number = number / temp;
            return number;
        } else {
            return 0;
        }
    }

    public static double min(double a, double b) {
        double number;
        if (a > b) {
            number = b;
        } else {
            number = a;
        }
        return number;
    }

}