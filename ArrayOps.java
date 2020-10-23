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
}