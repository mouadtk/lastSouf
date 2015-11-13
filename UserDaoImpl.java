package com.opm.snds.app.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opm.snds.app.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDAO  {

	
	@Autowired
	private SessionFactory HibernateSessFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.HibernateSessFactory = sf;
	}
	
	@Override
	public User findByUserName(String username) {
		Session session = HibernateSessFactory.getCurrentSession();
		Criteria crit = session.createCriteria(User.class);
		crit.add(Restrictions.eq("Username", username));
		crit.setMaxResults(1);	
		User  tmp =   (User) crit.uniqueResult();
		return tmp;
	}
}
