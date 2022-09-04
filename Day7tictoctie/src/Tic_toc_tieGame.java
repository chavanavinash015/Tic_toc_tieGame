import java.util.Scanner;

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

	Scanner userInput = new Scanner(System.in);
	char userLetter = chooseuserLetter(userInput);
	char computerLetter = (userLetter == 'X') ? 'O' : 'X';
	char[] board = createBoard();

	private static char chooseuserLetter(Scanner userInput) {
		System.out.println("Choose your letter");
		return userInput.next().toUpperCase().charAt(0);
	}

	private static void showBoard(char[] board) {
		System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
		System.out.println("-+-+-");
		System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
		System.out.println("-+-+-");
		System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
	}

	private static void userPosition(char userLetter, char[] board) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter your position (1-9)");
		int position = Scanner.nextInt();
		for (int index = 0; index <= 8; index++) {
			if (board[index] == ' ') {

				switch (position) {
				case 1:
					board[0] = userLetter;
				case 2:
					board[1] = userLetter;
				case 3:
					board[2] = userLetter;
				case 4:
					board[3] = userLetter;
				case 5:
					board[4] = userLetter;
				case 6:
					board[5] = userLetter;
				case 7:
					board[6] = userLetter;
				case 8:
					board[7] = userLetter;
				case 9:
					board[8] = userLetter;
				default:
					break;
				}
			} else {
				System.out.println("Position is not free! Letter is entered");
			}
		}
		showBoard(board);
	}

	boolean freeSpace = false;
	{
		for (int index = 0; index < board.length; index++) {
			if (board[index] == ' ') {
				freeSpace = true;
			}
		}
		if (freeSpace == true) {
			System.out.println("Free Space available for the net move");
		} else {
			System.out.println("Free space is not available,Board is Full");
		}
	}

	private static boolean checkfirstplayer() {
		int Head = 0;
		boolean userPlay;
		Scanner scanner = new Scanner(System.in);
		double RandomNum = Math.floor(Math.random() * 10) % 2;
		if (RandomNum == Head) {
			System.out.println("Comp[uter staer to play first");
			userPlay = false;
		} else {
			System.out.println("user starts to play first");
			userPlay = true;
		}
		return userPlay;

	}

	private int computerMove;
	{

		while (true) {
			computerMove = (int) Math.floor(Math.random() * 10) % 9 + 1;
			if (isValidMove(board, computerMove)) {
				break;
			}
		}

		System.out.println("Computer Choose" + computerMove);
		PlaceMove(board, computerMove, computerLetter);
	}

	private static void winner(char[] board, char userLetter, char computerLetter) {

		if ((board[0] == userLetter && board[1] == userLetter && board[2] == userLetter)
				|| (board[3] == userLetter && board[4] == userLetter && board[5] == userLetter)
				|| (board[6] == userLetter && board[7] == userLetter && board[8] == userLetter)
				|| (board[0] == userLetter && board[4] == userLetter && board[8] == userLetter)
				|| (board[2] == userLetter && board[4] == userLetter && board[6] == userLetter)) {
			showBoard(board);
			System.out.println("Player win the Game");
			System.out.println();
		} else if ((board[0] == userLetter && board[1] == userLetter && board[2] == userLetter)
				|| (board[3] == userLetter && board[4] == userLetter && board[5] == userLetter)
				|| (board[6] == userLetter && board[7] == userLetter && board[8] == userLetter)
				|| (board[0] == userLetter && board[4] == userLetter && board[8] == userLetter)
				|| (board[2] == userLetter && board[4] == userLetter && board[6] == userLetter)) {
			showBoard(board);
			System.out.println("computer win the Game");
			System.out.println();

		}

		for (int index = 0; index < board.length; index++) {
			if (board[index] == ' ') {

			}

			showBoard(board);
			System.out.println("The Game Ended in a tie");

		}

	}

	private void PlaceMove(char[] board, int computerMove, char computerLetter) {

	}

	private boolean isValidMove(char[] board, int computerMove) {

		return false;
	}
}
