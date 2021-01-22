package question;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Q17_Letter_Combinations_of_a_Phone_Number {

    public static List<String> letterCombinations(String digits) {


        char digitsArray[][] = {{}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}
                , {'j', 'k', 'l'}
                , {'m', 'n', 'o'}
                , {'p', 'q', 'r', 's'}
                , {'t', 'u', 'v'}
                , {'w', 'x', 'y', 'z'}};

        //用于表示总数
        int sum = 1;
        int length = digits.length();
        for (int i = 0; i < length; i++) {
            switch (digits.charAt(i)) {
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '8':
                    sum *= 3;
                    break;
                case '7':
                case '9':
                    sum *= 4;
                    break;
            }
        }

        StringBuilder[] result = new StringBuilder[sum];
        for (int i=0;i<sum;i++){
            result[i]=new StringBuilder();
        }
        for (int i = 0; i < length; i++) {
            int lengthTmp = digits.charAt(i) - 48;
            switch (lengthTmp) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                    for (int j = 0; j < result.length-2; j+=3) {
                        result[j].append((digitsArray[lengthTmp - 1][0]));
                        result[j+1].append((digitsArray[lengthTmp - 1][1]));
                        result[j+2].append((digitsArray[lengthTmp - 1][2]));
                    }
                    break;
                case 7:
                case 9:
                    for (int j = 0; j < result.length - 3; j+=4) {
                        result[j].append((digitsArray[lengthTmp - 1][0]));
                        result[j + 1].append((digitsArray[lengthTmp - 1][1]));
                        result[j + 2].append((digitsArray[lengthTmp - 1][2]));
                        result[j + 3].append((digitsArray[lengthTmp - 1][3]));
                    }
                    break;
            }
        }

        List<String> resultString = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            resultString.add(result[i].toString());
        }

        return resultString;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.print(letterCombinations("2"));
        System.out.print(letterCombinations(""));
    }
}
