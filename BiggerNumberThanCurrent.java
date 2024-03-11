package LeetCode;

import java.util.Arrays;

public class BiggerNumberThanCurrent {
    
    public static int[] biggerNumberThanCurrent(int[] nums){

        int n = nums.length;
        int []result = new int[n];

        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i]<nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
    public static void main(String[] args) {
        
        int nums[] = new int[]{8,1,2,2,3};
        int result[] = biggerNumberThanCurrent(nums);
        System.out.println(Arrays.toString(result));

    }
}
