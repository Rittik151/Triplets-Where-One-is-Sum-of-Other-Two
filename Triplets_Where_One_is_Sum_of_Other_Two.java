import java.util.*;

class Triplets_Where_One_is_Sum_of_Other_Two {
    public int countTriplet(int arr[]) {
        // code here
        int count=0,target=arr.length-1;
        Arrays.sort(arr);
        while(target>1){
            int low=0,high=target-1;
            if(target<arr.length-1&&arr[target]==arr[target+1]){
                target--;
                continue;
            }

            while(low<high){
                if(arr[low]+arr[high]==arr[target]){
                    int lval=arr[low];
                    int hval=arr[high];
                    while(low<high&&arr[low]==lval)
                    low++;
                    while(low<high&&arr[high]==hval)
                    high--;
                    count++;

                }
                else if(arr[low]+arr[high]>arr[target]){
                    high--;
                }else{
                    low++;
                }

            }

            target--;
        }
        return count;
    }
}