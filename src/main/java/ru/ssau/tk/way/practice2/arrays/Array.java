package ru.ssau.tk.way.practice2.arrays;

import java.util.ArrayList;

public class Array {
    int[] arr;
    int i;

    public int[] arr1(int a) {
        return new int[a];
    }

    public int[] arr3(int a) {
        arr = new int[a];
        for (i = 0; i < a; i++) {
            arr[i] = 2 * i + 1;
        }
        return arr;
    }

    public int[] arr2(int a) {
        arr = new int[a];
        arr[0] = arr[a - 1] = 2;
        for (i = 1; i < a - 1; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    public int[] arr4(int a) {
        arr = new int[a];
        for (i = 0; i < a; i++) {
            arr[i] = (a - i) * 2;
        }
        return arr;
    }

    public int[] arr5(int a) {
        arr = new int[a];
        arr[0] = 0;
        arr[1] = 1;
        for (i = 2; i < a; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public int[] arr6(int a) {
        arr = new int[a];
        for (i = 0; i < a; i++) {
            arr[i] = (i + 1) * (i + 1);
        }
        return arr;
    }

    public double[] arr7(double a, double b, double c) {

        var v = b * b - 4 * a * c;
        if (a == 0) {
            double[] arr = new double[1];
            arr[0] = (-c / b);
            return arr;
        } else if (v < 0) {
            return new double[]{};
        } else if (v == 0) {
            double[] arr = new double[1];
            arr[0] = (-b) / (2 * a);
            return arr;
        }
        double[] arr = new double[2];
        arr[0] = (-b + Math.sqrt(v)) / (2 * a);
        arr[1] = (-b - Math.sqrt(v)) / (2 * a);
        return arr;
    }

    public int[] arr8(int a) {
        int k = 1;
        arr = new int[a];
        for (i = 0; i < a; i++) {
            if ((i + k) % 3 == 0) {
                k = k + 1;
            }
            arr[i] = i + k;
        }
        return arr;
    }

    public int[] arr9(int a, int delta, int first) {
        arr = new int[a];
        for (i = 0; i < a; i++) {
            arr[i] = first + i * delta;
        }
        return arr;
    }

    public double[] arr10(int a, int first, double q) {
        double[] arr = new double[a];
        arr[0] = first;
        for (i = 1; i < a; i++) {
            arr[i] = arr[i - 1] / q;
        }
        return arr;
    }

    public int[] arr11(int x) {
        int c = 0;
        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        arr = new int[c];
        c = 0;
        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                arr[c] = i;
                c++;
            }
        }
        return arr;
    }

    public Integer[] arr12(int x) {
        int c;
        ArrayList<Integer> arr = new ArrayList<>();
        for (i = 2; i <= x; i++) {
            c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                arr.add(i);
            }
        }
        return arr.toArray(new Integer[0]);
    }

    public int[] arr13(int n) {
        arr = new int[2 * n - 1];
        for (i = 1; i < 2 * n; i++) {
            if (i > n) {
                arr[i - 1] = 2 * n - i;
            } else {
                arr[i - 1] = i;
            }
        }
        return arr;
    }

    public void arr14(int[] a) {
        for (i = 0; i < a.length; i++) {
            a[i] = -a[i];
        }
    }

    public boolean arr15(int[] a, int k) {
        for (i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return true;
            }
        }
        return false;
    }

    public boolean arr16(Integer[] a) {
        for (i = 0; i < a.length; i++) {
            if (a[i] == null) {
                return true;
            }
        }
        return false;
    }

    public int arr17(int[] a) {
        int c = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                c = c - 1;
            }
            if (a[i] % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}
