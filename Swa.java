public class Swa{
    public static void main(String args[]){
        int n1=5,n2=10,temp=0;
        System.out.println(" " +n1 + " " +n2);
        System.out.println("swap two numbers");
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(" n1=" +n1 + " n2=" +n2);
    }
}


//without using third variable
//n1=2,n2=4;
//n1=n1+n2;  //6
//n2=n1-n2;   //6-4=2
//n1=n1-n2;   //6-2=4
//n1=4,n2=2