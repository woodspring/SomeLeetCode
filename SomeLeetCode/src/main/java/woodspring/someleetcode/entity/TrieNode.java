package woodspring.someleetcode.entity;

import java.util.concurrent.ConcurrentSkipListMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TrieNode {
	private static final Logger logger = LoggerFactory.getLogger( TrieNode.class);
	private static final int ALPHABET_SIZE = 26;
	private ConcurrentSkipListMap<Character, TrieNode> child = new ConcurrentSkipListMap<>();
	private String content;
	private boolean isWord = false;
	private int index;
	private char theChar;
	
	public TrieNode( String theStr, char aChar, int index) {
		this.content = theStr;
		this.theChar = aChar;
		this.index = index;
		isWord = true;
		this.child = new ConcurrentSkipListMap<>();
		
	}
	
	public TrieNode() {
		this.content = "";
		this.index=0;
		this.theChar='#';
	}
	
	
	public TrieNode findString(TrieNode currNode, String theString, int currPos) {
//	public boolean findString(TrieNode currNode, String theString, int currPos) {
		
		if ( !(currPos < theString.length())) return null;
		TrieNode nextNode =null;
		TrieNode theNode =null;
		boolean found = false;
		char oneChar = theString.charAt(currPos);
		logger.info( "findString: theStr:{}, currPos:{} oneChar:{}, this.char:{}", theString, currPos, oneChar, currNode.getTheChar());
		
		if (currNode.child().containsKey( oneChar) ) {
			nextNode = currNode.child().get( oneChar);
			logger.info( "                           findString: theStr:{}, currPos:{} oneChar:{}, nextNode.char:{}", theString, currPos, oneChar, nextNode.getTheChar());
			if ( (currPos +1 ) == theString.length()) {
				// finished search and found the string
				found = true;
				logger.info(" it is end search:currPos:{}, legnth:{}, theChar:{}, nextNode.theChar:{}", currPos, theString.length(), oneChar, nextNode.getTheChar());
				return nextNode; 
			}
			//if ( this.theChar != '#') currPos +=1;
			theNode = findString(nextNode, theString, ++currPos);
			if ( theNode == null) {
				logger.info("----> theChar:{} NOT FOUND", oneChar);
			}
			//TrieNode tmpNode = findString(nextNode, theString, ++currPos);
			//if ( tmpNode == null) {
				//logger.info( "findString: FOUND theStr:{}, currPos:{}, theNode.index:{} this.char:{}", theString, currPos, this.index, this.theChar);
				//return 
			//}// else 
		}  else {
			logger.info(" theChar:{} not found", oneChar); 
		}
		//	return this;
		if (found)
		   logger.info( "findString-99-: theStr:{}, currPos:{}, theNode.index:{} result.char:{}", theString, currPos, this.index, nextNode.theChar);
		else
			logger.info( "findString-9999-: theStr:{} NOT FOUND, currPos:{}", theString, currPos);
			
		return theNode;
	}
	
	public ConcurrentSkipListMap<Character, TrieNode>  child() {
		return this.child;
		
	}
	public void put(String theString, int currInd, int index) {
		char oneChar = theString.charAt( currInd);
		TrieNode aNode = new TrieNode(theString, oneChar, index);
		if ( this.insert( this, theString, currInd, index, aNode )) {
			logger.info( "put success string:{} size:{}, currInd:{}, index:{}", 
					theString, theString.length(), currInd, index);
		} else {
			logger.info( "put success string:{} size:{}, currInd:{}, index:{}", 
					theString, theString.length(), currInd, index);
			
		}
	}
	private TrieNode findChild(TrieNode currNode, char theChar) {
		if ( currNode == null) return null;
		
		return null;
	}
	
	public boolean insert(TrieNode currNode, String theString, int currInd, int index, TrieNode aNode) {
		boolean bRet = true;
		//if (currNode == null) return false;
		char oneChar = theString.charAt( currInd) ;
		logger.info( "insert  currNode string:{} size:{}, currInd:{}, index:{}, oneChar:{}", 
				theString, theString.length(), currInd, index, oneChar);
		TrieNode oneNode = null;
		if ( currNode.child().containsKey( oneChar)) {
			oneNode = currNode.child().get( oneChar);
			insert( oneNode, theString, ++currInd, index, aNode);		
		} else {
			// currNode NOT contain oneChar, 1. check end of word
			if ( (currInd+1) == theString.length() ) {
				logger.info( "insert  put it into currNode:{} ", oneChar); 
				currNode.child().put( oneChar,  aNode);
			} else {
				TrieNode nextNode = aNode;
				nextNode.setWord(false);
				nextNode.setTheChar( oneChar);
				currNode.child().put( oneChar, nextNode);
				nextNode = currNode.child().get( oneChar);
				if ( insert( nextNode, theString, ++currInd, index, aNode)) {
					logger.info("Will put:{} into child...", oneChar);
					//currNode.child().put( oneChar, nextNode);
				} else {
					logger.info("SOMETHONG WRONG...");
				}
			}
			
		}
		
		
		

		return bRet;
	}
	
	
	
	public boolean insert(String theString, int currInd, int index, TrieNode aNode) {
		boolean bRet = true;
		logger.info( "insert   string:{} size:{}, currInd:{}, index:{}, theChar:{}", 
				theString, theString.length(), currInd, index, theChar);
		Character theChar = theString.charAt( currInd);
		if ( this.child.containsKey( theChar )) {
			TrieNode theNode = this.child.get( theChar);
			logger.info( "insert ; theChar:{} existed:{};  string:{} currInd:{}, index:{}, theChar:{}", 
					theChar, this.index, theString, currInd, index, theChar);
			theNode.insert( theString, ++currInd, index, aNode);
			
		} else {
			// theChar not in child; add new into child
			logger.info( "insert string:{} currInd:{}, index:{}, theChar:{}", theString, currInd, index, theChar);
			if ( currInd < (theString.length()-1)) {
				//it is not end,
				TrieNode tempNode = aNode;
				tempNode.setWord(false);
				tempNode.setTheChar(theChar);
				this.child.put( theChar, tempNode);
				this.child.get( theChar).insert(theString, ++currInd, index, aNode);
			} else {
				this.child.put( theChar,  aNode);
			}
		}
		
		
		return bRet;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isWord() {
		return isWord;
	}
	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

	public char getTheChar() {
		return theChar;
	}

	public void setTheChar(char theChar) {
		this.theChar = theChar;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public String toString() {
		StringBuffer strBuf = new StringBuffer();
		strBuf.append(" theChar:"+ this.theChar+"  ");
		strBuf.append(" index:"+ this.index+"  ");
		strBuf.append(" child:{");
		if (! this.child.isEmpty()) {
			for (Character item : this.child.keySet()) {
				TrieNode aNode = this.child.get( item);
				strBuf.append(" item:"+ item);
				strBuf.append( " aNode.theChar:"+ aNode.getTheChar()+ " ");
				strBuf.append(" ->"+ aNode.toString());
				
			}
			
		} else {
			strBuf.append("EMPTY");
		}
		strBuf.append("}");
		return strBuf.toString();
	}
	
	

}
