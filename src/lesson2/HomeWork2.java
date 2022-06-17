package lesson2;

import static jdk.nashorn.internal.objects.Global.print;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(method1(10, 5));
        method2(-2);
        method3(5);
        method4("pop", 5);
    }
    public static boolean method1(int a, int b) {
        int c = a + b;
        if (c > 10 && c <= 20) {
            return true;
        }
        return false;
    }
    public static void method2(int a) {
        if (a < 0) {
            System.out.println("отрицательное");
        } else {
            System.out.println("положительное");
        }
    }
    public static boolean method3(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void method4(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
}
