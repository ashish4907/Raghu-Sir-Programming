import java.util.Scanner;
class Smallest{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 4 integer values");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int min = a;
    if(b<min){
        min = b;
    }
    if(c<min){
        min = c;
    }
    if(d<min){
        min = d;
    }
    System.out.println("The smallest number is"+" "+min);

    }
}