package com.test.store.dao;

import java.util.List;

import com.storemanagment.vo.ProductVo;

public interface ProductOperationsDao {
	public void addProduct(ProductVo bean);
	public void updateProduct(ProductVo bean);
	public List getProductDetails(int productID);
	public List getAllProducts();
	public void deleteProduct(ProductVo bean);
}
