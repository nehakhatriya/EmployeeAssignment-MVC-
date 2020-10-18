<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<style>
.error {
	color: red;
}
.text {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<title>Employee</title>
</head>

<body>
	<div class="container">
		<h4 style="text-align: center;">Employee Form</h4>
		<form:form action="employee" method="post" modelAttribute="employee">
    Employee ID : <br><form:input path="empID" cssClass="text"/>
			<form:errors path="empID" cssClass="error" />
			<br>
			<br>
    Employee Name: <br>  <form:input path="Name" cssClass="text"/>
			<form:errors path="Name" cssClass="error" />
			<br>
			<br>
			<button type="submit" class="btn btn-success" >ADD EMPLOYEE</button>
		</form:form>

		<h4 style="text-align: center;">Employees Registered</h4>

		<table class="table">
			<thead>
				<tr>
					<th scope="col"><a href="/HibernateMVC/app/employee?sort=id">ID</a></th>
					<th scope="col"><a href="/HibernateMVC/app/employee?sort=name">Name</a></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="temp" items="${employees}">
					<tr>
						<td>${temp.empID}</td>
						<td>${temp.name}</td>
						<td><a
							href="/HibernateMVC/app/employee/delete?empid=${temp.empID}">Delete</a></td>
						<td><a
							href="/HibernateMVC/app/employee/update?empid=${temp.empID}">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>