package question;

public class Q29_Divide_Two_Integers {

    public static int divide(int dividend, int divisor) {

        //用于表示正负
        if (dividend == 0) {
            return 0;
        } else if (divisor == 1) {
            return dividend;
        } else if (divisor == -1) {
            if (dividend == -2147483648) {
                return 2147483647;
            } else {
                return 0 - dividend;
            }
        }else if (dividend == -2147483648&&divisor == -2147483648){
            return 1;
        }
        int result = 0;
        if (dividend > 0 && divisor < 0) {

            while (dividend >= 0) {
                dividend += divisor;
                result++;
            }
            result--;
            result = 0 - result;
        } else if (dividend < 0 && divisor > 0) {

            while (dividend <= 0) {
                dividend += divisor;
                result++;
            }
            result--;
            result = 0 - result;
        } else if (dividend > 0 && divisor > 0) {
            while (dividend >= 0) {
                dividend -= divisor;
                result++;
            }
            result--;

        } else {
            while (dividend <= 0) {
                dividend -= divisor;
                result++;
            }
            result--;
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(divide(7,-3));
//        System.out.println(divide(10,3));
//        System.out.println(divide(0,1));
//        System.out.println(divide(1,1));
//        System.out.println(divide(-10,5));
//        System.out.println(divide(-2147483648, -1));
//        System.out.println(divide(-2147483648, 1));
        System.out.println(divide(-2147483648, -2147483648));
    }
}
