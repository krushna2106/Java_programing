import java.util.Scanner;
class program59 {

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
        if(iNo<0) // here iNo is negative number 
        {
            iNo = -iNo; // here -iNo is negative and negative  negative get's pluse

            System.out.println("Invalid input");

             //  here we doj't write the return value 
        }
        
         for(iCnt = 1; iCnt<=iNo; iCnt++)//here we write the 6 instead of 4
         {


            System.out.println("jay ganesh");
         }
    }
}
