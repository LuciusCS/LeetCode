package question;

public class Q7_ReverseInteger {
    public static int reverse(int x) {
        double tmp = 0;
        if (x == 0) {
            return 0;
        } else if (x < 0) {
            x = -x;
            while (x >= 10) {
                tmp = tmp * 10 + x % 10;
                x /= 10;
            }
            tmp = tmp * 10 + x;
            tmp = -tmp;
        } else {
            while (x >= 10) {
                tmp = tmp * 10 + x %10;
                x /= 10;
            }
            tmp = tmp * 10 + x;
        }

        if (tmp>Integer.MAX_VALUE||tmp<Integer.MIN_VALUE){
            tmp=0;
        }
        return (int)tmp;
    }

    public static void main(String[] args) {

        System.out.println(reverse(
                1534236469));

    }
}
