import java.util.Scanner;
class Product_Of_Digit_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int product = productOfDigits(n);
        System.out.println(product);
    }
  public static int productOfDigits(int n){
      int product = 1;
      while(n>0){
          product *= n%10;
          n = n/10;
      }
      return product;
  }
}  