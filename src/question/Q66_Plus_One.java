package question;

public class Q66_Plus_One {
    public static  int[] plusOne(int[] digits) {

        int length=digits.length;

        int add=1;

        boolean addPosition=false;

        for (int i=length-1;i>=0;i--){
            if (digits[i]+add>=10){
                digits[i]+=add-10;
                if (i==0){
                    addPosition=true;
                }
            }else {
                digits[i]+=add;
                break;
            }
        }


        if (addPosition){
            int[] result=new int[digits.length+1];
            result[0]=1;
            System.arraycopy(digits,0,result,1,digits.length);
            return result;
        }


        return digits;
    }

    public static void main(String[] args) {
        int[] test={1,2,9,9};
        System.out.println(plusOne(test));

    }
}
