public class Sear
{
    public static void main(String args[])
    {
        int[] a={3,6,2,1,8,9};
        int key=8;
        int flag=0;
        int r=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
             flag=1;
             r=i;
             break;

            }
            else
            {
             flag=0;
            
             }
        }if(flag==1){
            System.out.println("element found " +r);
        
        }
        else
        {
            System.out.println("not found");
        }
    }
}