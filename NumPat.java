 public class NumPat{
    public static void main(String args[]){
        System.out.println("left pyramid");
        int count=1;
         for(int i=0;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
            System.out.print(" "+count); 
            count++;              //remove ln for printing in * in the same line
            }
            System.out.println();                //for each itteration it takes new line to print
        } 
        System.out.println("left pyramid");
         for(int i=0;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
            System.out.print(" "+(j+1)); 
                                           //remove ln for printing in * in the same line
            }
            System.out.println();                //for each itteration it takes new line to print
        }
        //

    }
 }