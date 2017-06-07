import java.util.*;
//2017-4-4
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
        	HashSet<Character> row = new HashSet<>();
        	HashSet<Character> col = new HashSet<>();
        	HashSet<Character> cube = new HashSet<>();
        	int rowindex = 3*(i/3);
        	int colindex = 3*(i%3);
        	for(int j = 0; j < 9; j++){
        		if((board[i][j]!='.'&&!row.add(board[i][j]))||
        		(board[j][i]!='.'&&!col.add(board[j][i]))||
        		(board[rowindex+j/3][colindex+j%3]!='.'&&!cube.add(board[rowindex+j/3][colindex+j%3])))
        			return false;
        			
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
