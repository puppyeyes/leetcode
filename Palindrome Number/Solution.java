public class Solution {
    public static boolean isPalindrome(int x) {
        int tmp=0;
        if(x<0||(x!=0&&x%10==0))
        {
            return false;
        }
        while(x>tmp)
        {
            tmp=tmp*10+x%10;
            x=x/10;
        }
        if(x==tmp|tmp/10==x)
        {return true;}
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(10));
    }
}
