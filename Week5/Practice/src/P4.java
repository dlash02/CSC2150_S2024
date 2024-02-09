import java.util.ArrayList;
import java.util.Arrays;

public class P4 {
    public static void main(String[] args) {
        ArrayList<Character> coded = new ArrayList<>(
                Arrays.asList('C', 'D','E', 'F', 'G', 'Q', 'T')
        );
        ArrayList<Character> actual = new ArrayList<>(
                Arrays.asList('G', 'D', 'S', 'A', 'H', 'T', 'E')
        );
        // Suppose you want to send a secret message.
        //  Each letter in coded maps to an actual letter
        //   So C -> G, D->D, E->S, F->A, etc
        // Write the following method that inputs coded, actual and encoded
        //         and returns the decoded string.
        //         then output the decoded message
//        String encoded = "TCCGTFD";
//        String msg = decodeThisMessage( coded, actual, encoded);
    }


}
