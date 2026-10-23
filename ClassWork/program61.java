import java.util.Scanner;
class program61 {

    public static void main(String A[]) {


        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();// here we pass the input to the class

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
        
        
         for(iCnt = 1; iCnt<=iNo; iCnt++)
         {
             System.out.println("------------------");  //line is static  bc line is fixes
            System.out.println(iCnt); // line us dyanamic bc  line will chages as per icunt values 

            System.out.println("------------------");
         }
    }
}
