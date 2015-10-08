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

import com.opm.snds.app.model.Server;
import com.opm.snds.app.model.UserAccount;

@Repository
@Transactional
public class UserAccountDAOImpl implements UserAccountDAO{

static Logger LOGGER = LoggerFactory.getLogger(UserAccountDAOImpl.class);
	
	@Autowired
	private SessionFactory HibernateSessFactory;
	
	public void setSessionFactory(SessionFactory sf){
        this.HibernateSessFactory = sf;
    } 
	
	@Override
	public UserAccount getUSerByLogin(String login) {
		

		try{
			Session session = HibernateSessFactory.getCurrentSession();
			Criteria crit = session.createCriteria(UserAccount.class);
			crit.add(Restrictions.like("login", login));
			return  (UserAccount) crit.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
