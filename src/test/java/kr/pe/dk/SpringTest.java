package kr.pe.dk;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/**/*-context.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class SpringTest {

	protected Logger log = Logger.getLogger(this.getClass());
	
	@Inject
	String str;
	
	@Test
	public void test() throws Exception{
		log.info("----------------------------");
		log.info(str);
		log.info("----------------------------");
	}
}