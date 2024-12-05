public class Pri {    
    public static void main(String args[]) {    
        int i, m = 0, flag = 0;      
        int n = 10; // it is the number to be checked    
        
        m = n / 2; // Calculate half of the number n  //m=n/2=10/2=5          m=5
        if(n == 0 || n == 1) {                                  
            System.out.println(n + " is not a prime number");      
        } else {  
            for(i = 2; i <= m; i++) {                    //i=2,2<=5;2++
                if(n % i == 0) {                                     //10%2 =0
                    System.out.println(n + " is not a prime number");      
                    flag = 1;      
                    break;      
                }      
            }      
            if(flag == 0)  { 
                System.out.println(n + " is a prime number"); 
            }  
        }  
    }    
}   