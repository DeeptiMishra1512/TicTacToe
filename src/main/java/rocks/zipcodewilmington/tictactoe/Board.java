package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board = new Character[3][3];
    int countRowX = 0;
    int countColX = 0;
    int countRowO = 0;
    int countColO = 0;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        Boolean result = false;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == 'X' && board[i][j] != ' '){
                    countColX++;
                } else if(board[j][i] == 'X' && board[i][j] != ' ') {
                    countRowX++;
                }
            }
        }
        System.out.println("countX:isInFavorOfX Row " + countRowX);
        System.out.println("countX:isInFavorOfX Col " + countColX);
        if(countColX == 3|| countRowX == 3) {
            result = true;
        }
        return result;
    }

    public Boolean isInFavorOfO() {
        Boolean result = false;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == 'O' && board[i][j] != ' '){
                    countColO++;
                } else if(board[j][i] == 'O' && board[i][j] != ' ') {
                    countRowO++;
                }
            }
        }
        System.out.println("countO: isInFavorOfO " + countRowO);
        System.out.println("countO: isInFavorOfO " + countColO);
        if(countColO == 3|| countRowO == 3) {
            // System.out.println("Player of O is winner");
            result = true;
        }
        return result;
    }

    public Boolean isTie() {
        Boolean result = false;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == 'X' && board[i][j] != ' '){
                    countColX++;
                } else if (board[i][j] == 'O' && board[i][j] != ' ') {
                    countColO++;
                }
                else if(board[j][i] == 'X' && board[i][j] != ' ') {
                    countRowX++;
                } else if (board[j][i] == 'O' && board[i][j] != ' ') {
                    countRowO++;
                }
            }
        }
        if(countRowX != 3 && countRowO!= 3 && countColX != 3 && countColO!= 3){
            System.out.println("Player of X is winner");
            result = true;
        }
        return result;
    }

    public String getWinner() {

        String result = "";
        for(int i=0; i<3; i++){ // column
            for(int j=0; j<3; j++){ //row
                if(board[i][j] == 'X' && board[i][j] != ' '){
                    countColX++;
                }
                else if(board[j][i] == 'X' && board[i][j] != ' ') {
                    countRowX++;
                } else if (board[i][j] == 'O' && board[i][j] != ' ') {
                    countColO++;
                }else if (board[j][i] == 'O' && board[i][j] != ' ') {
                    countRowO++;
                }
            }
//            if((countColX == 3 && countColO!= 3) || (countRowX == 3 && countRowO!= 3)){
//                result = "X";
//            } else if ((countColX != 3 && countColO== 3) || (countRowX != 3 && countRowO== 3)) {
//                result = "0";
//            }
        }
        System.out.println("countRowX:isWinner " + countRowX);
        System.out.println("countColX:isWinner " + countColX);
        System.out.println("countRowO:isWinner " + countRowO);
        System.out.println("countColO:isWinner " + countColO);

        if((countColX == 3 && countColO!= 3) || (countRowX == 3 && countRowO!= 3)){
            System.out.println("Player of X is winner");
            result = "X";
        } else if ((countColX != 3 && countColO== 3) || (countRowX != 3 && countRowO== 3)) {
            result = "O";
        }
        return result;
       // return null;
    }

}
