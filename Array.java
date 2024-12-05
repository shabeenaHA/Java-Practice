public class Array{
    public static void main(String args[]){
        int[] arr={2,4,6,8,10};
        for(int i=0;i<5;i++)
        System.out.println(arr[i]);
        int a[][]={
            {1,2,3,4,5},
            {2,4,5,6,8},
            {4,9,8,8,4},
            {4,9,7,6,4},
        };
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++)
            {
                System.out.print(a[i][j]+" ");
            }System.out.println(" ");
        }
    }
}