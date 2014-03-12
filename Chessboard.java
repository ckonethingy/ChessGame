
public class Chessboard {
	Piece[][] board = new Piece[8][8];
	
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

	}
	
	
	
	
}

