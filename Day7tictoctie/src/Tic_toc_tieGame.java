
public class Tic_toc_tieGame {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Toc tie Game ");

		char[] board = createBoard();
		System.out.println("Welcome to TicTocToe Simulation Game");

	}

	private static char[] createBoard() {
		char[] board = new char[10];
		for (int index = 0; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}
}
