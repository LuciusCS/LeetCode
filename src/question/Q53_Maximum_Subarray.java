package question;

public class Q53_Maximum_Subarray {

    public static int maxSubArray(int[] nums) {

        int index=nums.length;

        int max=Integer.MIN_VALUE;
        int tmp=0;

        if (nums.length==1){
            return nums[0];
        }

        for (int i=0;i<index;i++){
            if (tmp<0){
                tmp=0;
            }
            tmp+=nums[i];
            if (max<tmp){
                max=tmp;
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int nums[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        int nums1[]=new int[]{-2147483647};
        System.out.println(maxSubArray(nums1));
    }

}
