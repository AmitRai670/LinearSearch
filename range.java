package Com.ALGORITHM;
import java.util.Scanner;
public class range {
    public static void main(String[] args){
        int[] arr= {12,3,43,34,3,45,45,32,2,4,545,66};
        int target = 43;
        System.out.println(rannge(arr,target,1,4));

    }

    static int rannge(int[] arr ,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }


        for(int i= start;i<=end;i++){
           int ele= arr[i];
           if(arr[i]==target){
               return i;
           }
        }
        return -1;
    }
}
