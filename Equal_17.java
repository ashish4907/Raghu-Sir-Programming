import java.util.Scanner;

class Equal_17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String equal = (num1 == num2) ? "True" : "False";
        System.out.println("The numbers are equal: " + equal);
    }
}