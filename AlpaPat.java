public class AlpaPat{
    public static void main(String args[]){
        int letter=65;
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=i;j++)
            {
            System.out.print((char)letter +" " );
            letter++; 
            if(letter==91)                          //if it reaches to Z then again check the condition for contuine from A
            letter=65;              
            }
            System.out.println();             
        }
    }
}