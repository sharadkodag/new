import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springorm.dao.UserDao;
import springorm.entity.User;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	
		UserDao userDao = ac.getBean("userDao", UserDao.class);
		
		User user = new User(3, "Sunil", "Jath");
		
		userDao.update(user);
		
		List<User> user2 = userDao.getAllUser();
		
		System.out.println(user2);
		
	}
}
