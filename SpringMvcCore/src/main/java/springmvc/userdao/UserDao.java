package springmvc.userdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.pogo.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	/*HibernateTemplate Object Inject Spring Container
	     so we have to Autowired it
	*/
	
	/*Transactional use for to give writing rigths to use
	 */
	
	@Transactional
	public int saveUser(User user) {
		// TODO Auto-generated method stub
		
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
