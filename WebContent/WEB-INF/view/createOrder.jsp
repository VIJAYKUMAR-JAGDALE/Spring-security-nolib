<html>
<head>
	<title>Welcome</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body>
<div id="wrapper" style="background-color: #D8C7C7;">
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Create New Order
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Create New Order
                            </li>
                        </ol>
                    </div>
                </div>
                <div class="col-lg-12">
                 <div><font size="4">Please Select Product from list:</font> <br></br>  </div>
                <form:form method="POST" commandName="orderBean" action="saveOrder">
                 <div class="table-responsive">
                            <table id="dataTables-example" class="table table-striped table-bordered"> 
                                <thead>
                                    <tr>
                                        <th align="center">Product Name</th>
                                        <th align="center">Quantity</th>
                                        <th align="center">Select</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="allProducts"  items="${allProducts}" begin="0" end="15">
                                    <tr>
											<td><c:out value="${allProducts.productName}" /></td>
									        <td align="center"><input type="text" size="5" name="${allProducts.productID}"></td>
									        <td align="center"><input type="checkbox" name="selectedProd" value="${allProducts.productID}"></td>	
									</tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                         <div><font size="4">Please Enter Remark</font> <br></br>  </div>
                        <div class="col-lg-12">
						   <form:textarea path="discription" class="form-control" name="discription" id="discription" placeholder="Enter discription"></form:textarea>
						</div>
						<br></br>
						<div>
							<input type="submit" value="Submit"
								id="submit" value="Submit" class="btn btn-info">&nbsp; 
								<input type="button" value="Save" class="btn btn-info">&nbsp;
							<input type="button" value="Cancel" class="btn btn-info">
						</div>
					</form:form>
                </div>
            </div>
        </div>
    </div>
    <script src="js/jquery.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
