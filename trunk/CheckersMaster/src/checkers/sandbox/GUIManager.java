package checkers.sandbox;

import java.util.LinkedList;
import java.util.List;

/**
 * Buras� denemelerimizi yapabilece�imiz yer.
 * 
 * @author yusuf
 * 
 */
public class GUIManager {
	// public static void main(String[] args) {
		// System.err.println("This is the main program");
		// for (int i = 1; i <= 9; i = i + 5) {
			// System.err.println("i=" + i);
		// }
	// 0 means blank
	// 1 means white
	// 2 means black
	// 3 means king white
	// 4 means king black
		int[][] m = new int[8][8];
// bir karedekini beyaz ta� kabul edip, �aprazlar�n� kontrol edip hamle yapt�raca��z. 
		// i alt sat�r, j yan s�tun
		for (int i=1;i<=8;i++){
			for (int i=1;i<=8;i++){
				//e�er bulundu�un yerde bir beyaz varsa
				if (m[i][j]=1) 
				{
					//e�er sa� �apraz� da beyazsa de�i�iklik yapma
					if (m[i+1][j+1]=1)
					{
						m[i][j]=1;
					}
					// e�er sa� �apraz� siyahsa ve siyah�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri beyaz yap(1 yap)
					else if (m[i+1][j+1]=2 and m[i+2][j+2] and i<=8 and j<=8 )
					{
						m[i][j]=0;
						m[i+1][j+1]=0;
						m[i+2][j+2]=1;
					}
					// e�er sa� �apraz� king beyazsa de�i�iklik yapma

					else if (m[i+1][j+1]=3)
					{
						m[i][j]=1;
					}
					// e�er sa� �apraz� king siyahsa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri beyaz yap(1 yap)

					else (m[i+1][j+1]=4 and m[i+2][j+2] and i<=8 and j<=8 )
					{
						m[i][j]=0;
						m[i+1][j+1]=0;
						m[i+2][j+2]=1;
					}
				}
				// e�er bulundu�un yerde siyah varsa
				else if 
				
					
				}
			}

		}
		List<Move> nextMoves = successors(m,1);
	}

	private static List<Move> successors(int[][] m, int i) {
		List<Move> list = new LinkedList<Move>();
		
		return list;
	}
}
class Move{
	int fromX;
	int fromY;
	int toX;
	int toY;
}