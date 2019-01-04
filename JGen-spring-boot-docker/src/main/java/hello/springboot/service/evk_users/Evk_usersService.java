package hello.springboot.service.evk_users;

import com.github.pagehelper.PageInfo;

import hello.springboot.model.Evk_users;

public interface Evk_usersService {

	int addEvk_users(Evk_users user);

	Evk_users findEvk_users(String userid);

	PageInfo<Evk_users> findAllEvk_users(int pageNum, int pageSize);

	PageInfo<Evk_users> getAllEvk_users(int pageNum, int pageSize);

}
