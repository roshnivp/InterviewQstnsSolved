package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 20/11/17.
 */
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if(n==0 || n==1) return result;

        for(int i=0; i<n ;i++){
            if(nums[Math.abs(nums[i])] >=0){
                nums[Math.abs(nums[i])] = - nums[Math.abs(nums[i])];
            }
            else{
                System.out.println(Math.abs(nums[i]));
                if(!result.contains(Math.abs(nums[i]))) result.add(Math.abs(nums[i]));
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        FindAllDuplicates duplicate = new FindAllDuplicates();
        int arr[] = {4, 2, 4, 9, 2, 3, 9};
        int arr_size = arr.length;
        duplicate.findDuplicates(arr);
    }


}
