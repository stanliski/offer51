public class MRegions{

	class Point{
		
		public int x;
		
		public int y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	/**
	*	Solve
	*/
	public void solve(char[][] board, Point start, Point end){
		if(board == null || board.length == 0)
			return board;
		int m = board.length;
		int n = board[0].length;
		int[][] visited = new int[m][n];
		List<Point> visitedPath = new LinkedList<Point>();
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(i == start.x && j = start.y){
					visited[i][j] = 1;
					visited[i][j] = 0;
 				}		
			}
		}
	}

	/**
	* 
	* DFS
	* 
	*/
	public boolean dfs(char[][] board, Point end, int i, int j, List<Point> visitedPath){
		if(i == end.x && j == end.y){
			// 
		}
		int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
		for(int k = 0; k < directions.length; k++){
			int x = i + directions[k][0];
			int y = j + directions[k][1];
			if(x >= 0 && x < board.length && y >= 0 && y < board[0].length
					&& visited[x][y] == 0 && board[x][y] != '1'){
				visited[x][y] = 1;
				visitedPath.add(new Point(x, y));
				visitedPath.removeLast(new Point(x, y));			
			}
		}
	}


} 