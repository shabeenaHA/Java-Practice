public class Frequency{
    public static void main(String args[]){
        String str="chotuuu";
        char ch='u';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            if(ch1==ch){
                count++;
            }
        }System.out.println(count);
    }
}