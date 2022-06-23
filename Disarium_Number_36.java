import java.util.Scanner;
class Disarium_Number_36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        

        boolean disariumNumber = disariumNumber(n);
        if(disariumNumber){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
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

    public static boolean disariumNumber(int n){
        int sum =0;
        int temp = n;
        int dc = countDigits(n);
        do{
            int r = n%10;
            sum= sum + pow(r,dc);
            n=n/10;
            dc--;
        }while(n!=0);
        return sum==temp;
        }

}