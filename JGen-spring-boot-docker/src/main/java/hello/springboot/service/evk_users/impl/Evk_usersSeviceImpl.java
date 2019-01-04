package hello.springboot.service.evk_users.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import hello.springboot.dao.Evk_usersMapper;
import hello.springboot.model.Evk_users;
import hello.springboot.service.evk_users.Evk_usersService;

@Service(value = "evk_usersService")
public class Evk_usersSeviceImpl  implements Evk_usersService {

	@Autowired
	private Evk_usersMapper evk_usersMapper;
	
	@Override
	public int addEvk_users(Evk_users user) {
		return evk_usersMapper.insertSelective(user);
	}
	
	@Override
    public Evk_users findEvk_users(String userid) {
        Evk_users evk_users = evk_usersMapper.selectByPrimaryKey(userid);
        return evk_users;
    }
	
	@Override
	public PageInfo<Evk_users> findAllEvk_users(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Evk_users> userDomains = evk_usersMapper.selectAllEvk_users();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
	
	@Override
	public PageInfo<Evk_users> getAllEvk_users(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Evk_users> userDomains = evk_usersMapper.getEvk_users();
        PageInfo<Evk_users> result = new PageInfo<Evk_users>(userDomains);
        return result;
    }
}
