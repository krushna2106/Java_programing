import java.util.Scanner;

class program67 {

    public static void main(String A[]) {

        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();// here we pass the input to the class

        System.out.println("enter the frequenty");
        iValue = scanner.nextInt();

        iteration.display(iValue);
    }
}

class Iteration {

    public void display(int iNo)

    {
                           
        
        int iCnt = 0;         //default value

        iCnt = 1;              // initialize value

         do{

            System.out.println("------------------");  //line is static  bc line is fixes
            System.out.println(iCnt +" jay ganesh"); //space is important before jay 

            System.out.println("------------------");
            

                iCnt++;

         
         }while(iCnt<=iNo); // here we reverse the loop
         
            
            
         
    }
}
