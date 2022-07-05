import java.util.Scanner;
class All_ArmStrong_41{
    static int countDigits(int n){
    int count=0;
    do{
        count++;
        n=n/10;}
        while(n!=0);
    return count;
}

static int pow(int n, int p){
    int prod=1;
    for(int i=0;i<p;i++){
        prod=prod*n;
    }
    return prod;
}

static boolean isArmStrong(int n){
    int temp = n;
    int sum = 0;
   int dc = countDigits(n);
   do{
    int r = n%10;
    sum= sum + pow(r,dc);
    n=n/10;
   }
   while(n!=0);
    return sum==temp;
   }

static int printArmStrong(int n){
for(int i=10;i<=n;i++){

boolean rs = isArmStrong(i);
if(rs)
System.out.println(i);
}
return 0;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int printArmStrong = printArmStrong(n);
        System.out.println(printArmStrong);
}
}