<%@ page language="java" contentType="text/html; charset=Utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function addCart(){
	var name=document.getElementById("name").value;
	alert(name);
}
</script>
<body>
<h1>商品列表</h1>
	<table border="2">
		<tr>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="goods" varStatus="vs">
			<tr>
				<td >${goods.goodsName} <input type="hidden" value="${goods.goodsName}"> </td>
				<td>${goods.goodsPrice }<input type="hidden" value="${goods.goodsPrice }"> </td>
				<td><a href="addCart?goodsname=${goods.goodsName}&price=${goods.goodsPrice}">添加到购物车></td>
			</tr>
		</c:forEach>
	</table>
	<a href="allCart.jsp">查看购物车</a>
</body>
</html>