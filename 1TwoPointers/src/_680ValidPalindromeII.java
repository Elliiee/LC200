public class _680ValidPalindromeII {
    public boolean isPalindrome(String s){
        for (int i = 0, j = s.length() -1; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
/*
Given a non-empty string s, you may delete at most one character.
Judge whether you can make it a palindrome.
 */
