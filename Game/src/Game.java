import java.util.*;
public class Game {	
	public static void main(String[] args) {
		printRules();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// initialize trackers
		int round = 0;
	    int userWinRound = 0;
	    int computerWinRound = 0;
	    boolean play = false;
	    
	    // asks if user want to play the game, use while loop to check for valid input of Y or N
	    boolean gameStart = false;
		while (!gameStart) { 
			System.out.print("Wanna play? Y or N: ");
			String start = scanner.nextLine();
			if (start.equalsIgnoreCase("Y")) {
				play = true; // if Y, set play to true
				gameStart = true;	// set gameStart to true, terminating the loop and pass out that play is true, starting the game
			} else if (start.equalsIgnoreCase("N")) {
				play = false;
				gameStart = true; // if N, stops the game
			} else {
				System.out.println("Invalid input, please enter Y or N."); // keep looping until Y or N
			}
		}
	    
	    // while play is true, keep looping the game until user stops it
		while (play) {
			// adds a round every time the user plays again
			round++;
			// get user move by passing the scanner to getUserMove function
			String userMove = getUserMove(scanner);
			// get computer move by passing random to getComputerMove function
			String computerMove = getComputerMove(random);
			// print out user input's move and the randomized computer move
			System.out.println("Your move: " + userMove);
			System.out.println("Computer move: " + computerMove);
			// checking if the user wins in isUserWinner function, return true if won and adds a point to user wins
			if (isUserWinner(userMove,computerMove)) {
				System.out.println("You won!");
				userWinRound++;
			// else if false, computer wins, and add point to computer
			} else {
				System.out.println("You lose, the computer wins.");
				computerWinRound++;
			}
			// ask the user if they want to play again
			// initialize ValidInput to false to enter while loop
			boolean ValidInput = false;
			while (!ValidInput) { 
				System.out.print("Play again? Y or N: ");
				String replay = scanner.nextLine();
				if (replay.equalsIgnoreCase("Y")) {
					ValidInput = true; // if they wanna play again, set ValidInput true to quit the loop, and start the play loop again
				} else if (replay.equalsIgnoreCase("N")) {
					play = false; // set play to false to quit the entire loop if N
					ValidInput = true; // set ValidInput to true to quit this loop to pass out that play is now false
				} else {
					System.out.println("Invalid input, please enter Y or N."); // keep looping until Y or N
				}
			}
			
			
		}
		// calculate total rounds and scores
		System.out.println("Total rounds: " + round);
		System.out.println("Your win total: " + userWinRound);
		System.out.println("Computer win total: " + computerWinRound);
	}
	public static String getComputerMove(Random random) {
		// each number from 1 to 4 represents a move
		int randomNumber = random.nextInt(5);
		String compMove = "";
		if (randomNumber == 0) {
			compMove = "EKENABBEN";
		} else if (randomNumber == 1) {
			compMove = "VITTSJO";
		} else if (randomNumber == 2) {
			compMove = "OXBERG";
		}else if (randomNumber ==  3) {
			compMove = "FJALLBO";
		} else if (randomNumber == 4) {
			compMove ="JATTESTA";
		}
		return compMove; // return move name based on random numbers
	}
	
	public static String getUserMove(Scanner scanner) {
		// ask user for their moves
		System.out.print("Enter your move (Ekenabben, Vittsjo, Oxberg, Fjallbo, Jattesta): ");
	    String move = scanner.nextLine().toLowerCase();
	    // check if its valid by passing move to isValidMove function
	    while (!isValidMove(move)) { // keep asking for correct input if its false
	    	System.out.print("Invalid move, please enter again:");
	    	move = scanner.nextLine().toLowerCase();
	    }
		return move.toUpperCase();
		
	}
	// check for valid moves input
	public static boolean isValidMove(String move) {
		return move.equals("ekenabben") || move.equals("vittsjo") ||
		           move.equals("oxberg") || move.equals("fjallbo") ||
		           move.equals("jattesta");
	}
	// check if the user wins according to the rules
	public static boolean isUserWinner(String userMove, String computerMove) {
		if ((userMove.equals("EKENABBEN") && (computerMove.equals("VITTSJO") || computerMove.equals("FJALLBO"))) ||
	            (userMove.equals("VITTSJO") && (computerMove.equals("OXBERG") || computerMove.equals("JATTESTA"))) ||
	            (userMove.equals("OXBERG") && (computerMove.equals("EKENABBEN") || computerMove.equals("FJALLBO"))) ||
	            (userMove.equals("FJALLBO") && (computerMove.equals("JATTESTA") || computerMove.equals("VITTSJO"))) ||
	            (userMove.equals("JATTESTA") && (computerMove.equals("EKENABBEN") || computerMove.equals("OXBERG")))) {
	        return true; // return true for user win
		} else { // if none above match or happens to be a tie, the computer wins return false
			return false;
		}
		
	}
	// print rules
	public static void printRules() {
		System.out.println("Welcome to Baggebo!");
        System.out.println("Rules:");
        System.out.println("Ekenabben beats Vittsjo, Fjallbo");
        System.out.println("Vittsjo beats Oxberg, Jattesta");
        System.out.println("Oxberg beats Ekenabben, Fjallbo");
        System.out.println("Fjallbo Beats Jattesta, Vittsjo");
        System.out.println("Jattesta beats Ekenabben, Oxberg");
	}

}
