import java.util.Scanner;
class Smallest_Method_22{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 double values: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double min = smallest(num1, num2, num3);
        System.out.println("The smallest number is: " + min);
    }
    public static double smallest(double num1, double num2, double num3){
        double min = (num1 < num2) ? num1 : num2;
        min = (min < num3) ? min : num3;
        return min;
    }
}