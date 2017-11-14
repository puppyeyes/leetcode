public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        boolean endFlag=false;
        int shortestStringLength;
        if(strs.length>0)
        {
            shortestStringLength=strs[0].length();
        }
        else {shortestStringLength=0;}
        for (String str:strs) {
            if(str.length()<shortestStringLength)
            {
                shortestStringLength=str.length();
            }
        }
        for (int i = 0; i <shortestStringLength ; i++) {
            Character commonC=strs[0].charAt(i);
            for (String str:strs) {
                Character c=str.charAt(i);
                if (!commonC.equals(c))
                {
                    endFlag=true;
                    break;
                }
            }
            if(endFlag)
            {
                break;
            }
            else{
                result=result+commonC;
            }

        }
        return result;
    }
    public static void main(String[] args) {

    }
}
