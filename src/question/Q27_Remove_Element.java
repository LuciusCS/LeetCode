package question;

import java.util.Arrays;

public class Q27_Remove_Element {
    public int removeElement(int[] nums, int val) {

        int length=nums.length;
        int resultIndex=0;


        if (length==0){
            return 0;
        }

        for (int i=0;i<length;i++) {
            if (nums[i]!=val){
                nums[resultIndex++]=nums[i];
            }


        }
        return resultIndex;
    }

    public static void main(String[] args) {

    }
}
