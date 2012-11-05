package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;
import com.sun.jersey.test.framework.spi.container.grizzly2.web.GrizzlyWebTestContainerFactory;


public class TDBTestTest extends JerseyTest {
	
	public TDBTestTest() throws Exception {
		super("test");
		
	}
	
	@Override
	protected TestContainerFactory getTestContainerFactory() {
		return new GrizzlyWebTestContainerFactory();
	}
	
	@Test
	public void testARQ() {
		WebResource ws = resource();
		String responseMsg = ws.path("test").get(String.class);
		assertEquals(
				"<html><title>Hello Jersey</title><body><h1>ARQ: 2.9.3</body></h1></html>",
				responseMsg);
	}
}
