
import java.util.Scanner;


public class basicFunctions{

    // Case 1
    public static void averageOfThree(int a,int b,int c){
        System.out.println("Average of "+a+","+b+" and "+c+" is: "+(a+b+c)/3);
    }

    // Case 2
    public static void oddSum(int n){

        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }

        System.out.println("Sum of odd no till : "+n+" is = "+sum);
    }

    // Case 4
    public static void powerOfN(int x, int n) {
        
        long result=1;
        for(int i=1;i<=n;i++){
            result= result*x;

        }
        System.out.println("power of x raied to n is : "+result);

    }

    // Case 5
    public static void GCD(int n1,int n2){

        int result = Math.min(n1, n2);
        do { 
            if (n1% result==0 && n2%result==0)
                break;
            result--;
        } while (result>0);

        System.out.println("GCD is : "+result);
    }

    public static void Fibonacci(int f){

        int start = 0;
        int nn2 = 1;

        for(int i = 1;i<=f;i++){
            System.out.println(start);
            int nn3 = start + nn2;
            start = nn2;
            nn2= nn3;

        }


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Which question u wannt to try enter no from 1 to 10.");
        int qCase = sc.nextInt();

        switch (qCase) {
            case 1 -> {
                // Q1 : Enter 3 numbers from the user & make a function to print their average.
                System.out.println("Enter no 1: ");
                int a= sc.nextInt();

                System.out.println("Enter no 2: ");
                int b= sc.nextInt();

                System.out.println("Enter no 3: ");
                int c= sc.nextInt();

                averageOfThree(a, b, c);
            }

            case 2 -> {
                // Q2 : Write a function to print the sum of all odd numbers from 1 to n.

                System.out.println("Enter one number to find the sum of all odd nos: ");
                int n= sc.nextInt();

                oddSum(n);
            }

            case 3 -> {

                // Q3 : Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

                String check;
                int posC = 0;
                int negC = 0;
                int zeroC = 0;

                do{
                    
                    System.out.print("Enter the no :");
                    int val = sc.nextInt();

                    if(val==0){
                        zeroC+=1;
                    }else if (val>0) {
                        posC+=1;
                    }else{
                        negC+=1;
                    }

                    System.out.println("Enter 's' to Continue entering the no, 'e' to get the nos   entered");
                    check= sc.next();

                }while("s".equals(check));

                System.out.println("Positive Counts: "+posC+" -Negative Counnts: "+negC+" -Zero Counts: "+zeroC);

            }

            case 4 -> {

                // Q4 : Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

                System.out.println("Enter the no x: ");
                int x= sc.nextInt();

                System.out.println("Enter the no n: ");
                int n= sc.nextInt();

                powerOfN(x,n);


            }

            case 5 -> {

                // Q5 : Write a function that calculates the Greatest Common Divisor of 2 numbers. 

                System.out.println("Enter no 1 : ");
                int n1 = sc.nextInt();

                System.out.println("Enter no 2 : ");
                int n2 = sc.nextInt();

                GCD(n1, n2);

            }

            case 6 -> {

                // Q6 : Write a program to print Fibonacci series of n terms where n is input by user 

                System.out.println("Enter the no for Fibonacci: ");
                int fn = sc.nextInt();

                Fibonacci(fn);

            }

            default -> throw new AssertionError();
        }
        




    }





}




