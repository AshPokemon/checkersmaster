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
			for (int j=1;j<=8;j++){
				//e�er bulundu�un yerde bir beyaz varsa
				if (m[i][j]==1) 
				{
					//e�er sa� �apraz� da beyazsa de�i�iklik yapma
					if (m[i+1][j+1]==1 && (i+1)<=8 && (j+1)<=8)
					{
						m[i][j]=1;
					}
					// e�er sa� �apraz� siyahsa ve siyah�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri beyaz yap(1 yap)
					else if (m[i+1][j+1]==2 && m[i+2][j+2]==0 && (i+2)<=8 && (j+2)<=8)
					{
						m[i][j]=0;
						m[i+1][j+1]=0;
						m[i+2][j+2]=1;
					}
					// e�er sa� �apraz� king beyazsa de�i�iklik yapma

					else if (m[i+1][j+1]==3 && (i+1)<=8 && (j+1)<=8)
					{
						m[i][j]=1;
					}
					// e�er sa� �apraz� king siyahsa ve siyah�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri beyaz yap(1 yap)

					else if(m[i+1][j+1]==4 && m[i+2][j+2]==0 && (i+2)<=8 && (j+2)<=8)
					{
						m[i][j]=0;
						m[i+1][j+1]=0;
						m[i+2][j+2]=1;
					}
					//e�er sol �apraz� beyazsa de�i�iklik yapma
					else if (m[i-1][j+1]==1 && (j+1)<=8 && 1<=(i-1))
					{
						m[i][j]=1;
					}
					// e�er sol �apraz� siyahsa ve siyah�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri beyaz yap(1 yap)
					else if (m[i-1][j+1]==2 && m[i-2][j+2]==0 && (j+2)<=8 && 1<=(i-2))
					{
						m[i][j]=0;
						m[i-1][j+1]=0;
						m[i-2][j+2]=1;
					}
					//e�er sol �apraz� da king beyazsa de�i�iklik yapma
					else if (m[i-1][j+1]==3 && (j+1)<=8 && 1<=(i-1))
					{
						m[i][j]=1;
					}
					// e�er sol �apraz� king siyahsa ve siyah�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri beyaz yap(1 yap)

					else if (m[i-1][j+1]==4 && m[i-2][j+2]==0 && (j+2)<=8 && 1<=(i-2))
					{
						m[i][j]=0;
						m[i-1][j+1]=0;
						m[i-2][j+2]=1;
					}
					
				}
				
			}
		}
		//e�er beyazlar 8. sat�ra ula�m��sa king beyaz olurlar
		for (i=1;i<=8;i++){
			if m[i][8]=1;{
				m[i][8]=3;
			}
		}
}

		// siyahlar farkl� olarak matrisin son elemanlar�ndan itibaren hareket etmeye ba�layacaklar
		for (int i=1;i<=8;i++){
			for (int j=8;1<=j;j--){
				// e�er bulundu�un karede siyah varsa
				if m[i][j]==2{
					//e�er sa� �apraz� da siyahsa de�i�iklik yapma
					if (m[i-1][j-1]==2 && 1<=(j-1)&& 1<=(i-1)){ 
						m[i][j]=2;
					}
					// e�er sa� �apraz� beyazsa ve beyaz�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri siyah yap(2 yap)
					else if (m[i-1][j-1]==1 && m[i-2][j-2]==0&& 1<=(j-2) && 1<=(i-2)){
					m[i-2][j-2]=2;
					m[i-1][j-1]=0;
					m[i][j]=0;
					}
					// e�er sa� �apraz� king siyahsa de�i�iklik yapma
					else if (m[i-1][j-1]==4 && 1<=(j-1)&& 1<=(i-1)){
						m[i][j]=2;
					}
					// e�er sa� �apraz� king beyazsa ve beyaz�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri siyah yap(2 yap)
					else if (m[i-1][j-1]==3 && m[i-2][j-2]==0 && 1<=(j-2)&& 1<=(i-2)){
						m[i-2][j-2]=2;
						m[i-1][j-1]=0;
						m[i][j]=0;
					}
					//e�er sol �apraz� da siyahsa de�i�iklik yapma
					else if (m[i+1][j-1]==2 && 1<=(j-1)&& (i+1)<=8){
						m[i][j]=2;
					}
					// e�er sol �apraz� beyazsa ve beyaz�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri siyah yap(2 yap)
					else if (m[i+1][j-1]==1 && m[i+2][j-2]==0 && 1<=(j-2)&& (i+2)<=8){
						m[i+2][j-2]=2;
						m[i+1][j-1]=0;
						m[i][j]=0;
					}
					//e�er sol �apraz� da king siyahsa de�i�iklik yapma
					else if (m[i+1][j-1]==4 & 1<=(j-1)&& (i+1)<=8){
						m[i][j]=2;
					}
					// e�er sol �apraz� king beyazsa ve beyaz�n arkas� bo�luksa �st�nden atlat ve �nceden bulundu�u yeri s�f�rlay�p(blank yap) yeni yeri siyah yap(2 yap)
					else if (m[i+1][j-1]==3 && m[i+2][j-2]==0 && 1<=(j-2)&& (i+2)<=8){
						m[i+1][j-1]=0;
						m[i+2][j-2]=2;
						m[i][j]=0;
				}
			}
		}
			//e�er siyahlarlar 1. sat�ra ula�m��sa king siyah olurlar
           for (i=8;1<=i;i--){
				if m[i][1]=2;{ 
					m[i][1]=4;
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