import java.util.Scanner;
class Sum_Of_Square_Of_Digit_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = sumOfSquareOfDigits(n);
        System.out.println(sum);
    }
    public static int sumOfSquareOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}