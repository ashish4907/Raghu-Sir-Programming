import java.util.Scanner;
class Special_Method_24 {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int num = input.nextInt();

        boolean isSpecial = isSpecial(num);
        if(isSpecial){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
   }

    public static boolean isSpecial(int num){
        int d1= num/10;
        int d2= num%10;

        return (d1+d2+d1*d2 == num);
   
}
}