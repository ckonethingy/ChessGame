
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
}


