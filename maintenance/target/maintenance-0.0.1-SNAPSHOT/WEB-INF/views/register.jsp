<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head></head>

<body>

<form:form modelAttribute="itemDto" action="${pageContext.request.contextPath}/complete" >
  <form:input name="itemCode" path="itemCode" />
  <form:input name="itemName" path="itemName" />
  <input type="submit" value="登録">
</form:form>

</body>
</html>