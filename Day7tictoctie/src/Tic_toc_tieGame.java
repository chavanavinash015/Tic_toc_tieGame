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
}
