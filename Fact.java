public class Fact{
    public static void main(String args[]){
        int n1=4,i,fact=1;
        if (n1<=1)                                        //in fact dont take zero value
        System.out.println("enter positive number");
        else
        for(i=1;i<=n1;i++){
          fact=i*fact;
        }
        System.out.println("fact"+" "+fact);

    }
}