//2017-4-4
public class GameofLife {
	public void gameOfLife(int[][] board) {
    	if(board.length==0||board[0].length==0) return;
    	int m = board.length;
    	int n = board[0].length;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		int ln = liveneig(i,j,m,n,board);
        		if(board[i][j]==0&&ln==3) board[i][j]=2;
        		if(board[i][j]==1&&(ln==2||ln==3)) board[i][j]=3;
        	}
        }
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		board[i][j]=board[i][j]>>1;
        	}
        }
    }
    public int liveneig(int i, int j, int m, int n, int[][] board){
    	int res = 0;
    	for(int x = Math.max(i-1, 0); x<=Math.min(i+1, m-1);x++){
    		for(int y = Math.max(j-1, 0); y<=Math.min(j+1, n-1);y++){
    			res += board[x][y]&1;
    		}
    	}
    	res-= board[i][j]&1;
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
