import java.util.Scanner;
class Biggest_CO_16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        System.out.println("The biggest number is: " + max);
    }
}