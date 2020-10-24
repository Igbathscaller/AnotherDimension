public class ArrayOps{
    public static int sum(int[] arr){
        int a = 0;
        for(int i = 0; i< arr.length; i++){
            a++;
        }
        return a;   
        }
    public static int largest(int[] arr){
        int big=arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]>big){
                big=arr[i];
            }
        }
        return big;
    }
    public static int[] sumRows(int[][] matrix){
        int[] output = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            output[i]=sum(matrix[i]);
        }
        return output;
    }

    public static int[] largestInRows(int[][] matrix){
        int[] output = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            output[i]=largest(matrix[i]);
        }
        return output;
    }

    public static int sum(int[][] arr){
        return sum(sumRows(arr));
    }

    public static int[] sumCols(int[][] matrix){
        int col = matrix[0].length;
        int[]output = new int[col];
        int sum;
        for(int c =0; c<col; c++){
            sum = 0;
            for(int r=0; r<matrix.length; r++){
                sum+=matrix[r][c];
            }
            output[c] = sum;
        }
        return output;
    }

    public static boolean isRowMagic(int[][] matrix){
        int[] a = sumRows(matrix);
        return largest(a)*a.length==sum(matrix);
    }

    public static boolean isColMagic(int[][] matrix){
        int[] a = sumRows(matrix);
        return largest(a)*a.length==sum(matrix);
    }

    public static boolean isLocationMagic(int[][] matrix, int row, int col){
        return sum(matrix[row])== sumCols(matrix)[col];
    }
}