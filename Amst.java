public class Amst{
    public static void main(String args[]){
        int num=407,sum=0;
        int n=num;
        while(n>0){
            int mod=n%10;
            int a=mod*mod*mod;
            sum=sum+a;
            n=n/10;
        }
        if(sum==num){
            System.out.println("amstrong numer");
        }else
        {
            System.out.println("not amstrong number");
        }
    }
}