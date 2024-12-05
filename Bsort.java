class Sorting{
    public void bubble(int a[])
    {
        int temp=0;
       int  n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(a[j-1]>a[j])
                {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
        
            }
        }
    }
}
public class Bsort{
    public static void main(String args[])
    {
        int a[]={3,7,4,5,1,6,9,2};
        
        System.out.println("befor sort");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(""+a[i]);
        }
        System.out.println("");

        Sorting obj=new Sorting();
        obj.bubble(a);
        System.out.println("after bubble sort");
        for(int i=0;i<a.length;i++)
        {
        System.out.print(""+a[i]);
        }
    }
}