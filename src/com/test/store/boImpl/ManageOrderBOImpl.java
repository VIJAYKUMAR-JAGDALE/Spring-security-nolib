package com.test.store.boImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.store.bean.OrderBean;
import com.storemanagment.vo.ManageOrderVo;
import com.test.store.bo.ManageOrderBO;
import com.test.store.dao.ManageOrderDao;
@Component
public class ManageOrderBOImpl implements ManageOrderBO{
	@Autowired
	 private ManageOrderDao manageOrderDao;
	@Override
	public String saveOrder(OrderBean orderBean) {
		ManageOrderVo manageOrderVo=new ManageOrderVo();
		manageOrderVo.setSelectedProducts(orderBean.getSelectedProducts());
		manageOrderVo.setDiscription(orderBean.getDiscription());
		manageOrderVo.setBranchId(orderBean.getBranchId());
		manageOrderVo.setIsReviewed(orderBean.getIsReviewed());
		manageOrderVo.setActive(orderBean.getActive());
		manageOrderVo.setStatus(orderBean.getStatus());
		manageOrderVo.setCreatedBy(orderBean.getCreatedBy());
		manageOrderVo.setCreateDate(orderBean.getCreateDate());
		manageOrderVo.setChangedBy(orderBean.getChangedBy());
		manageOrderVo.setChangedDate(orderBean.getChangedDate());
		manageOrderDao.saveOrder(manageOrderVo);
		return "Test";
	}

}
