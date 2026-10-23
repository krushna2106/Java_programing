
import java.util.Scanner;
public class program23 {
    
    public static void main(String A[])
    {   
        Scanner scanner = null;
        String sName = null;

         scanner =  new Scanner(System.in); // inputn from keyboard
        System.out.println("Enter your name");
         sName = scanner.nextLine();  // name of object should be same as class nae
        
        System.out.println("Welcome " + sName);



    }
}
