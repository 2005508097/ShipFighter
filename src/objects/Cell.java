package objects;
public class Cell {
	private Boolean hit;
	private Boolean hasShip;
	public Cell() {
		// TODO Auto-generated constructor stub
	}
	public Cell(Boolean hit,Boolean hasShip) {
		this.hit=hit;
		this.hasShip=hasShip;
	}
	public Boolean getHit() {
		return hit;
	}
	public void setHit(Boolean hit) {
		this.hit = hit;
	}
	public Boolean getHasShip() {
		return hasShip;
	}
	public void setHasShip(Boolean hasShip) {
		this.hasShip = hasShip;
	}
}
