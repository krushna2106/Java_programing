import java.util.Scanner;
class program62{

    public static void main(String A[]) {


        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();

        System.out.println("enter the frequenty");
        iValue = scanner.nextInt();

        iteration.display(iValue); //using the iValue  we are passing the parameter to the method
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
            System.out.println(iCnt +" jay ganesh"); //space is important before jay  it's add spacr between Icnt value and jay ganesh
                                                      // 1 jay ganesh like  if we don't give it represent 1jay ganesh

            System.out.println("------------------");
         }
    }
}
