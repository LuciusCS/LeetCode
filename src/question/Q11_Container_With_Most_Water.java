package question;

public class Q11_Container_With_Most_Water {

    /**
     * 效率太低
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {

        int heightLength = height.length;
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < heightLength - 1; i++) {
            for (int j = i + 1; j < heightLength; j++) {
                tmp = height[i] > height[j] ? height[j] : height[i];
                tmp *= (j - i);
                max = max > tmp ? max : tmp;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.print(maxArea(height));
    }

}
