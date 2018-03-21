package org.sshTP1.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sshTP1.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{

	@Resource
	private SessionFactory sf;
	
	public List<T> selectAll(String hql) {
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		List list = query.list();
		return list;
	}

	public void add(T t) {
		Session session = sf.getCurrentSession();
		session.save(t);
		
	}

	public void delete(T t) {
		Session session = sf.getCurrentSession();
		session.delete(t);		
	}

	public void update(T t) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(t);		
	}

	public List<T> selectBySql(String sql, T t) {
		Session session = sf.getCurrentSession();
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(t.getClass());
		List list = query.list();
		return list;
	}

}
