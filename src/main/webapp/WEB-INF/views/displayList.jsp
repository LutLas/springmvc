<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="io.erehsawsaltul.springmvc.dto.Employee, java.util.List"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Employees</title>
</head>
<body>

<% 
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	for(Employee e:employees){
		out.println("ID: "+e.getId());
		out.println("Name: "+e.getName());
	}
%>

	<c:forEach items="${employees}" var="item">
${item}<br>
	</c:forEach>

</body>
</html>