public class Palidrome {
    public static void main(String[] args) {
        String s1 = "hangah";
        if ( checkPalin1( s1 )){
            System.out.printf("\n Yes Str:%s is a Palindrome", s1);
        } else {
            System.out.printf("\n NO! Str:%s is not Palindrome", s1);
        }
        if ( checkPalin2( s1 )){
            System.out.printf("\n Yes Str:%s is a Palindrome2", s1);
        } else {
            System.out.printf("\n NO! Str:%s is not Palindrome2", s1);
        }
    }

    private static boolean checkPalin2(String s1) {
        // Base cases
        if ( s1.length() <= 1){
            return true;
        } else if ( s1.charAt(0) != s1.charAt(s1.length()-1)) {
            return false;
        } else {
            return checkPalin2( s1.substring(1, s1.length()-1));
        }
    }

    private static boolean checkPalin1(String s1) {
        boolean isPalin = false;
        int checkPt = s1.length()-1;
        for( int i=0; i<s1.length(); i++){
            if( s1.charAt(i) != s1.charAt(checkPt)){
                return false;
            }
            checkPt -= 1;
        }
        return true;
    }
}
