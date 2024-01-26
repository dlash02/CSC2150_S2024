public class RookSafe {

    public static void main(String[] args) {
          char[][] board = getBoard( );
        //ToDo: Write this method roosAreSafe
        if ( rooksAreSafe() ) {
              System.out.printf("\n Yes Rooks are safe on this board");
          } else {
              System.out.printf("\n Rooks are not safe on this board");
          }
          //ToDo: Write this method that shows the current board
          showBoard( board );
    }

    private static void showBoard(char[][] board) {
        //ToDo write this method that shows the entire rows and colum of the board
    }

    private static boolean rooksAreSafe() {
        //Todo: Write this method that returns:
        //    True: If the rook R is the on Rook (R) in its  row and column
        //    False: If there are 2 or More R (rook) in the row and/or column
        //   E.g., if the board was the following it would return True
        //                'R',  ' ', ' ', 'R'
        //                ' ',  ' ', ' ', ' '
        //                ' ',  ' ', ' ', ' '
        //                ' ',  ' ', ' ', ' '
        //   E.g., if the board was the following it would return True
        //                ' ',  'R', ' ', ' '
        //                ' ',  ' ', ' ', ' '
        //                ' ',  'R ', ' ', ' '
        //                ' ',  ' ', ' ', ' '
        //  E.g., if the board was the following it would return False
        //                        'R',  ' ', ' ', ' '
        //                        ' ',  ' ', ' ', 'R'
        //                        ' ',  'R', ' ', ' '
        //                        ' ',  ' ', 'R', ' '
        return true;
    }

    private static char[][] getBoard() {
            char[][] board  = {
                    { ' ', ' ', ' ', ' ', ' '},
                    { ' ', ' ', ' ', ' ', ' '},
                    { ' ', ' ', ' ', ' ', ' '},
                    { ' ', ' ', ' ', ' ', ' '},
                    { ' ', ' ', ' ', ' ', ' '},
                    { ' ', ' ', ' ', ' ', ' '}
            };
            board[1][1] = 'R';
            board[1][3] = 'R';
            // Test also with these lines instead of the 2 above
            board[1][3] = 'R';
            board[1][4] = 'R';
            return board;
        }

    }
