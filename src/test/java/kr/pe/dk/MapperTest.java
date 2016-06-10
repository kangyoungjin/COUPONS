package kr.pe.dk;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class MapperTest extends SpringTest {
	
	@Inject
	SqlSessionFactory sf;
	
	@Test
	public void sfTest() throws Exception{
		SqlSession session = sf.openSession();
		log.info("---------------------------");
		log.info(session.selectOne("kr.pe.dk.mappers.Timmer.getTime"));
		log.info("---------------------------");
	}
	
}
