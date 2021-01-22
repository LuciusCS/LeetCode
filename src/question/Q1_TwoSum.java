package question;

public class Q1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[]result={0,0};
        int index=nums.length;
        for1:
        for (int i=0;i<index-1;i++){
            for (int j=i+1;j<index;j++){
                if (nums[i]+nums[j]==target){
                    System.out.println(i+","+j);
                    result[0]=i;
                    result[1]=j;

                   return result;
                }
            }
        }
        return result;
    };

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,target);


    }

}
