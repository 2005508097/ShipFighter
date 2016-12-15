package objects;

public class Enemy extends GameActor implements Fighter {

	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	public Enemy(Board board,int opponentHint) {
		super( board,opponentHint);
	}
	
	@Override
	public void attack(int x, int y) {
		if(((getBoard().getCells())[x][y].getHit())==false && 
				((getBoard().getCells())[x][y]).getHasShip()==true ){
			
			((getBoard().getCells())[x][y]).setHit(true);
			setOpponentHint(super.getOpponentHint()+1);
			System.out.println("You have hit a ship! Left "+(3-super.getOpponentHint()));
		}
		else if (((getBoard().getCells())[x][y]).getHasShip()==false && 
				((getBoard().getCells())[x][y]).getHasShip()==false)
			System.out.println("You missed!");
		else if(((getBoard().getCells())[x][y].getHit())==true && 
				((getBoard().getCells())[x][y]).getHasShip()==true)
			System.out.println("You have already attacked here!");
		
	}

}
