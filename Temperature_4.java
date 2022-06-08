import java.util.Scanner;
class Temperature_4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("temperature in terms of celcius");
    double t = sc.nextDouble();
    System.out.println("temperature in terms of kelvin"+" "+(t+273.15));
     System.out.println("temperature in terms of fahrenheit"+" "+((t*9/5)+32));
      

    }
}
