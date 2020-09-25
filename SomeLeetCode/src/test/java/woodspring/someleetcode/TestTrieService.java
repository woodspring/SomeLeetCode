package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import woodspring.someleetcode.entity.TrieNode;
import woodspring.someleetcode.service.impl.TrieService;

public class TestTrieService {
//	private static final Logger logger = LoggerFactory.getLogger( TestTrieService.class);
	
	@Test
	public void testPutNewTrieNode() {
		TrieService trie = new TrieService();
		boolean bRet = trie.insert("A");
//		bRet = trie.insert("ab");
//		assertTrue(bRet);
		bRet = trie.insert("AB");
		assertTrue(bRet);
//		bRet = trie.insert("ABbcdefg");
//		assertTrue(bRet);
		bRet = trie.insert("ABCDE");
		assertTrue(bRet);
		
		
		
		
		//bRet = trie.insert("ABMNO");
		//assertTrue(bRet);
		
//		TrieNode oneNode = trie.search( "AB");
		
//		System.out.println("result: theChar:"+oneNode.getTheChar()+" theIndex:"+ oneNode.getIndex());
//		assertNotNull( oneNode);
		
		//oneNode = trie.search( "ABCDE");
		//assertNotNull( oneNode);
		
	}

}
