package Com.ALGORITHM;

public class Lin {
    public static void main(RSString[] args) {
    int[] num = {1,2,3,4,5,6,7,8};
    int target = 4;
    int ans= Linear(num,target);
    System.out.println(ans);
    }

    static int Linear(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int ele = arr[index];
            if(ele==target){
                return index;
            }
        }
        return -1;
    }
    }



