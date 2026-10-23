
// Approach 3;

import java.util.Scanner;
public class program39
{
   
    public static void main(String A[])
    {   
        Scanner scanner = null;
        Arithmatic arithmatic = null;
        
        int ivalue1 = 0, ivalue2 = 0,iresult = 0;
        
        scanner = new Scanner(System.in);

        System.out.println("Enter first Number:");
        ivalue1 = scanner.nextInt();

         System.out.println("Enter second Number:");
        ivalue2 = scanner.nextInt();

        arithmatic = new Arithmatic();

        
        

        iresult =arithmatic.Addition(ivalue1, ivalue2);  // call the method my name of class
        

        System.out.println("Addtion is :"+iresult);

    }
}
class Arithmatic{

 public  int Addition(int ino1,int ino2)
                         
        {
            int ians = 0;
            ians = ino1 +ino2;
            return  ians;
        }
}
// class should be at bottom

