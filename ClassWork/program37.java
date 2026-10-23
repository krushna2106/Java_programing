// Approach 3;

import java.util.Scanner;
class Arithmatic{

 public static  int Addition(int ino1,int ino2)
                         
        {
            int ians = 0;
            ians = ino1 +ino2;
            return  ians;
        }
    

}




public class program37
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

        iresult =Arithmatic.Addition(ivalue1, ivalue2);  // call the method my name of class
        

        System.out.println("Addtion is :"+iresult);

    }
}
