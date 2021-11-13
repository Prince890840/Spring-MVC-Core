package springmvc.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import springmvc.pogo.User;
import springmvc.userdao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/*userDao Object Inject Spring Container
    	so we have to Autowired it
	 */
	
	@Transactional
	public int createUser(User user) {
		// TODO Auto-generated method stub
	
		return this.userDao.saveUser(user);
	}

}
