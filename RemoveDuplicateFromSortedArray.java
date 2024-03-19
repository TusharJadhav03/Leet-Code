package LeetCode;

public class RemoveDuplicateFromSortedArray {


    public static void removeDuplicate(int nums[]){

        int j =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

            
        }
        System.out.println(nums[j]);
        System.out.println(j);
    }
    
    public static void main(String[] args) {
        
        int []nums = {1,2,2,3,4,4,4,5,5,6,7};
        removeDuplicate(nums);

    }
}
