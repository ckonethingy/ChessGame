
public class Piece {
	int name;
	int color;
	/**
	 *  for names, let:
	 *  0 = NULL peice
	 *  1 = Pawn
	 *  2 = Knight
	 *  3 = Bishop
	 *  4 = Rook
	 *  5 = Queen
	 *  6 = King
	 * 
	 *  for colors, let:
	 *  0 = NULL peice
	 *  1 = White
	 *  2 = Black
	 * @param name
	 * @param color
	 */
	
	Piece(int name, int color){
		this.name = name;
		this.color = color;
	}
	
	void showDetails(){
		String pieceName = "NULL piece.";
		String pieceColor = "Non-Coloured ";
				
		if (this.color == 1){
			pieceColor = "White ";
		} else if (this.color == 2){
			pieceColor = "Black ";
		}
				
		if (this.name == 1) {
			pieceName = "Pawn.";
		} else if (this.name == 2) {
			pieceName = "Knight.";
		} else if (this.name == 3) {
			pieceName = "Bishop.";
		} else if (this.name == 4) {
			pieceName = "Rook.";
		} else if (this.name == 5) {
			pieceName = "Queen.";
		} else if (this.name == 6) {
			pieceName = "King.";
		}
		
		System.out.println("This piece is a" + pieceColor + pieceName);
	}
}


