package kr.pe.dk.mapperTest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import kr.pe.dk.SpringTest;
import kr.pe.dk.mappers.UserMapper;
import kr.pe.dk.vo.CriteriaVO;
import kr.pe.dk.vo.UserVO;

/**
 * @author deva
 * @insert Test 
 * 
 */
public class UserMapperTest extends SpringTest {
	
	@Inject
	UserMapper umo;
	
	/*	
  	@Test
	public void insertTest() throws Exception{
		UserVO uv = new UserVO();
		uv.setUser_name("어흥");
		uv.setUser_nick("침대위어흥");
		uv.setUser_password("*8888");
		uv.setUser_addr("경기도 성남시 분당구 삼평");
		uv.setUser_email("redTiger@daum.net");
		uv.setUser_phone("010-3455-2754");
		uv.setUser_desc("음하하하 나는 침대위 어흥이다 . .!!!");
		uv.setUser_issys("N");
		umo.create(uv);
	}
	*/
	@Test
	public void listTest() throws Exception{
		CriteriaVO cvo = new CriteriaVO();
		List<UserVO> ulist = new ArrayList<UserVO>();
		
		String[] type = {"user_addr"};
		cvo.setPage(2);
		cvo.setType(type);
		cvo.setKeyword("서울");
		
		log.info("----------------------------------");
		ulist = umo.list(cvo);
		log.info(ulist.toString());
		log.info("----------------------------------");
	}
	
}
