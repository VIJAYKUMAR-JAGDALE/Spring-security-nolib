package com.test.store.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.storemanagment.vo.ProductVo;
import com.test.store.dao.ProductOperationsDao;

@Component
public class ProductOperationsDaoImpl implements ProductOperationsDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addProduct(ProductVo bean) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			if(bean.getProductID()!=0)
			{
				session.update(bean);
			}else
			{
				session.saveOrUpdate(bean);
			}
		}catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}finally
		{
			transaction.commit();
			session.close();
		}
	}

	@Override
	public void updateProduct(ProductVo bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getAllProducts() {
		List productList = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try{
		transaction = session.beginTransaction();
		String hql = "FROM ProductVo vo order by vo.productID desc";
		Query query = session.createQuery(hql);
		productList = query.list();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productList;
	}

	@Override
	public List getProductDetails(int productID) {	
		List productList = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try{
		transaction = session.beginTransaction();
		String hql = "FROM ProductVo P where P.productID ="+productID;
		Query query = session.createQuery(hql);
		productList = query.list();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productList;
	}

	@Override
	public void deleteProduct(ProductVo bean) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(bean);
			transaction.commit();
		}catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}
}
