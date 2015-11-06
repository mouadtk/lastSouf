<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authentication var="usser" property="principal" />
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Page Home!
</h1>
<P>  Currrent user name :</P> ${user}
</body>
</html>