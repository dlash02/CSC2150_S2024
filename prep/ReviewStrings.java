import java.util.InputMismatchException;

public class ReviewStrings {
    public static void main(String[] args) {
        String myString = new String("BeanHead");
        String myString2 = "";
        myString2 = "BeandHead Part 2";
        final char tok = 'a';
        int ct = howManyOfThis( myString2, tok );
        System.out.printf("\n In s:%s ch%c appears:%s times", myString2,tok, ct );

        String tCruise = "Tom;Cruise;560;1962";
        int netWorth = getNetWorthFromString( tCruise );
        System.out.printf("\n The networth found:%s Million", netWorth );
        try {
                String tCruiseBroke = "Tom;Cruise;560applie;1962";
                int netWorth2 = getNetWorthFromString( tCruiseBroke );
                System.out.printf("\n The networth found:%s Million", netWorth2 );
        } catch (Exception e ) {
            System.out.printf("\n Something Broke msg:%s", e.getMessage() );
        }
    }

    private static int getNetWorthFromString(String strRec ) {
        String[] toks = strRec.split(";");
        int netWorth = 0;
        try {
            netWorth = Integer.parseInt(toks[2]);
        } catch(Exception e ) {
            throw new InputMismatchException("NetWorth not valid String Number");
        }
        return netWorth;

    }

    private static int howManyOfThis(String inString, char inChar ) {
        // Strings are collections of characters
        int ct = 0;
        for( int i=0; i<inString.length(); i++){
            if ( inString.toString().charAt(i) == Character.toUpperCase(inChar)){
                ct++;
            }
        }
        return ct;
    }
}
