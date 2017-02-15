package com.test.store.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.storemanagment.vo.ManageOrderVo;
import com.test.store.dao.ManageOrderDao;
@Component
public class ManageOrderDaoImpl implements ManageOrderDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public String saveOrder(ManageOrderVo manageOrderVo) {
		System.out.println("manageOrderVo"+manageOrderVo.getDiscription());
		/*Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(manageOrderVo);
		  }catch(Exception e)
			{
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			}finally
			{
				transaction.commit();
				session.close();
			}*/
		return null;
	}

}
