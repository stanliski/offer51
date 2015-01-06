package cn.stanliski.offer51.DFS;

/**
 * 
 * Word Search.
 * 
 * @author Stanley
 *
 */
public class WordSearch {

	private static ThreadLocal connectionHolder = new ThreadLocal(){};
	
	public boolean exist(char[][] board, String word){		
		if(word.length() == 0)
			return true;
		int m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(board[i][j] == word.charAt(0)){
					if(word.length() == 1 || dfs(board, word))
						return true;
					else
						return false;
				}
			}
		}
		return false;
	}
	
	public boolean dfs(char[][] board, String word){
		
		return false;
	}
	
}
