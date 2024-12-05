class payment{
    public void psearch(int n1,String sname){             //parent class
        System.out.println(""+n1+" /"+sname);
    }
}                                                            //extends (e small)
class sempay extends payment{
    public void psearch(int n1,String sname){
        System.out.println("child class " +n1+"/"+sname);
    }                                                            //child class
}
public class ExampleOverriding{
    public static void main(String args[]){
        payment obj1=new payment();
        obj1.psearch(10,"abc");
        obj1=new sempay();
        obj1.psearch(100,"shab");
        
    }                                                          //return type shoul be same
}