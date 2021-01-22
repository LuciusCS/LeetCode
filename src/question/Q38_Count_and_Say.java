package question;

public class Q38_Count_and_Say {

    public static String countAndSay(int n) {

        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        if (n != 1) {
            result = countAndSay(n - 1);
            int length = result.length();

            int num = 0;
            char tmp = result.charAt(0);

            for (int i = 0; i < length; i++) {
                if (tmp == result.charAt(i)) {
                    num++;
                } else {
                    stringBuilder.append(num);
                    stringBuilder.append(tmp);
                    num = 1;
                    tmp = result.charAt(i);
                }
            }
            stringBuilder.append(num);
            stringBuilder.append(tmp);
            result = stringBuilder.toString();
        } else {
            result = "1";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print(countAndSay(4));
    }

}
