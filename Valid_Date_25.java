import java.util.Scanner;
class Valid_Date_25{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the date: ");
    int day = sc.nextInt();
    System.out.println("Enter the month: ");
    int month = sc.nextInt();
    System.out.println("Enter the year: ");
    int year = sc.nextInt();

    String isValid = isValid(day, month, year);
    System.out.println(isValid);
}
public static String isValid(int day, int month, int year){
    if(day < 1 || day > 31 || month < 0 || month > 12 || year < 1){
        return "Invalid";
     }
        else if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            return "Invalid";
        }
        else if(month == 2 && day > 29){
            return "Invalid";
        }
        else if(!(year%4==0 && year%100!=0 || year%400==0) && month == 2 && day > 28){
            return "InValid";
        }
        else{
            return "Valid";
        }
    }

}