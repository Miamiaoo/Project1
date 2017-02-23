package TicTacToe;

public class Board {
	private int[][] Board = new int[3][3];
	
	public Board() {
		clearBoard();
	}
	
	//firstly clear the board, i represents row and j represents column
	public void clearBoard() {
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				Board[i][j] = 0;
	}
	
	public void showBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(Board[i][j] == -1) {
					System.out.println("X");
				}
				if(Board[i][j] == 1) {
					System.out.println("O");
				}
				if(Board[i][j] == 0) {
					System.out.println(" ");
				}				
				System.out.println(" ");
			}
		}
	}
	
		//check if the board is full
		public boolean fullBoard() {
			for (int i = 0; i < 3; i++) 
				for (int j = 0; j < 3; j++) 
					if (Board [i][j] == 0)
						return false;
			return true;
									
		}

		public int getPosition(int[] attempt) {
			return Board[attempt[0]][attempt[1]];
		}
		
		//define the position of two players
		public void setPosition(int[] attempt,int player) {
			if (player == 1) {
				Board[attempt[0]][attempt[1]] = -1;
			}
			else {
				Board[attempt[0]][attempt[1]] = 1;
			}
		}
		
		//check if every row has same X or O
		public int checkLines(){
	        for(int line=0 ; line<3 ; line++){

	            if( (Board[line][0] + Board[line][1] + Board[line][2]) == -3)
	                return -1;
	            if( (Board[line][0] + Board[line][1] + Board[line][2]) == 3)
	                return 1;
	        }
	        
	        return 0;	                
	    }
		
		//check if every column has same X or O
		public int checkColumns(){
	        for(int column=0 ; column<3 ; column++){

	            if( (Board[0][column] + Board[1][column] + Board[2][column]) == -3)
	                return -1;
	            if( (Board[0][column] + Board[1][column] + Board[2][column]) == 3)
	                return 1;
	        }
	        
	        return 0;	                
	    }
		
		//check if two diagonals have same X or O
		 public int checkDiagonals(){
		        if( (Board[0][0] + Board[1][1] + Board[2][2]) == -3)
		            return -1;
		        if( (Board[0][0] + Board[1][1] + Board[2][2]) == 3)
		            return 1;
		        if( (Board[0][2] + Board[1][1] + Board[2][0]) == -3)
		            return -1;
		        if( (Board[0][2] + Board[1][1] + Board[2][0]) == 3)
		            return 1;		        
		        return 0;
		    }
		
		}	
	
