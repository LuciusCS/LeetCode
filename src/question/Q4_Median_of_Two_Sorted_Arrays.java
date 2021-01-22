package question;

public class Q4_Median_of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] num = new int[nums1.length + nums2.length];

        int num1Length = nums1.length;
        int num2Length = nums2.length;

        int num1Index = 0;
        int num2Index = 0;

        int numlength = num1Length + num2Length;

        for (int i = 0; i < numlength; i++) {
            //两个都没有越界
            if (num1Index < num1Length && num2Index < num2Length) {

                if (nums1[num1Index] < nums2[num2Index]) {

                    num[i]=nums1[num1Index++];
                } else {
                    num[i]=nums2[num2Index++];
                }
            }else if (num1Index >= num1Length) {
                //数组一越界
                num[i]=nums2[num2Index++];
            }else {
                //数组二越界
                num[i]=nums1[num1Index++];
            }
        }

        if (numlength==0){
            return (double)0;
        }

        if (numlength==1){
            return (double)num[0];
        }

        //偶数
        if (numlength%2==0){
            double tmp=num[numlength/2-1];
            double tmp1=num[numlength/2];
            return (tmp+tmp1)/2;
        }else {
            //奇数
            return (double)num[numlength/2];
        }

    }

    public static void main(String[] args) {
        int[] tmp1={1,2};
        int[] tmp2={3,4};
        double tmp3=findMedianSortedArrays(tmp1,tmp2);

        System.out.println(tmp3);

    }
}
