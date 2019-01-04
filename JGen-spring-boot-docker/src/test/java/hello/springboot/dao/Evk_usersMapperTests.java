package hello.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import hello.springboot.dao.Evk_usersMapper;
import hello.springboot.model.Evk_users;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Evk_usersMapperTests {

	@Autowired 
	private Evk_usersMapper evk_usersMapper;
	
	@Test
	public void testsInsertSelective() throws Exception{
		Evk_users user=new Evk_users();
		user.setUserid("test");
		evk_usersMapper.insertSelective(user);
		
	}
}
