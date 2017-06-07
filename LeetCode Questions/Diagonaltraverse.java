//2017-2-4
public class Diagonaltraverse {
	public int[] findDiagonalOrder(int[][] matrix) {
		if(matrix.length == 0) return new int[0];
		int[] result = new int[matrix.length * matrix[0].length];
		int RIGHT = 1, DOWN = 2, LEFTDOWN = 3, RIGHTUP = 4;
		int direction = 0;
		int x = 0, y = 0;
		int n = matrix.length;
		int m = matrix[0].length;
		int count = 1;
		result[0] = matrix[0][0];
		while( !(x == m-1 && y == n-1) ){
			if(direction == 0){
				if(x==m-1) direction = DOWN;
				else direction = RIGHT;
			} else if(direction == RIGHT){
				if(y==n-1&&y==0) direction = RIGHT;
				else if(x-1 >= 0 && y+1 < n){	
					direction = LEFTDOWN;
				} else {	
					direction = RIGHTUP;
				}
			} else if(direction == DOWN){
				if(x==m-1&&direction == RIGHT) direction = DOWN;
				if(x==m-1&&x==0) direction = DOWN;
				else if(x-1 >= 0 && y+1 < n){	
					direction = LEFTDOWN;
				} else {	
					direction = RIGHTUP;
				}
			} else if(direction == LEFTDOWN){	
				if(y+1 < n && x-1 >= 0){	
					direction = LEFTDOWN;
				} else if(y+1 < n){	
					direction = DOWN;
				} else {
					direction = RIGHT;
				}
			} else if(direction == RIGHTUP){	
				if(x+1 < m && y-1 >=0){	
					direction = RIGHTUP;
				} else if(x+1 < m){	
					direction = RIGHT;
				} else{			
					direction = DOWN;
				}
			}
			
			
			switch(direction){
				case 1: x = x+1; break;
				case 2: y = y+1; break;
				case 3: x = x-1; y = y+1; break;
				case 4: x = x+1; y = y-1; break;
			}
			
			
			result[count++] = matrix[y][x];
		}
		return result;
    }
	public static void main(String[] args) {
		Diagonaltraverse test = new Diagonaltraverse();
		int[][] matrix = {{1,4},{2,5},{6,9}};
		int[] result = test.findDiagonalOrder(matrix);
		for(int n : result) System.out.println(n);
	}

}
