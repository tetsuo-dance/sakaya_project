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
<center><h2>以下の値で更新します。よろしいですか？</h2></center>
  <div id="">
    <table border="1" id="container">
      <tr>
        <th>商品コード</th>
        <th>商品名</th>
        <th>商品名（カナ）</th>
        <th>単価</th>
        <th>アルコール度数</th>
      </tr>
        <tr>
         <form:form modelAttribute="itemConfirmDto" action="${pageContext.request.contextPath}/updateComplete" >
          <td><form:input name="itemCode" path="itemCode" readonly="true"/></td>
          <td><form:input name="itemName" path="itemName" readonly="true"/></td>
          <td><form:input name="itemKana" path="itemKana" readonly="true"/></td>
          <td><form:input name="itemPrice" path="itemPrice" readonly="true"/></td>
          <td><form:input name="itemAlcoholPercentage" path="itemAlcoholPercentage" readonly="true"/></td>
          <td><input type="submit" value="登録"></td>
         </form:form>
        <tr>
    </table>
  </div>

</body>
</html>