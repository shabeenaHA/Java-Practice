public class Cvow{
    public static void main(String arrgs[]){
        String str="shabeenauoi";
        int volwels=0;
        int consonents=0;
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        switch(ch){
            case 'a','e','i','o','u':volwels++;
            break;
            default:consonents++;
        }
        }System.out.println(volwels);
         System.out.println(consonents);
    }

}