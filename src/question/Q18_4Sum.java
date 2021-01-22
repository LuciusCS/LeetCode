package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_4Sum {


    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int length = nums.length;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int thirdIndex = 0;
        int forthIndex = 0;

        if (length < 4) {
            return new ArrayList<>();
        }
//        else if (length==1){
//            if (nums[0]==target){
//                List<Integer>tmp=new ArrayList<>();
//                tmp.add(nums[0]);
//                result.add(tmp);
//
//            }
//            return result;
//        }
        else {

            for (int i = 0; i < length - 3; i++) {
                first = nums[i];
                for (int j = i + 1; j < length - 2; j++) {
                    second = nums[j];
                    thirdIndex = j + 1;
                    forthIndex = length - 1;
                    while (thirdIndex < forthIndex) {
                        int sum = first + second + nums[thirdIndex] + nums[forthIndex] - target;
                        if (sum < 0) {
                            thirdIndex++;
                        } else if (sum > 0) {
                            forthIndex--;
                        } else {
                            List<Integer> tmp = new ArrayList<>();
                            tmp.add(first);
                            tmp.add(second);
                            tmp.add(nums[thirdIndex]);
                            tmp.add(nums[forthIndex]);
                            result.add(tmp);
                            thirdIndex++;
                            forthIndex--;
                        }
                    }
                }
            }
        }
        System.out.println(result);
        int resultTmp = result.size();
        for (int i = resultTmp - 1; i > 0; i--) {
            if (i > result.size() - 1) {
                continue;
            } else {
                List<Integer> tmp1 = result.get(i);
                for (int j = i - 1; j >= 0; j--) {
                    List<Integer> tmp2 = result.get(j);
                    if (tmp1.get(0).compareTo(tmp2.get(0)) == 0 &&
                            tmp1.get(1).compareTo(tmp2.get(1)) == 0 &&
                            tmp1.get(2).compareTo(tmp2.get(2)) == 0 &&
                            tmp1.get(3).compareTo(tmp2.get(3)) == 0
                    ) {
                        result.remove(j);
                    }
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = fourSum(new int[]{-497, -494, -484, -477, -453, -453, -444, -442, -428, -420, -401, -393, -392, -381, -357, -357, -327, -323, -306, -285, -284, -263, -262, -254, -243, -234, -208, -170, -166, -162, -158, -136, -133, -130, -119, -114, -101, -100, -86, -66, -65, -6, 1, 3, 4, 11, 69, 77, 78, 107, 108, 108, 121, 123, 136, 137, 151, 153, 155, 166, 170, 175, 179, 211, 230, 251, 255, 266, 288, 306, 308, 310, 314, 321, 322, 331, 333, 334, 347, 349, 356, 357, 360, 361, 361, 367, 375, 378, 387, 387, 408, 414, 421, 435, 439, 440, 441, 470, 492}, 1682);

        System.out.println(result);
    }

}
