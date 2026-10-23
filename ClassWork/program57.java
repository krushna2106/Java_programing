import java.util.Scanner;
class program57 {

    public static void main(String A[]) {


        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();// here we pass the input to the class

        System.out.println("enter the frequenty");
        iValue = scanner.nextInt(); //here we take the input from the user and store it in iValue

        iteration.display(iValue);
    }
}

class Iteration
{


    public void display(int iNo)

    {
       int iCnt = 0;


        
         for(iCnt = 1; iCnt<=iNo; iCnt++)//here we write the 6 instead of 4
         {


            System.out.println("jay ganesh");
         }
    }
}
