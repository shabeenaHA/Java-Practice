public class Sdigit{
    public static void main(String args[]){
        int[] n={1,6,5,2,4};                         //o/p should be 8
        int temp=0;
        System.out.println("sum of digits");
        for(int i=0;i<5;i++)
        {
           temp=n[i]+temp;
           
        }
         System.out.println(" "+temp);
    }                                                     //45678
                                                          //mod 10 get last digit and sum of those digits
}