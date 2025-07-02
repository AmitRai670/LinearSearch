package Com.ALGORITHM;
import java.util.Arrays;
public class maximum {
    public static void main(String[] args) {
        int[] arr ={11,223,234,3546,565,456,4,556,4554,3365676,57875,467474,34};

        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
