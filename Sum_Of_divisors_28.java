import java.util.Scanner;
class Sum_Of_divisors_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println("Sum of divisors in " + n + " is " + sum);
    }
public static int getSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    return sum;
}

}