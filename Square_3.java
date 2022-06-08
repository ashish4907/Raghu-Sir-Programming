import java.util.Scanner;
class Square_3{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side");
    Double s = sc.nextDouble();
    System.out.println("Area of the square"+" "+s*s);
     System.out.println("Perimeter of the square"+" "+4*s);

}
}