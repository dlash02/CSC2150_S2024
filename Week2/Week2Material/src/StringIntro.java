public class StringIntro {
    public static void main(String[] args) {
        int age = 22;
        double pay = 10.99;
        boolean gotMilk = true;
        String myName = "George";
        char letter = 'k';
        String myName2 = new String("Mikekkkkkk");
        System.out.printf("Name:%s", myName2.toUpperCase());
        int ct = countCharactersInString( letter, myName2);
        System.out.printf("\n Found ct:%s in name:%s", ct, myName2);
        ct = countCharactersInString('a', "Dear Abby");
        System.out.printf("\n Found ct:%s in name:%s", ct, "Dear Abbey");

        String myString = "Banana";
        String revString = reverseString( myString );
        System.out.printf("\n The Reverse of %s is %s", myString, revString);

        String names = "Jack,Jennie,Jill,James,Jackson,Jack,Jim,Jack,jack,JACK";
        String[] splNames = names.split(",");
        for( int i=0; i<splNames.length; i++){
            System.out.printf("\n Name:%s is %s", i, splNames[i]);
        }
        String target = "Jack";
        int count = countOccuranceOfString( target, names );
        System.out.printf("\n The String:%s occurs %s in %s", target, count, names);
    }

    private static int countOccuranceOfString(String target, String names) {
        int ct = 0;
        String[] splNames = names.split(",");
        for( String tok : splNames){
//            if ( target == tok )
            if ( target.toUpperCase().equals(tok.toUpperCase())){
                ct++;
            }
        }
        return ct;
    }

    private static String reverseString(String myString) {
        String revStr = "";
        for( int i=myString.length()-1; i>=0; i-- ) {
                revStr += myString.charAt(i);
        }
            return revStr;
    }

    private static int countCharactersInString(char letter, String myName2) {
        int ct = 0;
        for( int i=0; i<myName2.length(); i++ ){
            if ( myName2.charAt(i) ==  letter ){
                ct++;
            }
        }
        return ct;
    }
}
