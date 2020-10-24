import java.util.*;

public class Tester{
    public static void main(String[]args){
        int[][] A = {   {  1,  0, 12, -1 },
                        {  7, -2,  2,  1 },
                        { -5, -2,  2, -9 }
                                        };
        int[] B  =   {  1, 3, 5 };
        System.out.println( Arrays.toString(ArrayOps.sumRows(A)));
        System.out.println("expected output:[12, 8, -14]");
        System.out.println( Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println("expected out: [12, 7, 2]");
        System.out.println( ArrayOps.sum(B));
        System.out.println("expected output:9");
        System.out.println( ArrayOps.sum(A));   //this calls the overloaded 2d array version!
        System.out.println("expected output:6");
        A = new int[][]{ {  1,  2, 3, 4 }, {  2, 3,  4,  1 },{ 3, 4,  1, 2 } };  //this is rowMagic but NOT colMagic
            System.out.println(ArrayOps.isRowMagic(A));
            System.out.println(ArrayOps.isColMagic(A));
        A=  new int[][]{ {  1,  1, 1 },{  2, 2, 2 },{ 3,  3, 3 } };  //this is colMagic but NOT rowMagic
        System.out.println(ArrayOps.isRowMagic(A));
        System.out.println(ArrayOps.isColMagic(A));
        A=  new int[][]{  {  2,  2, 2 },{  2, 2, 2 } };  //this is both colMagic AND rowMagic
        System.out.println(ArrayOps.isRowMagic(A));
        System.out.println(ArrayOps.isColMagic(A));
    }
}