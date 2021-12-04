<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h2>Welcome to help Page!</h2>
	<%-- <%
String name = (String) request.getAttribute("name");
%> --%>
	<h2>
		Hello
		<%-- <%=name %> --%>
		${name }, how can I help you?
	</h2>
	<hr>
	Marks : ${marks }
	
	<c:forEach var="mark" items="${marks }">
	<h2>${mark}</h2>
	</c:forEach>
</body>
</html>