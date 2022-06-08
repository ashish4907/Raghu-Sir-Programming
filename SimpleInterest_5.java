import java.util.Scanner;
class SimpleInterest_5{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the principal amount");
Double p = sc.nextDouble();
System.out.println("Enter the rate of interest in percent");
Double r = sc.nextDouble();
System.out.println("Enter the time period in years");
int t = sc.nextInt();
double SI = (p*r*t)/100;

System.out.println("The simple interest is "+SI);
}

}
