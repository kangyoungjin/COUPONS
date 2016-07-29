package kr.pe.dk.serviceTest;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import kr.pe.dk.SpringTest;
import kr.pe.dk.service.UserService;
import kr.pe.dk.vo.UserVO;

public class UserServiceTest extends SpringTest {

	@Autowired
	UserService us;
	
	@Test
	public void insertTest() throws Exception{
		UserVO uv = new UserVO();
		uv.setUser_name("serviceTEST");
		uv.setUser_nick("serviceTest");
		uv.setUser_password("&&aaaa");
		uv.setUser_addr("경기도 성남시 분당구 삼평---");
		uv.setUser_email("redTiger@daum.net");
		uv.setUser_phone("010-3455-2754");
		uv.setUser_desc("음하하하 나는 침대위 어흥이다 . .!!!");
		uv.setUser_issys("N");
		us.regist(uv);
	}
	
}
