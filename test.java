public class test {
	
	public static void back(int move, int r, int c) {
		int[][] board = new int[5][5];
		backH(move,r,c,board);
		for(int rr = 0; rr < board.length; rr++) {
			for(int cc = 0; cc < board[rr].length; cc++) {
				System.out.print(board[rr][cc] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
	}
	
	public static void backH(int move, int r, int c, int[][] b) {
		if(!(r < 0 || c < 0 || r >= b.length || c >= b[r].length)) {
			if(move == 0) {
				b[r][c]++;
			}
			else {
				backH(move-1,r-1,c,b);
				backH(move-1,r+1,c,b);
				backH(move-1,r,c-1,b);
				backH(move-1,r,c+1,b);
			}
		}
	}
	
	public static void main(String[] args) {
		back(5,2,2);
	}
	
	
}