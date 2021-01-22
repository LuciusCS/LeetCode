package question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q22_Generate_Parentheses {

    public static List<String> generateParenthesis(int n) {

        if (n==1){
            List<String> tmp=new ArrayList();
            tmp.add("()");
            return tmp;
        }else {
            List<String> tmp=generateParenthesis(n-1);
            List<String>result=new ArrayList<>();
            int tmpIndex=tmp.size();
            for (int i=0;i<tmpIndex;i++){
                String tmpString=tmp.get(i);
                int tmpStringIndex=tmpString.length();
                for (int j=0;j<tmpStringIndex;j++){
                    for (int k=j;k<tmpStringIndex;k++){
                        StringBuilder tmpStringResult=new StringBuilder(tmpString);
                        tmpStringResult.insert(k,")");
                        tmpStringResult.insert(j,"(");
                        result.add(tmpStringResult.toString());
                    }
                }

            }

            //用于去重

            List<String>resultTmp=new ArrayList<>();
            Set<String>strings=new HashSet<>();
            for (int i=result.size()-1;i>=0;i--){
                if (strings.add(result.get(i))){
                    resultTmp.add(result.get(i));
                }
            }

            return resultTmp;
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
