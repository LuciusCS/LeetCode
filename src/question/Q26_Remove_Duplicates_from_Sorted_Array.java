package question;

public class Q26_Remove_Duplicates_from_Sorted_Array {


    public static int removeDuplicates(int[] nums) {

        int length=nums.length;
        int resultIndex=1;

        if (length==0){
            return 0;
        }

        for (int i=1;i<length;i++){
           if (nums[resultIndex-1]!=nums[i]){
               nums[(++resultIndex)-1]=nums[i];
           }
        }

        for (int i=0;i<length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();
        return resultIndex;
    }

    public static void main(String[] args) {

        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));

    }
}
