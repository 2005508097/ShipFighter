package objects;
public class GameActor {
	private Board board;
	private int opponentHint;
	public GameActor() {
		super();
	}
	public GameActor(Board board, int opponentHint) {
		super();
		this.board = board;
		this.opponentHint = opponentHint;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public int getOpponentHint() {
		return opponentHint;
	}
	public void setOpponentHint(int opponentHint) {
		this.opponentHint = opponentHint;
	}	
}
