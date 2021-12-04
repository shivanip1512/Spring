package springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.dao.UserDao;
import springMVC.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		return this.userDao.save(user);
	}

}
