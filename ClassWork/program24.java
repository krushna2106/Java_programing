
import java.util.Scanner;
public class program24 {
    
    public static void main(String A[])
    {   
        Scanner scanner = null;
        String sName = null;

         scanner =  new Scanner(System.in); // input from keyboard
        System.out.println("Enter your name");
         sName = scanner.next(); // string line() function only take the first word from the input
        
        System.out.println("Welcome" + sName);



    }
}
