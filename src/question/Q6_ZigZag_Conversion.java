package question;

public class Q6_ZigZag_Conversion {

    public static String convert(String s, int numRows) {

        if (numRows==1){
            return s;
        }


        int length = s.length();

        //用于表示二维数组的长度
        int arrayLength = (length / (numRows + numRows - 1) + 1) * numRows;

        char[][] tmpArray = new char[arrayLength][numRows];
        int index = 0;
        //二维数组横向移动
        for1:
        for (int i = 0; i < arrayLength; i++) {
            if (i % (numRows - 1) == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (index>=length){
                        break for1;
                    }
                    tmpArray[i][j] = s.charAt(index++);
                }
            } else {
                if (index>=length){
                    break for1;
                }
                tmpArray[i][numRows - i % (numRows - 1)-1] = s.charAt(index++);

            }
        }


        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<numRows;i++){
            for (int j=0;j<arrayLength;j++){
                if (tmpArray[j][i]!=0) {
                    stringBuilder.append(tmpArray[j][i]);
                }
            }
        }


        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String info=(convert("PAYPALISHIRING",4));
        System.out.print(info);
    }
}
