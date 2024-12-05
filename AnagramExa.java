import java.util.Arrays;
public class AnagramExa{
    public static void main(String args[]){
        String str1="life",str2="file";
        char[] a=str1.toCharArray();
        Arrays.sort(a);
        char[] b=str2.toCharArray();
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("is amagram");
        }else{
            System.out.println("not anagram");
        }
    }
}