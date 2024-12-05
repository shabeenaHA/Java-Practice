class Facto
{
    static int Facto(int n)
    {
        if ( n==0)
         return 1;
    return n*Facto(n-1);
    }

    public static void main(String args[])
    {
        int n=4;
        System.out.println("fact of :"+n +" is " +Facto(n));
    }
}