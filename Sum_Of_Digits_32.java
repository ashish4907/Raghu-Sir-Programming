import java.util.Scanner;
class Sum_Of_Digits_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println(sum);
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;

        
    }
}   