import java.util.Scanner;
class Palindrome_Number_40{
static boolean isPalindrome(int n){
    int temp = n;
    int rev = 0;
   do{
       int r = temp%10;
       rev = rev*10+r;
       temp=temp/10;
}
while(temp!=0);
if(rev==n){
    return true;
}
else{
    return false;
}
}
static int printPalindrome(int n){
for(int i=0;i<=n;i++){

boolean rs = isPalindrome(i);
if(rs)
System.out.println(i);
}
return 0;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int printPalindrome = printPalindrome(n);
        System.out.println(printPalindrome);
}
}
    

  




