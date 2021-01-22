package question;

public class Q5_Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {

        if (s.length()==1){
            return s;
        }

        if (s.length()==2){
            if (s.charAt(0)==s.charAt(1)){
                return s;
            }else {
                return String.valueOf(s.charAt(0));
            }
        }

        String result="";
        StringBuilder resultTmp=new StringBuilder();
        int length=s.length();
        for (int i=0;i<length;i++){
            resultTmp.setLength(0);
            char center=s.charAt(i);
            resultTmp.append(center);
            for (int j=1;i+j<length&&i-j>=0;j++){
                if (s.charAt(i+j)==s.charAt(i-j)){
                    resultTmp.insert(0,s.charAt(i+j));
                    resultTmp.append(s.charAt(i-j));
                }else {
                    break;
                }
            }

            if (result.length()<resultTmp.length()){
                result=resultTmp.toString();
            }
        }

        for (int i=1;i<length;i++){
            resultTmp.setLength(0);
            for (int j=1;i+j-1<length&&i-j>=0;j++){
                if (s.charAt(i+j-1)==s.charAt(i-j)){
                    resultTmp.insert(0,s.charAt(i+j-1));
                    resultTmp.append(s.charAt(i-j));
                }else {
                    //判断两个相连的是否相同
                    break;
                }
            }

            if (result.length()<resultTmp.length()){
                result=resultTmp.toString();
            }
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cccc"));
    }
}
