import java.util.Scanner;
class Special_18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int d1= num/10;
        int d2= num%10;

        String special = (d1+d2+d1*d2 == num) ? "Special" : "Not Special";
        System.out.println(special);
    }
}