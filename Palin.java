public class Palin{
    public static void main(String args[]){
        String sa= "hello", flag="";
        for(int i=0;i<sa.length();i++){
            flag=sa.charAt(i)+flag;
        }
        if(flag.equals(sa)){
            System.out.println("is pallindrome " +flag);
        }
        else 
        {
            System.out.println("not a pallindrom "+flag);
        }

    }
}