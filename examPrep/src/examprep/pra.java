
package examprep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pra {
    
    public static void main(String[] args) {
        int [][] arr = {
                        {10,152,58,1},
                        {64,8,94,5,68,6744,254}
                        };
        int temp = 0;
        
        for (int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                for (int k = j + 1  ; k<arr[i].length ; k++){
                    if (arr[i][j]>arr[i][k]){
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }
        for (int m = 0; m<arr.length; m++){
            for (int n = 0; n<arr[m].length; n++){
                System.out.print(arr[m][n] + ", ");
            }System.out.println();
            
            
        }
        
        
    }
    
    
}
