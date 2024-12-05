class BinarySearch{
    int BinarySearch(int a[],int low,int high,int key)
    {
        if(low<=high)
        {
         int mid=(low+high)/2;
         if(a[mid]==key)
         return mid;
         if(key<mid)
          return BinarySearch(a,low,mid-1,key);
        return BinarySearch(a,mid+1,high,key);
        }return -1;
    }
    public static void main(String args[])
    {
        BinarySearch ob=new BinarySearch();
        int a[]={2,3,4,5,10};
        int n=a.length;
        int key=10;
        int result=ob.BinarySearch(a,0,n-1,key);
        if(result==-1)
        System.out.println("element is not found");
        else
        System.out.println("element found at index: " +result);
    }
}