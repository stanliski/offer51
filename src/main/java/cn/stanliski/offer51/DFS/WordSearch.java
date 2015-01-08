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
<<<<<<< HEAD
			return false;
		int m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				visited[i][j] = false;
			}
		}
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(board[i][j] == word.charAt(0)){
					visited[i][j] = true;
					if(word.length() == 1 || dfs(board, i, j, word.substring(1), visited))
						return true;
					visited[i][j] = false;
=======
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
>>>>>>> e312dc24e6d263b8467bcdf5fe346016b4a4069e
				}
			}
		}
		return false;
	}
	
<<<<<<< HEAD
	/**
	 * 
	 * @param board
	 * @param word
	 * @return
	 */
	public boolean dfs(char[][] board, int i, int j, String word, boolean[][] visited){
		if(word.length() == 0)
			return true;
		int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
		for(int k = 0; k < directions.length; k++){
			int x = i + directions[k][0];
			int y = j + directions[k][1];
			if(x >= 0 && x < board.length && y >= 0 && y < board[0].length && 
					board[x][y] == word.charAt(0) && visited[x][y] == false){
				visited[x][y] = true;
				if(word.length() == 1 || dfs(board, x, y, word.substring(1), visited))
					return true;
				visited[x][y] = false;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		char[][] board = new char[][]{"ABCE".toCharArray(), "SFCS".toCharArray(), "ADEE".toCharArray()};
		WordSearch wordSearch = new WordSearch();
		System.out.println(wordSearch.exist(board, "SEE"));
	}
	
=======
	public boolean dfs(char[][] board, String word){
		
		return false;
	}
	
>>>>>>> e312dc24e6d263b8467bcdf5fe346016b4a4069e
}
