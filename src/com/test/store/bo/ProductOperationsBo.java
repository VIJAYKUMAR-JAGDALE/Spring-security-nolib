package com.test.store.bo;

import java.util.List;

import com.bank.store.bean.ProductBean;

public interface ProductOperationsBo {
public void addProduct(ProductBean bean);
public void updateProduct(ProductBean bean);
public ProductBean getProductDetail(int productID);
public List getAllProducts();
public void deleteProduct(ProductBean bean);
}
