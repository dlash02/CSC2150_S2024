package April5;

import java.util.Deque;
import java.util.LinkedList;

public class DriveCeasar {
    public static void main(String[] args) {
        int[] key = { 3, 1, 7, 4, 2, 5};
        String message = "Attack On Monday";
        System.out.printf("\n Encode message to send it");
        String encode = enCodeTheMessage( message, key );
        System.out.printf("\n Encoded:%s", encode);

        System.out.printf("\n Decode message-------");
        String decode = deCodeTheMessage( encode, key );
        System.out.printf("\n Decoded:%s", decode);
    }

    private static String deCodeTheMessage(String message, int[] key) {
        Deque<Integer> decodingQueue  = new LinkedList<>();
        String  decoded = "";
        for( int i=0; i<key.length; i++){
            decodingQueue.addFirst( key[i]);
        }
        Integer keyValue;
        for ( int i=0; i<message.length(); i++ ) {
            keyValue = decodingQueue.removeLast();
            decoded += (char) ( message.charAt(i) - keyValue);
//            System.out.printf("\n kv:%s encode:%s size:%s", keyValue, decoded, decodingQueue.size());
//            System.exit(1);
            decodingQueue.addFirst( keyValue);
        }
        return decoded;
    }

    private static String enCodeTheMessage(String message, int[] key) {
        Deque<Integer> encodingQueue  = new LinkedList<>();
        String  encoded = "";
        for( int i=0; i<key.length; i++){
            encodingQueue.addFirst( key[i]);
        }
        Integer keyValue;
        for ( int i=0; i<message.length(); i++ ){
            keyValue = encodingQueue.removeLast();
            encoded += (char) ( message.charAt(i) + keyValue);
//            System.out.printf("\n kv:%s encode:%s size:%s", keyValue, encoded, encodingQueue.size());
//            System.exit(1);
            encodingQueue.addFirst( keyValue);
        }
        return encoded;
    }
}
