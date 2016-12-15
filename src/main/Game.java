package main;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import objects.Board;
import objects.Cell;
import objects.Enemy;
import objects.Player;
public class Game {
	public static void main(String[] args) {
		Cell[][] enemyCells=new Cell[5][5];
		Cell[][] playerCells=new Cell[5][5];
		Board enemyBoard=new Board(enemyCells[0].length, enemyCells);
		Board playerBoard=new Board(playerCells[0].length, playerCells);
		Player player=new Player(playerBoard, 0);
		Enemy enemy=new Enemy(enemyBoard, 0);
		System.out.println("Board dimension is 5*5");
		Random rand=new Random();
		int x,y,sayac;
		sayac=0;
		while(sayac!=3){
			x=rand.nextInt(4);
			y=rand.nextInt(4);
			if(enemyCells[x][y].getHasShip().equals(false)){
			((enemyBoard.getCells())[x][y]).setHasShip(true);
			JOptionPane.showMessageDialog(null,"X: "+x+" "+"Y: "+y);
			sayac++;
			}
		}
		sayac=0;
		while(sayac!=3){
			x=rand.nextInt(4);
			y=rand.nextInt(4);
			if((playerBoard.getCells())[x][y].getHasShip()==false){
			(playerBoard.getCells())[x][y].setHasShip(true);
			sayac++;
			}
		}
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("------------------");
			System.out.println("X coordinate to attack:");
			x=scan.nextInt()-1;
			System.out.println("Y coordinate to attack:");
			y=scan.nextInt()-1;
			enemy.attack(x, y);
			System.out.println("------------------");
			System.out.println("Enemy attacks!");
			System.out.println("X coordinate to attack:");
			x=rand.nextInt(4);
			System.out.println(x);
			System.out.println("Y coordinate to attack:");
			y=rand.nextInt(4);
			System.out.println(y);
			player.attack(x, y);
			if(player.getOpponentHint()==3){
				System.out.println("------------------");
				System.out.println("Enemy won the game");
				break;
			}
			if(enemy.getOpponentHint()==3){
				System.out.println("------------------");
				System.out.println("Player won the game");
				break;}
		}
		scan.close();
	}
}
