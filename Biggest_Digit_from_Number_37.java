import java.util.Scanner;
class Biggest_Digit_from_Number_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int max = biggestDigit(n);
        System.out.println(max);
    }
    public static int biggestDigit(int n){
        int max = 0;
       do{
        int r = n%10;
        if(r>max){
            max = r;
        }
        n=n/10;     
         }while(n!=0);
        return max;
       
    }
}