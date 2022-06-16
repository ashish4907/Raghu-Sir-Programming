import java.util.Scanner;
class Sum_Of_digits_In_Number_29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int num = input.nextInt();
        int sum = getSum(num);
        System.out.println("Sum of digits in " + num + " is " + sum);
    }
    public static int getSum(int n) {
        // int sum = 0;
        // while(n != 0){
        //     sum += n%10;
        //     n = n/10;
        // }

        // return sum;

        // if(n == 0)
        //     return 0;
        // else
        //     return n%10 + getSum(n/10);

        int sum = 0;
        for(sum=0; n>0; n=n/10){
            sum += n%10;
        }
        return sum;
    }
}