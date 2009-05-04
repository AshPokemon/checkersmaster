package checkers.sandbox;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*
8 x o x o x o x o
7 o x o x o x o x
6 x o x o x o x o
5 o x o x o x o x
4 x o x o x o x o
3 o x o x o x o x
2 x o x o x o x o
1 o x o x o x o x 
  1 2 3 4 5 6 7 8 
*/

/**
 * Checkers i�in oyun tahtas�n� olu�turan kod.
 * 
 * 
 * @author ykaragol
 */
@SuppressWarnings("serial")
public class Board extends JPanel {

	private Image board = null;
	private Image white = null;

	public Image getBoard() {
		return board;
	}

	public void setBoard(Image board) {
		this.board = board;
	}

	public Board() throws IOException {
		File f = new File("./img/board.jpg");
		board = ImageIO.read(f);
		addMouseListener(new BoardMouseListener());
		addMouseMotionListener(new BoardMouseMotionListener());
		
		f = new File("./img/white.gif");
		white = ImageIO.read(f);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(board, 0, 0, 605, 605, null);
		
		int [][] matrix = new int[8][8];
		matrix[0][2] = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 1){
					double p = getHeight() / 8;
					g.drawImage(white, (int)(p*i+p*0.15), (int)(p*j+p*0.15), (int)(p*0.7), (int)(p*0.7), null);
				}
			}
		}
	}
	
	private class BoardMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent event) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent event) {
			// TODO Auto-generated method stub			
		}

		@Override
		public void mouseExited(MouseEvent event) {
			// TODO Auto-generated method stub			
		}

		@Override
		public void mousePressed(MouseEvent event) {
			double width = Board.this.getWidth();
			double height = Board.this.getHeight();
			
			int x = (int)(event.getX() / (width / 8)) + 1;
			int y = (int)((height - event.getY()) / (height/ 8)) + 1;
			
			System.err.println("Su noktada basildi:"+ x + " - " + y);
		}

		@Override
		public void mouseReleased(MouseEvent event) {
			double width = Board.this.getWidth();
			double height = Board.this.getHeight();
			
			int x = (int)(event.getX() / (width / 8)) + 1;
			int y = (int)((height - event.getY()) / (height/ 8)) + 1;
			
			System.err.println("Su noktada birakildi:"+ x + " - " + y);	
		}
		
	}
	
	private class BoardMouseMotionListener implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Board b = new Board();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(2, 2, 610, 636);
		frame.add(b);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}