<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>Registration form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="resources/font-awesome/css/bootstrap-form-helpers.min.css" />
     <link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css" />
    <script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

<div class="page-header">
    <h1>Registration form</h1>
</div>
<!-- Registration form - START -->
<div class="container">
    <div class="row">
     <form:form method="POST" commandName="userRegistrationBean" action="addNewCustomer">  
            <div class="col-lg-4">
                <div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span>Required Field</strong></div>
                <div class="form-group">
                    <label for="InputName">Enter Name</label>
                    <div class="input-group">
                        <form:input path="firstName" class="form-control" name="firstName" id="firstName" placeholder="Enter Name"/>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputName">Enter last name</label>
                    <div class="input-group">
                        <form:input path="lastName" class="form-control" name="lastName" id="lastName" placeholder="Enter Name"/>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputName">Enter user Name</label>
                    <div class="input-group">
                        <form:input path="userName" class="form-control" name="userName" id="userName"  placeholder="Enter user name"/>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputName">Enter password Name</label>
                    <div class="input-group">
                        <form:input path="passWord" type="password" class="form-control" name="passWord" id="passWord" placeholder="Enter password" />
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputEmail">Enter Email</label>
                    <div class="input-group">
                        <form:input path="email" type="email" class="form-control" id="email" name="email"  placeholder="Enter Email"/>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputMessage">Enter Address</label>
                    <div class="input-group">
                        <form:textarea path="address" name="address" id="address" class="form-control" rows="5" ></form:textarea>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div> 
                <input type="submit" name="submit" id="submit" value="Submit" class="btn btn-info pull-right">
            </div>
        </form:form> 
    </div>
</div>
<!-- Registration form - END -->

</div>

</body>
</html>