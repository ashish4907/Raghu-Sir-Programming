import java.util.Scanner;
class BreakUp_15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int a = sc.nextInt();

        if( a % 3 == 0 && a % 5 == 0){
            System.out.println("Sanju weds Geeta");
        }
        else if( a % 3 == 0){
            System.out.println("Sanju");
        }
        else if( a % 5 == 0){
            System.out.println("Geeta");
        }
        else{
            System.out.println("Breakup");
        }

    }
}