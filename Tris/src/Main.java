
/**
 * Main class to start
 * a tic tac toe game
 * 
 * @author Roberto Cella
 * 		   Ludovica Sestu
 * 
 */
public class Main {

	public static void main(String[] args) {
		Grid game = new Grid();
	
		while(game.checkEnd() == 0) {
			System.out.println("Player " + ((game.getMove() % 2) + 1) + 
								", choose where to place your symbol:");
			game.getChoice();
			System.out.println("\n" +
					game.getGrid()[0][0] + "|" +
					game.getGrid()[0][1] + "|" +
					game.getGrid()[0][2] + "\n" +
					game.getGrid()[1][0] + "|" +
					game.getGrid()[1][1] + "|" +
					game.getGrid()[1][2] + "\n" +
					game.getGrid()[2][0] + "|" +
					game.getGrid()[2][1] + "|" +
					game.getGrid()[2][2] + "\n"
					);
			}
		if(game.checkEnd() == 1) {
			System.out.println("The game ended in a draw.");
		}
		if(game.checkEnd() == 2) {
			System.out.println("Good job Player " + 
					(((game.getMove() - 1) % 2) + 1) 
					+ ", you won!");
		}

	}

}
