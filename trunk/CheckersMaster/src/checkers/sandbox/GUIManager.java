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
		for (int i=1;i<=8;i++){
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
           for (int i=8;1<=i;i--){
				if m[i][1]=2;{ 
					m[i][1]=4;
				}
			}
           
           
           for (int i=1;i<=8;i++){
        	   for (int j=1;j<=8;j++){
        		   for (int k=1;k<=6;k++){
        		// e�er bulundu�un karede king beyaz varsa
        		   if (m[i][j]==3){
        				   //e�er king beyaz �n sa� �apraz�nda siyahla kar��la��rsa
        			   if (m[i+k][j+k]==2 && m[i+k+1][j+k+1]==0 && (i+k)<=7 && (j+k)<=7){
        				   // �st sat�ra i+k<=7 ve j+k<=7 dememin nedeni, e�er 8 deseydim, siyah ta� 8'li bir sat�r ya da 8'l bir s�tunda da olabilirdi. 
        				   //ama beyaz kingin gidecek bir yeri olmazd�. beyaz king en son gitse gitse 8'li sat�r ya da s�tunlara
        				   //ula�abilece�i i�in i+k ve j+k s�n�rlar�n� 7 ile s�n�rlad�m.
        				   m[i][j]=0;
        				   m[i+k][j+k]=0;
        				   m[i+k+1][j+k+1]=3;
        			   }
    				   //king beyaz �n sa� �apraz�nda king siyahla kar��la��rsa
        			   else if (m[i+k][j+k]==4 && m[i+k+1][j+k+1]==0 && (i+k)<=7 && (j+k)<=7){
        				   m[i][j]=0;
        				   m[i+k][j+k]=0;
        				   m[i+k+1][j+k+1]=3;
        			   }
        			   //king beyaz �n sol �apraz�nda siyahla kar��la��rsa
        			   else if (m[i-k][j+k]==2 && m[i-k-1][j+k+1]==0 && (i-k)>=2 && (j+k)<=7){
        				   m[i][j]=0;
        				   m[i-k][j+k]=0;
        				   m[i-k-1][j+k+1]=3;
        			   }
        			 //king beyaz �n sol �apraz�nda king siyahla kar��la��rsa
        			   else if (m[i-k][j+k]==4 && m[i-k-1][j+k+1]==0 && (i-k)>=2 && (j+k)<=7){
        				   m[i][j]=0;
        				   m[i-k][j+k]=0;
        				   m[i-k-1][j+k+1]=3;
        			   }
        			   //king beyaz arka sa� �apraz�nda siyahla kar��la��rsa
        			   else if (m[i+k][j-k]==2 && m[i+k+1][j-k-1]==0 && (i+k)<=7 && (j-k)>=2){
        				   m[i][j]=0;
        				   m[i+k][j-k]=0;
        				   m[i+k+1][j-k-1]=3;
        			   }
        			 //king beyaz arka sa� �apraz�nda king siyahla kar��la��rsa
        			   else if (m[i+k][j-k]==4 && m[i+k+1][j-k-1]==0 && (i+k)<=7 && (j-k)>=2){
        				   m[i][j]=0;
        				   m[i+k][j-k]=0;
        				   m[i+k+1][j-k-1]=3;
        			   }
        			 //king beyaz arka sol �apraz�nda siyahla kar��la��rsa
        			   else if (m[i-k][j-k]==2 && m[i-k-1][j-k-1]==0 && (i-k)>=2 && (j-k)>=2){
        				   m[i][j]=0;
        				   m[i-k][j-k]=0;
        				   m[i-k-1][j-k-1]=3;
        			   }
        			   //king beyaz arka sol �apraz�nda king siyahla kar��la��rsa
        			   else if (m[i-k][j-k]==4 && m[i-k-1][j-k-1]==0 && (i-k)>=2 && (j-k)>=2){
        				   m[i][j]=0;
        				   m[i-k][j-k]=0;
        				   m[i-k-1][j-k-1]=3;
        			   }
        		   }
        		   }
        	   }
           }
           
           for (int i=1;i<=8;i++){
        	   for (int j=1;j<=8;j++){
        		   for (int k=1;k<=6;k++){
        		// e�er bulundu�un karede king siyah varsa
            		   if (m[i][j]==4){
            			//e�er king siyah �n sa� �apraz�nda beyazla kar��la��rsa
            			   if (m[i-k][j-k]==1 && m[i-k-1][j-k-1]==0 && (i-k)>=2 && (j-k)>=2){
            				   m[i][j]=0;
            				   m[i-k][j-k]=0;
            				   m[i-k-1][j-k-1]=4;
            			   }
        				   //king siyah �n sa� �apraz�nda king beyazla kar��la��rsa
            			   if (m[i-k][j-k]==3 && m[i-k-1][j-k-1]==0 && (i-k)>=2 && (j-k)>=2){
            				   m[i][j]=0;
            				   m[i-k][j-k]=0;
            				   m[i-k-1][j-k-1]=4;
            			   }
            			   //king siyah �n sol �apraz�nda beyazla kar��la��rsa
            			   else if (m[i+k][j-k]==1 && m[i+k+1][j-k-1]==0 && (j-k)>=2 && (i+k)<=7){
            				   m[i][j]=0;
            				   m[i+k][j-k]=0;
            				   m[i+k+1][j-k-1]=4;
            			   }
            			 //king siyah �n sol �apraz�nda king beyazla kar��la��rsa
            			   else if (m[i+k][j-k]==3 && m[i+k+1][j-k-1]==0 && (j-k)>=2 && (i+k)<=7){
            				   m[i][j]=0;
            				   m[i+k][j-k]=0;
            				   m[i+k+1][j-k-1]=4;
            			   }
            			   //king siyah arka sa� �apraz�nda beyazla kar��la��rsa
            			   else if (m[i-k][j+k]==1 && m[i-k-1][j+k+1]==0 && (j+k)<=7 && (i-k)>=2){
            				   m[i][j]=0;
            				   m[i-k][j+k]=0;
            				   m[i-k-1][j+k+1]=4;
            			   }
            			   //king siyah arka sa� �apraz�nda king beyazla kar��la��rsa
            			   else if (m[i-k][j+k]==3 && m[i-k-1][j+k+1]==0 && (j+k)<=7 && (i-k)>=2){
            				   m[i][j]=0;
            				   m[i-k][j+k]=0;
            				   m[i-k-1][j+k+1]=4;
            			   }
            			 //king siyah arka sol �apraz�nda beyazla kar��la��rsa
            			   else if (m[i+k][j+k]==1 && m[i+k+1][j+k+1]==0 && (i+k)<=7 && (j+k)<=7){
            				   m[i][j]=0;
            				   m[i+k][j+k]=0;
            				   m[i+k+1][j+k+1]=4;
            			   }
            			   //king siyah arka sol �apraz�nda king beyazla kar��la��rsa
            			   else if (m[i+k][j+k]==3 && m[i+k+1][j+k+1]==0 && (i+k)<=7 && (j+k)<=7){
            				   m[i][j]=0;
            				   m[i+k][j+k]=0;
            				   m[i+k+1][j+k+1]=4;
            			   }
            		   }
            		   }
            	   }
               }
               
        		
			
		List<Move> nextMoves = successors(m,1);
	}

	private static List<Move> successors(int[][]m , int i) {
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