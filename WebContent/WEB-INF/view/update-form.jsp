<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
	<title>List Customers</title>
	
</head>

<body>

<h1>Employee Form</h1>
	<form:form action="update" method="post" modelAttribute="employee">
    Employee ID : <form:input path="empID" />
    <form:errors path="empID" cssClass="error" />
		<br>
		<br>
    Name: <form:input path="Name" />
    <form:errors path="Name" cssClass="error" />
		<br>
		<br>
<button type="submit" class="btn btn-success">SAVE</button>
</form:form>

</body>

</html>









