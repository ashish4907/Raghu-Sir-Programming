import java.util.Scanner;
class Middle_19{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 integer numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)){
                        System.out.println(num2);}
        
        else if ((num1 < num3 && num3 < num2) || (num2 < num3 && num3 < num1)){
                        System.out.println(num3);}
        else{
            System.out.println(num1);}
        
/*
    if(num1>num2 && num1>num3
    {
        if(num2>num3)
        {
            System.out.println("Middle number is: " + num2);
        }
        else
        {
            System.out.println("Middle number is: " + num3);
        }
    }
    else if(num2>num1 && num2>num3)
    {
        if(num1>num3)
        {
            System.out.println("Middle number is: " + num1);
        }
        else
        {
            System.out.println("Middle number is: " + num3);
        }
    }
    else
    {
        if(num1>num2)
        {
            System.out.println("Middle number is: " + num1);
        }
        else
        {
            System.out.println("Middle number is: " + num2);
        }
    }*/
    
   }
    
}