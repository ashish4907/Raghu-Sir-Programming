import java.util.Scanner;
class Stick{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Length of the stick in cm");
    double l = sc.nextDouble();
    System.out.println("Length of the stick in inches"+" "+l/2.54);
     System.out.println("Length of the stick in feets"+" "+l/30.48);
      System.out.println("Length of the stick in metres"+" "+l/100);

    }
}