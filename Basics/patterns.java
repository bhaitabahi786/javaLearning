
public class patterns {

    public static void main(String args[]) {
        System.out.println("patterns ");
        // pattern 1 
        /* 
        *****
        *****
        *****
        *****
         */
        // code 
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* 

		 *    *

		 *   **

		 *  ***

		 * ****

         */
//		int m = 4;
//		int n = 4;
//		
//		for(int i=1;i<=m;i++){
//			
//			for(int j=n;j>=1;j--){
//				if(j<=i){
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//				
//			System.out.println();
//		}
        // Pattern 2

        /*

		 * 1

		 * 12

		 * 123

		 * 1234

		 * 12345

         */
//		int n=5;
//		for (int i=1;i<=n;i++){
//			
//			for(int j=1;j<=i;j++){
//				System.out.print(j);
//			}
//			System.out.println();
//			
//		}
        // Pattern 3

        /*

		* 12345

		* 1234

		* 123

		* 12

		* 1

         */
//		int n = 5;
//		
//		for(int i=n;i>=1;i--){
//			
//			for(int j=1;j<=i;j++){
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
        // Pattern 4

        /*

		* 1

		* 2 3

		* 4 5 6

		* 7 8 9 10

		* 11 12 13 14 15 

         */
//		int n=5;
//		int numCount = 1;
//		
//		for (int i=1;i<=n;i++){
//			
//			for(int j=1;j<=i;j++){
//				System.out.print(numCount+" ");
//				numCount++;
//			}
//			System.out.println();
//		}
        //Pattern 5

        /*

		 * 1

		 * 0 1

		 * 1 0 1

		 * 0 1 0 1

		 * 1 0 1 0 1

         */
//		int n=5;
//		
//		for(int i=1;i<=n;i++){
//			
//			for(int j=1;j<=i;j++){
//				if((i+j)%2==0 ){
//					System.out.print("1 ");
//				}else {
//					System.out.print("0 ");
//				}
//				
//			}
//			System.out.println();
//		}
        // Pattern 6

        /* 

		 *     *****

		 *    *****

		 *   *****

		 *  *****

		 * *****

         */
        int n = 5;

        int m = 9;

        for (int i = 1; i <= n; i++) {

            for (int j = 6; j <= m; j++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= 5; j++) {

                System.out.print("*");

            }

            m--;

            System.out.println();

        }

    }

}

