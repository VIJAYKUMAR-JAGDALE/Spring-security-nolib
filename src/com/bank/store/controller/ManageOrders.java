package com.bank.store.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.store.bean.OrderBean;
import com.test.store.bo.ManageOrderBO;
import com.test.store.bo.ProductOperationsBo;
@Controller
public class ManageOrders {
	@Autowired
	ProductOperationsBo productOperationsBo;
	@Autowired
	ManageOrderBO manageOrderBO;
	@RequestMapping(value = "/createNewOrder")
	private ModelAndView createOrder(ModelAndView modelAndView,Model model)
	{
		    List allProducts;
	    	allProducts=productOperationsBo.getAllProducts();
	    	model.addAttribute("allProducts",allProducts);
	    	model.addAttribute(new OrderBean());
  		    return new ModelAndView("createOrder");
	}
	
	@RequestMapping(value = "/saveOrder")
	private ModelAndView saveOrder(@ModelAttribute OrderBean orderBean,ModelAndView modelAndView,Model model,HttpServletRequest request, HttpServletResponse resonse)
	{
		   String[] selectedProducts=orderBean.getSelectedProd();
		   Map<Integer, Integer> selectedProductQuantityMap=new HashedMap();
		   for (int i = 0; i < selectedProducts.length; i++) {
			String quantity=request.getParameter(selectedProducts[i]);
			System.out.println(quantity+"Product:"+selectedProducts[i]);
			selectedProductQuantityMap.put(Integer.parseInt(selectedProducts[i]),Integer.parseInt(quantity));
		}
		   orderBean.setSelectedProducts(selectedProductQuantityMap);
		   orderBean.setCreatedBy(1);
		   manageOrderBO.saveOrder(orderBean);
  		   return new ModelAndView("createOrder");
	}
}
