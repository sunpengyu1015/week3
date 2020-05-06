<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="createdhome" method="post">
		姓名:<input type="text" name="name" value="${vo.name}">
		手机:<input type="text" name="phone" value="${vo.phone}">
		房型:<input type="text" name="homeType" value="${vo.homeType}">
	 	房价:<input type="text" name="p1" value="${vo.p1}">--<input type="text" name="p2" value="${vo.p2}"> 
		预定日期:<input type="date" name="c1" value="${vo.c1}">--<input type="date" name="c2" value="${vo.c2}"> 
		<button class="btn btn-info btn-sm">查询</button>
		<table class="table table-hover  table-bordered"> 
			<tr>
				<td>预定日期</td>
				<td>姓名</td>
				<td>手机</td>
				<td>房型</td>
				<td>房价</td>
				<td>备注</td>
			</tr>
			<c:forEach items="${info.list}" var="h">
				<tr>
					<td> <fmt:formatDate value="${h.created}" pattern="yyyy-MM-dd"/> </td>
					<td>${h.name}</td>
					<td>${h.phone}</td>
					<td>${h.homeType}</td>
					<td>${h.homePrice}</td>
					<td>${h.info}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="100" >
					<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
				</td>
			</tr>
		</table>
		<input type="button" value="添加" onclick="add()">
</form>
<script type="text/javascript">

function goPage(pageNum){
	var name = $("[name='name']").val();
	var phone = $("[name='phone']").val();
	var homeType = $("[name='homeType']").val();
	
	location.href="createdhome?pageNum="+pageNum+"&name="+name+"&phone="+phone+"&homeType="+homeType;
}


function add(){
	location.href="add";
}
	
</script>
</body>
</html>