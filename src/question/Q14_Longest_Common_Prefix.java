package question;

import java.util.List;

public class Q14_Longest_Common_Prefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length==0){
            return "";
        }

        String shortString=strs[0];
        int length=strs.length;
        for (int i=0;i<length;i++){
            if (shortString.length()>strs[i].length()){
                shortString=strs[i];
            }
        }

        System.out.println(shortString);

        int index=shortString.length();

        for (int i=0;i<index;i++){
            for (int j=0;j<length;j++){
                if (shortString.charAt(i)!=strs[j].charAt(i)){
                    index=i;
                    break;
                }
            }
        }

        return shortString.substring(0,index);
    }


    public static void main(String[] args) {

        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};
        String[] strs4= {"ab","a"};
//        System.out.println(longestCommonPrefix(strs1));
//        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs4));

    }
}
