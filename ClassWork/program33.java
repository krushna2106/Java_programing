// Approach 1;

import java.util.Scanner;
public class program33
{
    
    public static void main(String A[])
    {   
        Scanner scanner = null;
        
        int ivalue1 = 0, ivalue2 = 0,iresult = 0;
        
        scanner = new Scanner(System.in);

        System.out.println("Enter first Number:");
        ivalue1 = scanner.nextInt();

         System.out.println("Enter second Number:");
        ivalue2 = scanner.nextInt();

        iresult = ivalue1+ivalue2; // logic

        System.out.println("Addtion is :"+iresult);

    }
}
