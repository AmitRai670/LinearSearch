package Com.ALGORITHM;
import java.util.Arrays;
public class Linear2D {
    public static void main(String[] args) {
        int[][] arr={
                {12,21,12,31},
                {2,32,22,33,22},
                {77,88,99,100,77},
        };
        int target = 33;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col <arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
