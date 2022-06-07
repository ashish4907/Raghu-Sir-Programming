import java.util.Scanner;
class Equal{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st number");
    int a = sc.nextInt();
    System.out.println("Enter the 2nd number");
    int b = sc.nextInt();

    if(a==b){
        System.out.println("The numbers are equal");
    }
    else{
        System.out.println("The numbers are not equal");
    }
}
}