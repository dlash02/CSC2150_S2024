package Prep;

import java.util.Deque;
import java.util.LinkedList;
public class DriveCeasarCipher {
    public static void main(String[] args) {
        int[] key = { 3, 1, 7, 4, 2, 5};
        Integer keyValue;
        String message = "knowledge is power";
        String encoded = encodeTheMessage( message, key );
        System.out.printf("\n The encoded is:%s", encoded);
        String decoded = decodeTheMessage( encoded, key );
        System.out.printf("\n The decoded is:%s", decoded);
    }
    private static String encodeTheMessage(String message, int[] key) {
        Deque<Integer> encodingQueue = new LinkedList<>();
        String encoded = "";
        for ( int i=0; i<key.length; i++){
            encodingQueue.push( key[i]);
        }
        // encode message
        Integer keyValue;
        for( int i=0; i<message.length(); i++){
            keyValue = encodingQueue.removeLast();
            encoded += (char) (message.charAt(i) + keyValue);
//            System.out.printf("\n First =%s encoded:%s size:%s", keyValue, encoded, encodingQueue.size());
//            System.exit(1);
            encodingQueue.addFirst( keyValue);
        }
        return encoded;
    }
    private static String decodeTheMessage(String encoded, int[] key) {
        Deque<Integer> decodingQueue = new LinkedList<>();
        String decoded = "";
        for ( int i=0; i<key.length; i++){
            decodingQueue.push( key[i]);
        }
        // encode message
        Integer keyValue;
        for ( int i=0; i<encoded.length(); i++){
            keyValue = decodingQueue.removeLast();
            decoded += (char)(encoded.charAt(i) - keyValue);
//            System.out.printf("\n First DECODe KeyVale=%s Decoded:%s size:%s ToDecode:%s", keyValue, decoded, decodingQueue.size(), encoded.charAt(i));
//            System.exit(1);
            decodingQueue.addFirst( keyValue);
        }
        return decoded;
    }
}
