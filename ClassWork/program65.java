import java.util.Scanner;
class program65{

    public static void main(String A[]) {


        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();

        System.out.println("enter the frequenty");
        iValue = scanner.nextInt();

        iteration.display(iValue);
            
    }

}

class Iteration
{


    public void display(int iNo)

    {
       int iCnt = 0;
        //input updater
        
         // iterate the loop backword
         for(iCnt = iNo; iCnt>=1; iCnt--)  // here we reverse the loop
         {
             System.out.println("------------------");  //line is static  bc line is fixes
            System.out.println(iCnt +" jay ganesh"); //space is important before jay 

            System.out.println("------------------");
         }
    }
}
