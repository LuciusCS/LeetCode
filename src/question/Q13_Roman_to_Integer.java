package question;

public class Q13_Roman_to_Integer {
    public static int romanToInt(String s) {

        int result = 0;
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            char tmp = s.charAt(i);
            switch (tmp) {
                case 'I':
                    //判断是不是最后一个
                    if (i == length - 1) {
                        //不做处理
                        result += 1;
                    }
//                    else if (i<=length-2){
                    else if (s.charAt(i + 1) == 'V' ||s.charAt(i + 1) == 'X') {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i == length - 1) {
                        //不做处理
                        result += 10;
                    }
//                    else if (i<=length-2){
                    else if (s.charAt(i + 1) == 'L' ||s.charAt(i + 1) == 'C') {
                        result -= 10;
                    } else {
                        result += 10;
                    }

                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i == length - 1) {
                        //不做处理
                        result += 100;
                    }
//                    else if (i<=length-2){
                    else if (s.charAt(i + 1) == 'D' ||s.charAt(i + 1) == 'M') {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }


        return result;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt( "IV"));
        System.out.println(romanToInt( "IX"));
        System.out.println(romanToInt( "LVIII"));
        System.out.println(romanToInt( "MCMXCIV"));
        System.out.println(romanToInt( "MCDLXXVI"));
    }


}
