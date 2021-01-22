package question;

public class Q58_Length_of_Last_Word {

    public static int lengthOfLastWord(String s) {

        int length=s.length();
        boolean last=false;

        int wordLength=0;

        for (int i=length-1;i>=0;i--){
            if (!last&&s.charAt(i)!=' '){
                last=true;
                wordLength++;
                System.out.println("+++"+wordLength);
            } else if (last&&s.charAt(i)==' '){
                break;
            }else if (last&&s.charAt(i)!=' '){
                wordLength++;
                System.out.println("---"+wordLength);
            }
        }

        return wordLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord("Hello World "));
        System.out.println(lengthOfLastWord("Hello World"));
    }


}
