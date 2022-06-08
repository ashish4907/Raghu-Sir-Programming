import java.util.Scanner;
class evenOdd_9{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integer value");
    int a = sc.nextInt();
    if(a%2==0){
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
    }

    }
}