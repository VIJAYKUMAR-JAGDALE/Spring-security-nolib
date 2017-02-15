package com.bank.store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.store.bean.ProductBean;
import com.test.store.bo.ProductOperationsBo;

@Controller
public class ProductOperations {
	@Autowired
	ProductOperationsBo productOperationsBo;
	
	@RequestMapping("/products")
	public ModelAndView  viewProducts(Model model,HttpServletRequest request, HttpServletResponse resonse) 
	{		
    	List allProducts;
    	allProducts=productOperationsBo.getAllProducts();
    	model.addAttribute("allProducts",allProducts);
		return new ModelAndView("viewProducts");
	}

	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(@ModelAttribute ProductBean productBean,HttpServletRequest request,Model model)
	{
		 System.out.println("---"+productBean.getOperationType());
		if(null!=productBean.getOperationType() && productBean.getOperationType().equalsIgnoreCase("DELETE"))
		{
			  productOperationsBo.deleteProduct(productBean);
		}else
		{
           productOperationsBo.addProduct(productBean);
		}
        List allProducts;
        allProducts=productOperationsBo.getAllProducts();
    	model.addAttribute("allProducts",allProducts);
		return new ModelAndView("viewProducts");
	}
	@RequestMapping(value = "/editProduct")
	public ModelAndView editProduct(HttpServletRequest request)
	{
		ProductBean productBean=new ProductBean();
		if(null!=request.getParameter("productId"))
		{
           productBean=productOperationsBo.getProductDetail(Integer.parseInt(request.getParameter("productId")));
		}
		System.out.println(request.getParameter("type"));
		productBean.setOperationType(request.getParameter("type"));
       return new ModelAndView("addProduct","productBean",productBean);
	}
	@RequestMapping(value = "/deleteProduct")
	public ModelAndView deleteProduct(HttpServletRequest request,Model model)
	{
		ProductBean productBean=new ProductBean();
        productOperationsBo.deleteProduct(productBean);
		List allProducts;
		allProducts=productOperationsBo.getAllProducts();
    	model.addAttribute("allProducts",allProducts);
		return new ModelAndView("viewProducts");
	}
}
