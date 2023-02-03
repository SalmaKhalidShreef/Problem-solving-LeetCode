class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[] itemValidate = new char[9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                itemValidate[j] = board[i][j];
            }
            if(!checkItemValidate(itemValidate))
                return false;
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                itemValidate[j] = board[j][i];
            }
            if(!checkItemValidate(itemValidate))
                return false;
        }

        for(int boxRow = 0; boxRow<9; boxRow = boxRow+3){
            for(int boxCol = 0; boxCol<9; boxCol = boxCol+3){
                for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    itemValidate[i*3+j] = board[boxRow + i][boxCol + j];
                }
            }
            if(!checkItemValidate(itemValidate))
                    return false;
            }
        }
        return true;
    }

    private boolean checkItemValidate(char[] itemValidate){
        boolean[] flag = new boolean[9];
        for(int i=0; i<9; i++){
            if(itemValidate[i] == '.')
                continue;
            if(flag[itemValidate[i] - '0' - 1])
                return false;
            flag[itemValidate[i] - '0' - 1] = true;
        }
        return true;
    }
}