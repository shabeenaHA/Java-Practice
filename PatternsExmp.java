//Star pattern programs {pyramid, invert pyramid, left and right sided pyramid}

class pattern1{

    //pyramid pattern                                           
    public void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
                }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    //inverted pyramid pattern
    public void invPyramid(int n){
        int space=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
            space++;
        }
    }

    //Left sided Pyramid
    public void leftPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    //inverted left sided pyramid triangle
    public void invLeftPyramid(int n){
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    //Right sided pyramid
    public void rightPyramid(int n){
        int space=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            space--;
        System.out.print("\n");
        }
    }

    //Inverted Right sided pyramid
    public void invRightPyramid(int n){
        int space=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            space++;
            System.out.print("\n");
        }
    }


    //pattern to print
    //1 2 3 4 5
    //2 3 4 5 1
    //3 4 5 1 2
    //4 5 1 2 3
    //5 1 2 3 4 
    public void modulusPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=j+i;
                int result=temp%n;
                System.out.print(" "+(result+1));
            }
            System.out.println();
        }
    }

    //pattern to print
    //1
    //1 2 
    //1 2 3
    //1 2 3 4
    public void jNumPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }

    //to print pattern
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    public void incrementPattern(int n){
        int inc=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(inc +" ");
                inc++;
            }
            System.out.println();
        }
    }

    //Alphabet triangle 
    public void alphabetPyramid(int n){
        int letter=65,space=n;//ASCII for A=65
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(letter==91){
                    letter=65;
                }
                System.out.print((char)letter + " ");
                letter++;
            }
            space--;
            System.out.println();
        }
    }
}


public class PatternsExmp{
    public static void main(String args[]){

        pattern1 pt = new pattern1();

        System.out.println("Pyramid pattern : ");
        pt.pyramid(8);
        System.out.println("\nInverted Pyramid pattern : ");
        pt.invPyramid(8);
        System.out.println("\nLeft sided pattern : ");
        pt.leftPyramid(8);
        System.out.println("\nInverted left sided pattern : ");
        pt.invLeftPyramid(8);
        System.out.println("\nRight sided pattern :");
        pt.rightPyramid(8);
        System.out.println("\nInverted Right sided pattern :");
        pt.invRightPyramid(8);
        System.out.println("\nModulus of 8 pattern :");
        pt.modulusPattern(8);
        System.out.println("\nto print j number pattern :");
        pt.jNumPattern(8);
        System.out.println("\n to print increment numbers in pattern :");
        pt.incrementPattern(8);
        System.out.println("\n Alphabet Pyramid :");
        pt.alphabetPyramid(10);
    }
}