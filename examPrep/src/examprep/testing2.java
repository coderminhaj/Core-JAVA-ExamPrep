
package examprep;


public class testing2 {
    
    
    static int arr[][] = 
              {
                { 10, 28, 72, 91 }, 
                { 27, 33, 40, 52 }, 
                { 69, 75, 73, 72 }, 
                { 46, 33, 31, 2 } 
              };
 // sort 2D array in descending order
   public static void sort2dArray() {
  
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
               for (int l = 0; l < n; l++) {
                  if (arr[i][j] > arr[k][l]) {
                     // swap
                     int temp = arr[i][j];
                     arr[i][j] = arr[k][l];
                     arr[k][l] = temp;
                  }
               }
            }
         }
      }
   }

   public static void display2dArray() {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static void main(String args[]) {
      

      System.out.println("2d Array: ");
      display2dArray();

      // sort the array
      sort2dArray();

      System.out.println("\nSorted 2d Array: ");
      display2dArray();
   }
}
