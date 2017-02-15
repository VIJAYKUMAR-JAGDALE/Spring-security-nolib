<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
<div id="wrapper" style="background-color: #D8C7C7;">
		<div id="page-wrapper">
              <div class="col-lg-12">
                        <h2>Products</h2>
                          <a href="editProduct?type=ADD"> ADD NEW PRODUCT</a>
                        <div class="table-responsive">
                            <table id="dataTables-example" class="table table-striped table-bordered"> 
                                <thead>
                                    <tr>
                                        <th>Product Name</th>
                                        <th>Description</th>
                                        <th>Type</th>
                                        <th>Edit</th>
                                        <th>Delete</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="allProducts"  items="${allProducts}" begin="0" end="15">
                                    <tr>
											<td><c:out value="${allProducts.productName}" /></td>
											<td><c:out value="${allProducts.productInfo}" /></td>
											<td><c:out value="${allProducts.productType}" /></td>
											<td><a href="editProduct?productId=${allProducts.productID}&type=Update"">Edit</a></td>
											<td><a href="editProduct?productId=${allProducts.productID}&type=Delete">Delete</a></td>
										</tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
			</div>
			</div>
			</div>
</body>
</html>