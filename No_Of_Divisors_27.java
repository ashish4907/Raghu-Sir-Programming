import java.util.Scanner;

class No_Of_Divisors_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int divisor = getDivisor(n);
        System.out.println("Number of divisors in " + n + " is " + divisor);
}

public static int getDivisor(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
        }
    }
    return count;
}

}