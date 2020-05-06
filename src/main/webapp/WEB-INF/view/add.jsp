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
<h5>酒店预订单</h5>
	
	<form action="addcreatedhome" method="post">
		
		<table class="table table-hover ">
			<tr>
				<td>预定日期 * </td>
				<td><input type="date" name="created" ></td>
			</tr>
			<tr>
				<td>姓名 * </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>手机 * </td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>房型 * </td>
				<td>
					<select name="hid" id="ht">
						
					</select>
				</td>
			</tr>
			 <tr>
				<td>价格 * </td>
				<td><input type="text" name="homePrice"></td>
			</tr>
			<tr>
				<td>备注</td>
				<td><textarea rows="2" cols="30" name="info"></textarea></td>
			</tr>
			<tr>
				<td colspan="100">
					<button class="btn btn-info">添加</button>
				</td>
			</tr>
		</table>
		
	</form>

<script type="text/javascript">

	$(function(){
		$.get(
			"queryHomeType",
			function(obj){
				for (var i = 0; i < obj.length; i++) {
					$("#ht").append("<option value='"+obj[i].id+"'>"+obj[i].homeType+"</option>")
				}
			}
		)
	})
</script>
</body>
</html>