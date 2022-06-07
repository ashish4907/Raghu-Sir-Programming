import java.util.Scanner;
class Rectangle{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length");
    Double l = sc.nextDouble();
    System.out.println("Enter the breadth");
    Double b = sc.nextDouble();
    System.out.println("Area of the rectangle"+" "+l*b);
     System.out.println("Perimeter of the rectangle"+" "+2*(l+b));

}
}