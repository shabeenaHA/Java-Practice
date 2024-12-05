public class Fibo{
    public static void main(String args[]){
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(" "+n1+" "+n2);
        for(i=2;i<count;i++){      //because already 2 numbers printed 0,1 so start from 2
            n3=n1+n2;               //adding 2 numbers 0+1=1   then print 1 after than change the number n2 value should be n1
           //means 1 to n1 and n3 means 1 to n2 then n3=2
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;

        }
    }
}