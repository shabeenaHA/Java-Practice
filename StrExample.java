public class StrExample{
    public static void main(String args[]){
       String str1="chotuu",str2="cherry";
        System.out.println(" "+str1);
        System.out.println(" "+str2);
        String res = str1.concat(str2);
        System.out.println(" "+res);
        int count=str1.length();
        System.out.println(" "+count);
        char ch = str2.charAt(4);
        System.out.println(ch);
        int search= str1.indexOf('t');
        System.out.println(search);
        res=str2.toUpperCase();
        System.out.println(res);
        res=str2.toLowerCase();
        System.out.println(res);
        boolean bres=str1.equals(str2);
        System.out.println(bres);
        
    }
}