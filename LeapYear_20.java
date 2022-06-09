import java.util.Scanner;
class LeapYear_20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year = sc.nextInt();


    String leap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "Leap" : "Not Leap";
    System.out.println("The year is leap: " + leap);
/*
    boolean isLeap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    System.out.println("The year is leap: " + isLeap);
*/
    }
}