<html>
<body>
<h2>Welcome to help Page!</h2>
<%
String name = (String) request.getAttribute("name");
%>
<h2>Hello <%=name %>, how can I help you?</h2>
</body>
</html>