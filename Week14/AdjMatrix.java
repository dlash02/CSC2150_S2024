public class AdjMatrix {
    public static void main(String[] args) {
        boolean[][] adjMatrix = new boolean[3][3];
        adjMatrix[0][0] = 0;
        adjMatrix[0][0] = 0;
        adjMatrix[0][2] = 1;
        adjMatrix[1][0]= 0;
        adjMatrix[1][1]= 0;
        adjMatrix[1][2]= 1;
        adjMatrix[2][0] = 1;
        adjMatrix[2][1] = 1;
        adjMatrix[2][2] = 0;
        int max = 0;
        for( int row = 0; row<adjMatrix.length; row++){
            int ct = 0;
            for( int col=0; col<adjMatrix.length; col++){
                if ( adjMatrix[row][col] == 1){
                    ct++
                }
            }
            if ( ct > max){
                max = row;
            }
        }
    }

}
