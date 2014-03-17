import static org.junit.Assert.*;

public class PlayGame {
	
	
	public static void main(String[] args){
		
		System.out.println("Creating two Players");
		//create two players
		Player White = new Player(1);
		assert White.color == 2;
		assert White.points == 0;
		
		Player Black = new Player(2);
		assert Black.color == 2;
		assert Black.points == 0;
		
		System.out.println("Creating Chessboard");
		
		Chessboard Gameboard = new Chessboard();
		assert Gameboard.blackPieces == 16;
		assert Gameboard.whitePieces == 16;
		for (int i = 0; i < 8; i++){
			
			assertEquals(Gameboard.board[1][i].color, 1);
			assert Gameboard.board[6][i].color == 2;
			
		}
		//System.out.println(Gameboard.blackPieces);
		
		
		System.out.println("All Tests Passed! You are Awesome!");
		
		
	}
}
