import java.util.Scanner;
class DoubleBiggest_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 double values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if( a > b && a > c){
            System.out.println("The biggest number is " + a);
        }
        else if( b > a && b > c){
            System.out.println("The biggest number is " + b);
        }
        else{
            System.out.println("The biggest number is " + c);
        }
    
    }
}