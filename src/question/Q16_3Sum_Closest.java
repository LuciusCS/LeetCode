package question;

import java.util.Arrays;

public class Q16_3Sum_Closest {

    /**
     * 题目理解错误，每一个都是最近的
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {

        int sum = 0;
        Arrays.sort(nums);

        int closet = Integer.MAX_VALUE;
        int length = nums.length;
        int targetIndex = 0;
        for (int i = 0; i < length; i++) {
            if (closet > Math.abs(nums[i] - target)) {
                closet = Math.abs(nums[i] - target);
                targetIndex = i;
            }
        }

        if (targetIndex == 0) {
            sum = nums[0] + nums[1] + nums[2];
        } else if (targetIndex == length - 1) {
            sum = nums[length - 1] + nums[length - 2] + nums[length - 3];
        } else {
            int i = 1;
            int j = 1;
            int number = 0;
            sum += nums[targetIndex];
            while (targetIndex - i >= 0 && targetIndex + j < length) {
                if (Math.abs(target - nums[targetIndex - i]) > Math.abs(target - nums[targetIndex + j])) {
                    sum += nums[targetIndex + j];
                    j++;
                    number++;
                } else {
                    sum += nums[targetIndex - i];
                    i++;
                    number++;
                }

                if (number == 2) {
                    break;
                }
            }

            if (number < 2) {
                if (!(target - i >= 0)) {
                   sum+= nums[targetIndex + j];
                }else {
                    sum+= nums[targetIndex - i];
                }
            }

        }


        return sum;
    }

    public static int threeSumClosest1(int[] nums, int target) {

        //使用MAC_VALUE注意溢出
        int sumResult=nums[0]+nums[1]+nums[2];
        int length=nums.length;
        int tmp=0;
        for (int i=0;i<length-2;i++){
            for (int j=i+1;j<length-1;j++){
                for (int k=j+1;k<length;k++){
                    tmp=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sumResult-target)>Math.abs(tmp-target)){
                        sumResult=tmp;
                    }
                }
            }
        }

        return sumResult;
    }

    public static void main(String[] args) {

        System.out.print(threeSumClosest1(new int[]{1,1,-1,-1,3},-1));

    }
}
