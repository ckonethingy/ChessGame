
public class Chessboard {
	Piece[][] board = new Piece[8][8];
	int blackPieces;
	int whitePieces;
	
	Chessboard(){
		//place the pawns and null pieces
		for(int i = 0; i < 8; i++){
			board[1][i].color = 1;
			board[1][i].name = 1;
			
			board[2][i].name = 0;
			board[3][i].name = 0;
			board[4][i].name = 0;
			board[5][i].name = 0;
			
			board[2][i].color = 0;
			board[3][i].color = 0;
			board[4][i].color = 0;
			board[5][i].color = 0;			
			
			board[6][i].color = 2;
			board[6][i].name = 1;
		}	
		
		//add the kings
		board[4][0].color = 1;
		board[4][7].color = 2;
		board[4][0].name = 6;
		board[4][7].name = 6;
		
		//add the queens
		board[3][0].color = 1;
		board[3][7].color = 2;
		board[3][0].name = 5;
		board[3][7].name = 5;
		
		//add the bishops
		board[2][0].color = 1;		
		board[2][0].name = 3;		
		board[5][0].color = 1;
		board[5][0].name = 3;
		
		board[2][7].name = 3;
		board[2][7].color = 2;
		board[5][7].name = 3;		
		board[5][7].color = 2;
		
		//add the knights
		board[1][0].color = 1;
		board[1][0].name = 2;		
		board[6][0].color = 1;		
		board[6][0].name = 2;
		
		
		board[1][7].name = 2;
		board[1][7].color = 2;
		board[6][7].name = 2;			
		board[6][7].color = 2;
		
		//add the rooks
		board[0][0].name = 4;
		board[0][0].color = 1;
		board[7][0].name = 4;
		board[7][0].color = 1;
		
		board[0][7].name = 4;
		board[0][7].color = 2;
		board[7][7].name = 4;
		board[7][7].color = 2;
		
		this.blackpieces = 16;
		this.whitepieces = 16;

	}
	
	//check what is on a particular square
	Piece checkSquare(int x, int y){
		return board[x-1][y-1];
	}
	
	//given a start x-y and and end x-y, the piece in the start x-y	
	//the location is moved to the end x-y
	//Does not handle piece-taking.
	//Does not check if end x-y is taken
	void movePiece(int startx, int starty, int endx, int endy){
		board[endx-1][endy-1].color = board[startx-1][starty-1].color;
		board[endx-1][endy-1].name = board[startx-1][starty-1].name;
		
		//original square reverted to a NULL piece
		board[startx-1][endx-1].color = 0;
		board[startx-1][endx-1].name = 0;
	}
	
	//given start x-y and end x-y, the piece on start x-y
	//will replace the piece on end x-y.
	//end x-y- peice is removed from the board. 
	//1 is removed from the piece counter
	//Does not check if the square is NOT occupied
	//UNFINISHED
	void takePiece(int startx, int starty, int endx, int endy){
		removeColor = board[endx-1][endy-1].color;
		
	}
}

