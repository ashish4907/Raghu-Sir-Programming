import java.util.Scanner;
class Digit_Number_12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int a = sc.nextInt();
    
        if( a > 9 ||  a > -9){
            System.out.println("The number is a digit");
        }
        else{
            System.out.println("The number is not a digit but a number");
        }
    }
}