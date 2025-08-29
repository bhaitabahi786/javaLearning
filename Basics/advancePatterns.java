
public class advancePatterns {

    // Implemented methods for all patterns to print

    static void pattern1(){

        // Pattern 1

        /* 
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
         */

        int n= 4;
        for(int i=1;i<=n;i++){
            // part 1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int s= 2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            // Part 2
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int s= 2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern2(){

        // Pattern 2

        /*
            1 
           2 2 
          3 3 3 
         4 4 4 4 
        5 5 5 5 5
        */

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }

    static void pattern3(){

        // Pattern 3

        /*
            1
           212
          32123
         4321234
        543212345
        */

        int n=5;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }

    static void pattern4(){

        // Pattern 4

        /*
           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
        */

        int n= 4;

        for(int i=1;i<=n;i++){

            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=n;i>=1;i--){

            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }

    }


    public static void main(String[] args) {

        System.out.println("Printing pattern no 1");
        pattern1();

        System.out.println("Printing pattern no 2");
        pattern2();

        System.out.println("Printing pattern no 3");
        pattern3();

        System.out.println("Printing pattern no 4");
        pattern4();
        

    }

}
