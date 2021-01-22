package question;

public class Q9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0) {
            return false;
        }else {
            int tmp = 0;
            int x1=x;
            while (x >= 10) {
                tmp = tmp * 10 + x %10;
                x /= 10;
            }
            tmp = tmp * 10 + x;

            if (tmp==x1){
                return true;
            }else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-101));
    }
}
