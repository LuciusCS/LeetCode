package question;

public class Q35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;

        if (target<nums[0]){
            return 0;
        }
        if (target>nums[length-1]){
            return length;
        }

        //使用折半查找
        int first=0;
        int last=length-1;

        int medium=last/2;

        while (first<last){
            if (nums[medium]==target){
                break;
            }else if (nums[medium]<target){
                first=medium+1;
                medium=(first+last)/2;
            }else {
                last=medium-1;
                medium=(first+last)/2;
            }
        }

        return medium;
    }




}
