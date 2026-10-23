class program55 {

    public static void main(String A[]) {

        Iteration iteration = new Iteration();

        iteration.display();
    }
}

class Iteration
{


    public void display()
        // it's a static loop it will iterate 4 time when we iterate it
    {
       int iCnt = 0;
         for(iCnt = 1; iCnt<=4; iCnt++)
         {


            System.out.println("jay ganesh");
         }
    }
}
