import java.util.Scanner;
class Smallest_Digit_from_Number_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int min = smallestDigit(n);
        System.out.println(min);
    }
    public static int smallestDigit(int n){
        int min = n;
        do{
            int r = n%10;
            if(r<min){
                min = r;
            }
            n=n/10;     
             }while(n!=0);
        return min;
        
       
    }
}