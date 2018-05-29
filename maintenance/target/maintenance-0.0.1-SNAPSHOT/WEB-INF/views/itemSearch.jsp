<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>

#conditions {
  width:900px;
  background-color: aqua;
  margin: 0 auto;
}
#container {
  margin: 0 auto;
}
</style>
</head>

<body>
  <div id="serachConditions">
    <form:form modelAttribute="itemSeaerchDto" action="${pageContext.request.contextPath}/search">
    <table id="conditions">
      <tr>
        <td>商品コード</td>
        <td><form:input path="itemCode" /></td>
        <td>商品名</td>
        <td><form:input path="itemName" /></td>
      </tr>
      <tr>
        <td colspan="4" align="center"><input type="submit" value="検索" name="検索" /></td>
      </tr>
    </table>
    </form:form>

    <form:form action="${pageContext.request.contextPath}/register">
      <input type="submit" value="新規登録" name="新規登録">
    </form:form>

  </div>
  <div id="">
    <table border="1" id="container">
      <tr>
        <th>商品コード</th>
        <th>商品名</th>
        <th>商品名（カナ）</th>
        <th>単価</th>
        <th>アルコール度数</th>
      </tr>
      <c:forEach items="${list}" var="row">
        <tr>
          <td><c:out value="${row.itemCode}" /></td>
          <td><c:out value="${row.itemName}" /></td>
          <td><c:out value="${row.itemKana}" /></td>
          <td><c:out value="${row.itemPrice}" /></td>
          <td><c:out value="${row.itemAlcoholPercentage}" /></td>
        <tr>
      </c:forEach>
    </table>
  </div>


</body>
</html>