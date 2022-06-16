import java.util.Scanner;
class No_Of_Digit_26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = getCount(n);
        System.out.println("Number of digits in "+n+" is "+count);
    }

    public static int getCount(int n){
        // int count = 0;
        // while(n != 0){
        //     n = n/10;
        //     count++;
        // }
        // return count;
    // if(n == 0)
    //     return 0;
    // else
    //     return 1 + getCount(n/10);
    int count = 0;
    for(count = 0; n>0; n=n/10){
    count++;
    }
    return count;
}
}