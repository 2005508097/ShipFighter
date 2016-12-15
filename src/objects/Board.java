package objects;
public class Board {
	private int dimension;
	private Cell[][] cells;
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(int dimension, Cell[][] cells) {
		super();
		this.dimension = dimension;
		this.cells=cells;
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				cells[i][j] = new Cell(false,false);
			}
		}
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public Cell[][] getCells() {
		return cells;
	}
	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}
}
