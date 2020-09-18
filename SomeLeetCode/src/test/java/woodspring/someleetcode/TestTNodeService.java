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
	
	@Test
	public void testTNodeService() {
		tnodeService = new TNodeService();
		tnodeService.setInt( 50).setInt(15).setInt(75).setInt(7).setInt(60).setInt(5).setInt(99).setInt(21);
		tnodeService.doProcess();
		logger.info("the tree:{}", tnodeService.toString());
		assertNotNull(tnodeService.toString());
	}

	@Test
	public void testTNodeItr() {
		tnodeService = new TNodeService();
		tnodeService.setInt( 150).setInt(115).setInt(175).setInt(17).setInt(160).setInt(15).setInt(199).setInt(121);
		tnodeService.doProcess();
		logger.info("testTNodeItr tree:{}", tnodeService.toString());
		TNodeItr tnodeItr = new TNodeItr( tnodeService.getHead() );
		while ( tnodeItr.hasNext()) {
			logger.info(" TNodeItr node:{}", tnodeItr.next());
		}
		assertNotNull(tnodeService.toString());
		
		
	}
	
	@Test
	public void testTNodeItrWorstCase() {
		tnodeService = new TNodeService();
		tnodeService.setInt( 1001).setInt(1002).setInt(1003).setInt(1004).setInt(1005).setInt(1006).setInt(1).setInt(1007);
		tnodeService.doProcess();
		logger.info("testTNodeItr tree:{}", tnodeService.toString());
		TNodeItr tnodeItr = new TNodeItr( tnodeService.getHead() );
		while ( tnodeItr.hasNext()) {
			logger.info(" TNodeItr node:{}", tnodeItr.next());
		}
		assertNotNull(tnodeService.toString());
		
		
	}
}
