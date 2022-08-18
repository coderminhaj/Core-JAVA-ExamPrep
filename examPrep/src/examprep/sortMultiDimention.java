package examprep;

import java.util.Arrays;

public class sortMultiDimention {

    public static void main(String[] args) {
        int[][] arr = {{10, 14, 4, 8}, {24, 26, 64, 94}};

        System.out.println(arr.length);
        System.out.println(arr[0][0]);

        for (int m = 0; m < arr.length; m++) {
            for (int i = 0; i < arr[i].length; i++) {
                for (int j = i + 1; j < arr[j].length; j++) {
                    int tmp = 0;
                    if (arr[m][i] > arr[m][j]) {
                        tmp = arr[m][i];
                        arr[m][i] = arr[m][j];
                        arr[m][j] = tmp;

                    }

                }
            }
        }
        

    }

}
