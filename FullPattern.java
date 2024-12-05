public class FullPattern{
    public static void main(String args[]){
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
            System.out.print("* ");               //remove ln for printing in * in the same line
            }
            System.out.println();                //for each itteration it takes new line to print
        }
        //left pyramid
        System.out.println("left pyramid");
         for(int i=0;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
            System.out.print("* ");               //remove ln for printing in * in the same line
            }
            System.out.println();                //for each itteration it takes new line to print
        }
        //
        System.out.println("printing triangle");
        int space=5;
         for(int i=0;i<=5;i++)
        {
            for(int k=0;k<space;k++)
            {
             System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
            System.out.print("* ");          
                 //remove ln for printing in * in the same line
            }
            System.out.println();
            space--;                //for each itteration it takes new line to print
        }
        //
        System.out.println("right side pyramid");
         int spa=5;
         for(int i=0;i<=5;i++)
        {
            for(int k=0;k<spa;k++)
            {
             System.out.print("  ");          //double space for rightside
            }
            for(int j=0;j<i;j++)
            {
            System.out.print("* ");          
                 //remove ln for printing in * in the same line
            }
            System.out.println();
            spa--;                //for each itteration it takes new line to print
        }
        // reverse pyramid
        System.out.println("reverse pyramid");
         for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
            System.out.print("* ");               //remove ln for printing in * in the same line
            }
            System.out.println();                //for each itteration it takes new line to print
        }
        // reverse ride pyramid
        int nspa=0;
         System.out.println("reverse right pyramid");
         for(int i=0;i<=5;i++)
        {
             for(int k=0;k<nspa;k++)
            {
             System.out.print("  ");          //double space for rightside
            }
            for(int j=0;j<=5-i;j++)
            {
            System.out.print("* ");               //remove ln for printing in * in the same line
            }
            System.out.println();
            nspa++;                //for each itteration it takes new line to print
        }
        //
         System.out.println("printing reverse triangle");
        int ss=0;
         for(int i=0;i<=5;i++)
        {
            for(int k=0;k<ss;k++)
            {
             System.out.print(" ");
            }
            for(int j=0;j<=5-i;j++)
            {
            System.out.print("* ");          
                 //remove ln for printing in * in the same line
            }
            System.out.println();
            ss++; 
        }

    }
}