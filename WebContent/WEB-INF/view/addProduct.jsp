<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper" style="background-color: #D8C7C7;">
		<div id="page-wrapper">
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Product Details</h1>
						<ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-edit"></i>Add Product</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->
				<div class="row">
			<form:form method="POST" commandName="productBean" action="addProduct">
				<div class="col-lg-3">
				 <div align="right">
				   <label>Enter Product Name:</label>
				 </div>
				 <br>
				 <div align="right">
				   <label>Product Description</label>
				 </div>
				 <br><br><br><br>
				 <div align="right">
				   <label>Select Product Type</label>
				 </div>
				</div>
					<div class="col-lg-3">
							<div>
							    <form:hidden path="productID" class="form-control" name="productID" id="productID"/>
							     <form:hidden path="operationType" class="form-control" name="operationType" id="operationType"/>
								 <form:input path="productName" class="form-control" name="productName" id="productName" placeholder="Enter Product Name"/>
							</div>
							 <br>
							<div class="form-group">
                                <form:textarea path="productInfo" class="form-control" rows="3"></form:textarea>
                            </div>
                            <div>
                                <form:select path="productType" class="form-control">
                                   <form:option value="${productBean.productType}"/>
                                    <option>Checkbook</option>
                                    <option>NoteBook</option>
                                    <option>Marker</option>
                                    <option>Pen</option>
                                    <option>withdrow slips</option>
                                     <option>deposit slips</option>
                                </form:select>
                            </div>
                            <br>
                            <div>
                               <input type="submit" value="${productBean.operationType}" id="submit" value="Submit" class="btn btn-info">&nbsp;
                               <input type="button" value="Cancel" class="btn btn-info">
                            </div>
					  </div>
					</form:form>
				</div>
		</div>
	</div>
	</div>
</body>
</html>