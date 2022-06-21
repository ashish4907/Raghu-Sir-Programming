import java.util.Scanner;
class Perfect_Number_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPerfect = isPerfect(n);
        if(isPerfect)
            System.out.println(true);
        else
            System.out.println(false);
    }
public static boolean isPerfect(int n){
    int sum = 0;
    for(int i = 1; i<n; i++){
        if(n%i == 0)
            sum += i;
    }
    if(sum == n)
        return true;
    else
        return false;
}


}