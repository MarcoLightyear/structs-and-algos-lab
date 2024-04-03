package exercises;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int leftPointer = 0;
        int rightPointer = 0;
        while(leftPointer < s.length() && rightPointer < t.length()){
            if(s.charAt(leftPointer) == t.charAt(rightPointer)){
                leftPointer++;
                rightPointer++;
            }
            else
                rightPointer++;
        }
        if(leftPointer == s.length())
            return true;
        else
            return false;
    }
}
