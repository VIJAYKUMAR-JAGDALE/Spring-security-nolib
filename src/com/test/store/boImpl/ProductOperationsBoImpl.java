package com.test.store.boImpl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.store.bean.ProductBean;
import com.storemanagment.vo.ProductVo;
import com.test.store.bo.ProductOperationsBo;
import com.test.store.dao.ProductOperationsDao;
@Component
public class ProductOperationsBoImpl implements ProductOperationsBo{
    @Autowired
	 private ProductOperationsDao operationsDao;
	@Override
	public void addProduct(ProductBean bean) {
		ProductVo productVo=new ProductVo();
		productVo.setProductID(bean.getProductID());
		productVo.setProductName(bean.getProductName());
		productVo.setProductInfo(bean.getProductInfo());
		productVo.setProductType(bean.getProductType());
		if(bean.getProductID()!=0)
		{
			productVo.setCreatedDate(new Date());
			productVo.setCreatedBy(1);
			productVo.setChangedBy(1);
		}else
		{
			productVo.setChangedDate(new Date());
			productVo.setChangedBy(1);
		}
		operationsDao.addProduct(productVo);
	}

	@Override
	public void updateProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getAllProducts() {
		return operationsDao.getAllProducts();
	}

	@Override
	public ProductBean getProductDetail(int productID) {
		ProductBean bean=new ProductBean();
		List productDetails=operationsDao.getProductDetails(productID);
		for (Iterator iterator = productDetails.iterator(); iterator.hasNext();) {
			ProductVo productVo = (ProductVo) iterator.next();
			bean.setProductID(productVo.getProductID());
			bean.setProductName(productVo.getProductName());
			bean.setProductInfo(productVo.getProductInfo());
			bean.setProductType(productVo.getProductType());
		}
		return bean;
	}

	@Override
	public void deleteProduct(ProductBean bean) {
		ProductVo productVo=new ProductVo();
		productVo.setProductID(bean.getProductID());
		productVo.setProductName(bean.getProductName());
		productVo.setProductInfo(bean.getProductInfo());
		productVo.setProductType(bean.getProductType());
		operationsDao.deleteProduct(productVo);
		
	}

}
