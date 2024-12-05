class Exam{
    int id;
    String bname;

    public Exam(int id,String bname){           //constructor
        this.id=id;
        this.bname= bname;
    } 
    public void search(int id){
        System.out.println("book found");
    }
    public void search(String bname,int id){
        System.out.println("book found...........");
    }
}
public class Example{
    public static void main(String args[]){
        Exam ex= new Exam(101,"java");
        ex.search(101);//book found
        ex.search("java",101);//book found........


    }
}