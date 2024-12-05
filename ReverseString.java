public class ReverseString{
    public static void main(String args[])
    {
        String str="shabbu",nstr=" ";
        char ch;
        System.out.println("original word: "+str);
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("reverse the word: "+nstr);
    }
} 