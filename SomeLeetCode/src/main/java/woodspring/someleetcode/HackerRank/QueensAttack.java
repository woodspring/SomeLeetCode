package woodspring.someleetcode.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueensAttack {
private final static Logger logger = LoggerFactory.getLogger(QueensAttack.class );
	public List<String> findQueensAttach(List<String> attList) {
		List<String> retList = new ArrayList<>();
		List<Integer> theValue = Arrays.asList( attList.get(0).split(" ")).stream().map( item -> Integer.parseInt(item)).collect(Collectors.toList());
		int boardSize = theValue.get(0);
		if ( boardSize == 0 || boardSize > 100000) return retList;
		int obstackSize = theValue.get(1);
		char[][] boardM = new char[boardSize+1][boardSize+1];
		for ( int indX =0; indX < (boardSize+1); indX++) 
			for ( int indY=0; indY < (boardSize+1); indY++) {
				boardM[indX][indY] = '0';
			}
		List<Integer> queenPos  = Arrays.asList( attList.get(1).split(" ")).stream().map( item -> Integer.parseInt(item)).collect(Collectors.toList());
		List<String> obstackList = new ArrayList<>();
		for ( int ind = 2; ind < attList.size(); ind++) {
			 List<Integer> intList = Arrays.asList( attList.get(ind).split(" ")).stream().map(item -> Integer.parseInt(item)).collect(Collectors.toList());
			 boardM[ intList.get(0)][intList.get(1)] = 'X';
		}
		boardM[ queenPos.get(0)][queenPos.get(1)] = 'Q';
		int count = indexQueen( boardM,  queenPos.get(0),  queenPos.get(1), retList);
		logger.info("attackCount:{}  list:{}", count, retList);
		return retList;
	}
	
	public int indexQueen(char[][] theBoard, int posX, int posY, List<String> posList) {
		int attackCount =0;		
		int lenB = theBoard.length;
		
		//if ( 1 > posX || (posX > (lenB+1)) || 1 > posY || posY > (lenB+1) ||
		//	 '0' == theBoard[posX][posY]) return -1;
		//theBoard[posX][posY] = '1';
		
		for ( int indY =1; indY < lenB; indY++) { 
			if ( posY == indY) continue;
			if ( '0' == theBoard[posX][ indY] ) {
				posList.add(String.format("%d %d", posX, indY));
				theBoard[posX][ indY] = '1';
				attackCount++;				
			}
		}
		
		for( int indX =1; indX < lenB; indX ++) {
			if ( posX == indX) continue;
			if ( '0' == theBoard[indX][posY]) {
				posList.add( String.format("%d %d",  indX, posY));
				theBoard[indX][posY] = '1';
				attackCount++;
			}
		}
		int posMax = Math.max( posX,  posY);
//		int indX1 =0; indY1=0;
//		int indX2 =0; indY2=0;
//		int indX3 =0; indY3=0;
//		int indX4 =0; indY4=0;
		for ( int ind =1; ind <= lenB; ind++)  {
			if ( ( 0 < (posX -ind)) && (0 < (posY - ind))) {
				if ( '0' == theBoard[posX-ind][posY-ind]) {
					posList.add(String.format("%d %d", (posX-ind), (posY - ind)));
					theBoard[posX-ind][posY-ind] = '1';
					attackCount++;
				}
			}
			if ( (0 < (posX -ind)) && (lenB >  (posY + ind))) {
				logger.info(" second; ind{}  lenB:{} posX:{} posY:{}, posX-:{} posY+:{}", ind, lenB, posX, posY, posX-ind,posY+ind );
				if ( '0' == theBoard[posX-ind][posY+ind]) {
					posList.add(String.format("%d %d", (posX-ind), (posY + ind)));
					theBoard[posX-ind][posY+ind] = '1';
					attackCount++;
				}
			}
			if ( (lenB >  (posX +ind)) && (lenB > (posY + ind))) {
				if ( '0' == theBoard[posX+ind][posY+ind]) {
					posList.add(String.format("%d %d", (posX+ind), (posY + ind)));
					theBoard[posX+ind][posY+ind] = '1';
					attackCount++;
				}
			}
			if ( (lenB > (posX +ind)) && ( 0 > (posY - ind))) {
				if ( '0' == theBoard[posX+ind][posY-ind]) {
					posList.add(String.format("%d %d", (posX+ind), (posY - ind)));
					theBoard[posX+ind][posY-ind] = '1';
					attackCount++;
				}
			}
			
		}
		return attackCount;

	}
}
