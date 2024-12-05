class StrExam{                                          //define the variable type
    public void add(String str1,String str2){
        String res=str1+str2;
        System.out.println("result "+res);                //""it is just for print the value,+ is used for display res value
    }
    public void add(String str1,String str2,String str3){
        String res=str1+str2+str3;
        System.out.println("result "+res);
    }
    
}
public class ExampleOverloding{                       //if class nam is punlic then the class name should be same as file name 
    public static void main(String args[]){
        StrExam obj=new StrExam();                   //firt class name later object same = new classname()
        obj.add("s1","s2");
        obj.add("s1","s2","s3");                        //object followed method with parameters

    }
}


//class file name frist letter capital each word in file should be first letter capital followed by camelcase letter