import java.util.Scanner;
class Biggest{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 3 double values");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double max = a;
    if(b>max){
        max = b;
    }
    if(c>max){
        max = c;
    }
    System.out.println("The biggest number is"+" "+max);


    }
}