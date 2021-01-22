package question;

import java.util.HashMap;
import java.util.Map;

public class Q3_Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()){
            return 0;
        }

        Map<Character,Integer> characterMap=new HashMap();

        int start=0;
        int length=s.length();
        int max=0;
        for (int i=0;i<length;i++){
            char tmp=s.charAt(i);
            //已经在Map中存在过了
            if (null!=characterMap.get(tmp))
            {
                int indexTmp=characterMap.get(tmp);
                start=indexTmp+1>start?indexTmp+1:start;
            }
            characterMap.put(tmp,i);
            max=max>(i-start+1)?max:(i-start+1);
        }

        return max;
    }



    public static int lengthOfLongestSubstring1(String s) {

        char[] words = s.toCharArray();
        if (s.length() <= 1) {
            return s.length();
        }

        int max = 1;
        int start = 0;

        for (int end = 1; end < s.length(); end++) {
            for (int i = start; i < end; i++) {
                if (words[i] == words[end]) {
                    start = i + 1;
                    break;
                }
            }
            max = Math.max(max, end - start + 1);
        }

        return max;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring1("abcabcbbbbbbbbbbbbbbbbbbbbbbbbbbbasssddagrghbrdbyhrt5yjntrvfgy"));
    }
}
