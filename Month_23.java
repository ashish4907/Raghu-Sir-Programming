import java.util.Scanner;
class Month_23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        int days = getDays(month);
        System.out.println("The month has " + days + " days.");
    }

        public static int getDays(int month){
           if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
               return 31;
           }
              else if(month == 4 || month == 6 || month == 9 || month == 11){
                return 30;
              }
              else if(month == 2){
                return 29;
              }
              else{
                return 0;
              }
        }
    }
