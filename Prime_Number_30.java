import java.util.Scanner;
class Prime_Number_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if(isPrime)
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i<=n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}

