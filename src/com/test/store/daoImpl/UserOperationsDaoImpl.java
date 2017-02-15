package com.test.store.daoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.storemanagment.vo.UserRegistrationBean;
import com.storemanagment.vo.UserRoles;
import com.test.store.dao.UserOprationsDao;
@Component
public class UserOperationsDaoImpl implements UserOprationsDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public int addCustomer(UserRegistrationBean bean) {
		Session session = sessionFactory.openSession();
		System.out.println(session.isOpen());
		Transaction transaction = null;
		int result=0;
		try {
			transaction = session.beginTransaction();
			String hql = "Select userRole.role_id FROM UserRoles userRole WHERE userRole.role_name =:roleName";
			Query query = session.createQuery(hql);
			query.setParameter("roleName","ROLE_MB_ADMIN");
			List results = query.list();
			for (Iterator iterator = results.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				System.out.println(object);
			}
			UserRoles userRoles=new UserRoles();
			userRoles.setRoleName("Admin");
			userRoles.setEnabled(1);
			session.save(userRoles);
			bean.setActive("Y");
			/*bean.setRoles(userRoles);*/
			session.save(bean);
			transaction.commit();
			result=1;
			System.out.println("DONE!!!");
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
	public List getAllUsers()
	{
		Session session = sessionFactory.openSession();
		System.out.println(session.isOpen());
		Transaction transaction = null;
		List results=null;
		try {
			transaction = session.beginTransaction();
			String hql = "FROM UserRoles userRole WHERE userRole.role_name =:roleName";
			Query query = session.createQuery(hql);
			query.setParameter("roleName","ROLE_MB_ADMIN");
			results = query.list();
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return results;
	}
	@Override
	public List getAuthorities(String userName) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List authList=null;
		try {
			transaction = session.beginTransaction();
			String hql = "select ur.authorities from Users u, UserRoles ur , Roles r "+
                         "where u.userid = ur.userID and ur.roleID=r.roleID and r.enabled= ur.enabled and u.userName=:userName";
			Query query = session.createQuery(hql);
			query.setParameter("userName",userName);
			authList = query.list();
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return authList;
	}
}
