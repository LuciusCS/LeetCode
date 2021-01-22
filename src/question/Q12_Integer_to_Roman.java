package question;

public class Q12_Integer_to_Roman {

    public static String intToRoman(int num) {

        StringBuilder stringBuilder = new StringBuilder();

        while (num > 0) {

            if (num - 1000 >= 0) {
                num-=1000;
                stringBuilder.append("M");
            } else if (num - 900 >= 0) {
                num-=900;
                stringBuilder.append("CM");

            } else if (num - 500 >= 0) {
                num-=500;
                stringBuilder.append("D");
            } else if (num - 400 >= 0) {
                num-=400;
                stringBuilder.append("CD");
            } else if (num - 100 >= 0) {
                num-=100;
                stringBuilder.append("C");
            } else if (num - 90 >= 0) {
                num-=90;
                stringBuilder.append("XC");
            } else if (num - 50 >= 0) {
                num-=50;
                stringBuilder.append("L");
            } else if (num - 40 >= 0) {
                num-=40;
                stringBuilder.append("XL");
            } else if (num - 10 >= 0) {
                num-=10;
                stringBuilder.append("X");
            }else if (num - 9 >= 0) {
                num-=9;
                stringBuilder.append("IX");
            }else if (num - 5 >= 0) {
                num-=5;
                stringBuilder.append("V");
            }else if (num - 4 >= 0) {
                num-=4;
                stringBuilder.append("IV");
            }else if (num - 1 >= 0) {
                num-=1;
                stringBuilder.append("I");
            }


        }


        return stringBuilder.toString();

    }

    public static void main(String[] args) {

    }
}
