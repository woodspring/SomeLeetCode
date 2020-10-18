package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.service.impl.TNodeItr;
import woodspring.someleetcode.service.impl.TNodeService;

public class TestTNodeService {
	private final static Logger logger = LoggerFactory.getLogger( TestTNodeService.class);
	
	private TNodeService tnodeService;
	
//	@Test
//	public void testTNodeService() {
//		tnodeService = new TNodeService();
//		tnodeService.setInt( 50).setInt(15).setInt(75).setInt(7).setInt(60).setInt(5).setInt(99).setInt(21);
//		tnodeService.doProcess();
//		logger.info("the tree:{}", tnodeService.toString());
//		assertNotNull(tnodeService.toString());
//	}
//
//	@Test
//	public void testTNodeItr() {
//		tnodeService = new TNodeService();
//		tnodeService.setInt( 150).setInt(115).setInt(175).setInt(17).setInt(160).setInt(15).setInt(199).setInt(121);
//		tnodeService.doProcess();
//		logger.info("testTNodeItr tree:{}", tnodeService.toString());
//		TNodeItr tnodeItr = new TNodeItr( tnodeService.getHead() );
//		while ( tnodeItr.hasNext()) {
//			logger.info(" TNodeItr node:{}", tnodeItr.next());
//		}
//		assertNotNull(tnodeService.toString());
//		
//		
//	}
//	
//	@Test
//	public void testTNodeItrWorstCase() {
//		tnodeService = new TNodeService();
//		tnodeService.setInt( 1001).setInt(1002).setInt(1003).setInt(1004).setInt(1005).setInt(1006).setInt(1).setInt(1007);
//		tnodeService.doProcess();
//		logger.info("testTNodeItr tree:{}", tnodeService.toString());
//		TNodeItr tnodeItr = new TNodeItr( tnodeService.getHead() );
//		while ( tnodeItr.hasNext()) {
//			logger.info(" TNodeItr node:{}", tnodeItr.next());
//		}
//		assertNotNull(tnodeService.toString());
//		
//		
//	}
	
	@Test
	public void testTNodeFindLeaves() {
		tnodeService = new TNodeService();
		//tnodeService.setInt( 150).setInt(115).setInt(175).setInt(17).setInt(160).setInt(15).setInt(199).setInt(121);
		//tnodeService.setInt( 1150).setInt(2115).setInt(3175).setInt(917).setInt(6160).setInt(215).setInt(7199).setInt(21);
		//tnodeService.setInt( 1).setInt(11).setInt(17).setInt(37).setInt(26).setInt(55).setInt(19).setInt(12);
		tnodeService.setInt( 9).setInt(1).setInt(99).setInt(66).setInt(100);
		tnodeService.doProcess();
		logger.info("testTNodeItr tree:{}", tnodeService.toString());
		TNodeItr tnodeItr = new TNodeItr( tnodeService.getHead() );
		while ( tnodeItr.hasNext()) {
			logger.info(" TNodeItr node:{}", tnodeItr.next());
		}
		assertNotNull(tnodeService.toString());
		logger.info("==================================");
		String result = tnodeService.findAllLeaves();
		logger.info("findLeaves:{}", result);
		assertNotNull(result.toString());
	}
}
