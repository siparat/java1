import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        final int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        final int b = sc.nextInt();

        final int gcd = findGCD(a, b);
        final int lcm = (a * b) / gcd;

        System.out.println("НОД = " + gcd);
        System.out.println("НОК = " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
