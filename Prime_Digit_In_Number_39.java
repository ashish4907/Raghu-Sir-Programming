import java.util.Scanner;
class Prime_Digit_In_Number_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int primeDigit = primeDigit(n);
        System.out.println(primeDigit);

    }

   
    // public static int primeDigit(int n){
    //     int prime = 0;
    //     do{
    //         int r = n%10;
    //         if(isPrime(r)){
    //             prime = r;
    //         }
    //         n=n/10;     
    //          }while(n!=0);
    //     return prime;
        
    // }

    public static int primeDigit(int n){
        int count = 0;
        do{
            int r = n%10;
            if(isPrime(r)){
                count++;
            }
            n=n/10;     
             }while(n!=0);
        return count;

        }

    public static boolean isPrime(int n){
     for(int i=2;i<=n/2;i++){
         if(n%i==0)
             return false;
         }
     return true;
     }
    }

