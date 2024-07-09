package arrays;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase();
        newString.toLowerCase();
        char[] ch = newString.toCharArray();
        char[] newCh = new char[ch.length];
        int j = 0;
        for(int i = ch.length - 1; i >= 0 ; i--){
            newCh[j] = ch[i];
            j++;
        }

        String reverseString = new String(newCh);

        if(newString.equals(reverseString)){
            return true;
        }else{
            return false;
        }

    }

    public boolean isPalindromeUsingTwoPointer(String s) {
        if(s.isEmpty()){
            return true;
        }
        String newString = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase();
        int start = 0;
        int last = newString.length() - 1;
        while(start<=last){
            char curFirst = newString.charAt(start);
            char curLast = newString.charAt(last);
            if(curFirst != curLast){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));


    }
}
