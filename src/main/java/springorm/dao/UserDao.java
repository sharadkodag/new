package springorm.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import springorm.entity.User;

public class UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insert(User user) {
		hibernateTemplate.save(user);
	}
	
	@Transactional()
	public void delete(User user) {
		hibernateTemplate.delete(user);
	}
	
	public User getUser(int id) {
		User user = hibernateTemplate.get(User.class, id);
		
		return user;
	}
	
	public List<User> getAllUser(){
		
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}
	
	@Transactional
	public void update(User user) {
		hibernateTemplate.update(user);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
