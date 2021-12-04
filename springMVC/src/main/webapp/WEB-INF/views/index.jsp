<html>
<body>
<h2>Welcome to home Page!</h2>
<%
String name = (String) request.getAttribute("name");
%>
<h1>How are you <%=name%>? </h1>
</body>
</html>