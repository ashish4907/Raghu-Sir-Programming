import java.util.Scanner;
class Armstrong_Number_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isArmstrong = isArmstrong(n);
        if(isArmstrong)
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static boolean isArmstrong(int n){

for(int i = 1; i<=n; i++){
    int sum = 0;
    int temp = i;
    while(temp>0){
        sum += Math.pow(temp%10, 3);
        temp = temp/10;
    }
    if(sum == n)

        return true;
}
return false;
    

        // int sum = 0;
        // int temp = n;
        // int count = 0;
        // while(temp>0){
        //     count++;
        //     temp = temp/10;
        // }
        // temp = n;
        // while(temp>0){
        //     int digit = temp%10;
        //     sum += digit*digit*digit;
        //     temp = temp/10;
        // }
        // if(sum == n)
        //     return true;
        // else
        //     return false;
    }
}